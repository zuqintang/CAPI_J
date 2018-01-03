package com.goodwill.util;

import org.apache.commons.fileupload.disk.DiskFileItem;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.multipart.commons.CommonsMultipartFile;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.text.DecimalFormat;
import java.util.*;

/**
 * 导入excel
 */
@SuppressWarnings("all")
public class ImportExcel {
    /**
     * 总行数
     */
    private int totalRows = 0;
    /**
     * 总列数
     */
    private int totalCells = 0;
    /**
     * 错误信息
     */
    private String errorInfo;
    /**
     * 一个临时路径
     */
    private final static String temppath = "/importExcel/";

    DecimalFormat df = new DecimalFormat("0");

    public int getTotalRows() {
        return totalRows;
    }

    public int getTotalCells() {
        return totalCells;
    }

    public String getErrorInfo() {
        return errorInfo;
    }

    /**
     * 校验是否为excel格式和检查文件是否存在
     *
     * @param filePath 文件名称
     * @return
     */
    public boolean validateExcel(String filePath) {
        if (filePath == null || !(isExcel2003(filePath) || isExcel2007(filePath))) {
            errorInfo = "文件名不是excel格式";
            return false;
        }
        /** 检查文件是否存在 */
        File file = new File(filePath);
        if (file == null || !file.exists()) {
            errorInfo = "文件不存在";
            return false;
        }
        return true;
    }

    /**
     * 根据文件名读取excel文件
     *
     * @param filePath
     * @return
     */
    public List<Object> read(String filePath) {
        List<Object> dataLst = new ArrayList<Object>();
        InputStream is = null;
        try {
            /** 验证文件是否合法 */
            if (!validateExcel(filePath)) {
                System.out.println(errorInfo);
                return null;
            }
            /** 判断文件的类型，是2003还是2007 */
            boolean isExcel2003 = true;
            if (isExcel2007(filePath)) {
                isExcel2003 = false;
            }
            /** 调用本类提供的根据流读取的方法 */
            File file = new File(filePath);
            is = new FileInputStream(file);
            dataLst = read(is, isExcel2003);
            is.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            if (is != null) {
                try {
                    is.close();
                } catch (IOException e) {
                    is = null;
                    e.printStackTrace();
                }
            }
        }
        /** 返回最后读取的结果 */
        return dataLst;
    }

    /**
     * 根据流读取Excel文件
     *
     * @param inputStream
     * @param isExcel2003
     * @return
     */
    public List<Object> read(InputStream inputStream, boolean isExcel2003) {
        List<Object> dataLst = null;
        try {
            /** 根据版本选择创建Workbook的方式 */
            Workbook wb = null;
            if (isExcel2003) {
                wb = new HSSFWorkbook(inputStream);
            } else {
                wb = new XSSFWorkbook(inputStream);
            }
            dataLst = read(wb);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return dataLst;

    }

    /**
     * 读取数据
     *
     * @param wb
     * @return
     */
    private List<Object> read(Workbook wb) {
        List<Object> dataLst = new ArrayList<Object>();
        /** 得到第一个shell */
        Sheet sheet = wb.getSheetAt(0);
        /** 得到Excel的行数 */
        this.totalRows = sheet.getPhysicalNumberOfRows();
        /** 得到Excel的列数 */
        if (this.totalRows >= 1 && sheet.getRow(0) != null) {
            this.totalCells = sheet.getRow(0).getPhysicalNumberOfCells();
        }
        /**Excel第一行做特殊处理*/
        Row titleRow = sheet.getRow(0);
        Map<String, Integer> map = new HashMap<String, Integer>();
        for (int c = 0; c < this.getTotalCells(); c++) {
            Cell cell = titleRow.getCell(c);
            String title = cell.getStringCellValue();
            map.put(title, c);
        }
        dataLst.add(map);
        /** 循环Excel的行 */
        for (int r = 1; r < this.totalRows; r++) {
            Row row = sheet.getRow(r);
            if (row == null) {
                continue;
            }
            List<String> rowLst = new ArrayList<String>();
            /** 循环Excel的列 */
            for (int c = 0; c < this.getTotalCells(); c++) {
                Cell cell = row.getCell(c);
                String cellValue = "";
                if (null != cell) {
                    // 以下是判断数据的类型
                    switch (cell.getCellType()) {
                        case HSSFCell.CELL_TYPE_NUMERIC: // 数字
                            //数字总是当成double来处理
                            cellValue = df.format(cell.getNumericCellValue());
                            break;
                        case HSSFCell.CELL_TYPE_STRING: // 字符串
                            cellValue = cell.getStringCellValue();
                            break;
                        case HSSFCell.CELL_TYPE_BOOLEAN: // Boolean
                            cellValue = cell.getBooleanCellValue() + "";
                            break;
                        case HSSFCell.CELL_TYPE_FORMULA: // 公式
                            cellValue = cell.getCellFormula() + "";
                            break;
                        case HSSFCell.CELL_TYPE_BLANK: // 空值
                            cellValue = "";
                            break;
                        case HSSFCell.CELL_TYPE_ERROR: // 故障
                            cellValue = "非法字符";
                            break;
                        default:
                            cellValue = "未知类型";
                            break;
                    }
                }
                rowLst.add(cellValue);
            }
            /** 保存第r行的第c列 */
            dataLst.add(rowLst);
        }
        return dataLst;
    }


    /**
     * 校验excel文件是否为2003
     *
     * @param filePath 文件名称
     * @return
     */
    public static boolean isExcel2003(String filePath) {
        return filePath.matches("^.+\\.(?i)(xls)$");
    }

    /**
     * 校验文件是否为2007
     *
     * @param filePath 文件名称
     * @return
     */
    public static boolean isExcel2007(String filePath) {
        return filePath.matches("^.+\\.(?i)(xlsx)$");
    }

    /**
     * 保存excel上传的文件到本机
     *
     * @param request
     * @return
     */
    public static String saveExcelFile(HttpServletRequest request) {
        CommonsMultipartResolver multipartResolver = new CommonsMultipartResolver(request.getSession().getServletContext());
        String filepath = null;
        if (multipartResolver.isMultipart(request)) {
            //再将request中的数据转化成multipart类型的数据
            MultipartHttpServletRequest multiRequest = (MultipartHttpServletRequest) request;
            Iterator iter = multiRequest.getFileNames();
            while (iter.hasNext()) {
                MultipartFile file = multiRequest.getFile((String) iter.next());
                if (file != null) {
                    try {
                        String rootPath = PropertiesHelper.getInstance().getProperty("filepath");
                        //文件名+系统时间（防止重名）
                        String path = rootPath + temppath + String.valueOf(System.currentTimeMillis()) + file.getOriginalFilename();//这里先写一个位置
                        File localFile = new File(path);
                        if (!localFile.getParentFile().exists()) {
                            //如果目标文件所在的目录不存在，则创建父目录
                            localFile.getParentFile().mkdirs();
                        }
                        //转成file类型
                        CommonsMultipartFile cf = (CommonsMultipartFile) file;
                        DiskFileItem fi = (DiskFileItem) cf.getFileItem();
                        File f = fi.getStoreLocation();
                        InputStream is = new FileInputStream(f);
                        OutputStream os = new FileOutputStream(path);
                        byte buffer[] = new byte[8192];
                        int count = 0;
                        while ((count = is.read(buffer)) > 0) {
                            os.write(buffer, 0, count);
                        }
                        os.close();
                        is.close();
                        filepath = path;
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        }
        return filepath;
    }

    /**
     * 弹出下载框下载
     *
     * @param path     下载文件的路径
     * @param response 响应
     */
    public static void download(String path, HttpServletResponse response) throws Exception {
        File file = new File(path);
        if (file != null) {
            download(path, file.getName(), response);
        }
    }

    /**
     * 弹出下载框下载
     *
     * @param path     文件路径
     * @param filename 文件名称
     * @param response 响应
     * @throws Exception
     */
    public static void download(String path, String filename, HttpServletResponse response) throws Exception {
        try {
            File file = new File(path);
            // 以流的形式下载文件。
            response.addHeader("Content-Disposition", "attachment;filename="
                    + new String(filename.getBytes("gbk"), "iso-8859-1")); // 转码之后下载的文件不会出现中文乱码
            response.addHeader("Content-Length", "" + file.length());
            OutputStream ot = response.getOutputStream();
            BufferedInputStream bis = new BufferedInputStream(new FileInputStream(file));
            BufferedOutputStream bos = new BufferedOutputStream(ot);
            byte[] buffer = new byte[4096];
            int length = 0;
            while ((length = bis.read(buffer)) > 0) {
                bos.write(buffer, 0, length);
            }
            bos.close();
            bis.close();
            ot.close();
        } catch (IOException ex) {
            ex.printStackTrace();
            throw ex;
        }
    }
}

