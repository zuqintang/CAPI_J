package com.goodwill.util;

import org.apache.poi.hssf.usermodel.*;
import org.apache.poi.hssf.util.HSSFColor;

import java.io.IOException;
import java.io.OutputStream;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 排序导出的excel(解决了导出的excel不能随意定义列的顺序)
 *
 * @param <T>
 */
@SuppressWarnings("all")
public class ExportExcel<T> {

    /**
     * 导出excel一个多态
     *
     * @param map        map集合
     * @param dataset    数据
     * @param out        输出流
     * @param shellTitle shell名称
     */
    public void exportExcel(LinkedHashMap map, Collection<T> dataset,
                            OutputStream out, String shellTitle) {
        exportExcel(shellTitle, map, dataset, out, "yyyy-MM-dd");
    }


    /**
     * 导出excel
     *
     * @param title   shell名称
     * @param map     map集合
     * @param dataset 数据
     * @param out     输出流
     * @param pattern 格式
     */
    public void exportExcel(String title, LinkedHashMap map,
                            Collection<T> dataset, OutputStream out, String pattern) {
        HSSFWorkbook workbook = new HSSFWorkbook();
        HSSFSheet sheet = workbook.createSheet(title);
        HSSFCellStyle style = workbook.createCellStyle();
        HSSFFont font = workbook.createFont();
        style.setFont(font);
        HSSFCellStyle style2 = workbook.createCellStyle();
        HSSFFont font2 = workbook.createFont();
        style2.setFont(font2);
        HSSFPatriarch patriarch = sheet.createDrawingPatriarch();
        HSSFComment comment = patriarch.createComment(new HSSFClientAnchor(0,
                0, 0, 0, (short) 4, 2, (short) 6, 5));
        comment.setString(new HSSFRichTextString("可以在POI中添加注释！"));
        comment.setAuthor("wnl");
        HSSFRow row = sheet.createRow(0);
        int m = 0;
        String[] header = new String[map.size()];
        Iterator<Map.Entry<String, String>> it1 = map.entrySet().iterator();
        while (it1.hasNext()) {
            Map.Entry<String, String> entry = it1.next();
            HSSFCell cell = row.createCell(m);
            cell.setCellStyle(style);
            String key = entry.getKey();
            HSSFRichTextString text = new HSSFRichTextString(key);
            cell.setCellValue(text);
            header[m] = key;
            m++;
        }
        int index = 0;
        Iterator<T> it = dataset.iterator();
        while (it.hasNext()) {
            index++;
            row = sheet.createRow(index);
            T t = (T) it.next();
            Field[] fields = t.getClass().getDeclaredFields();
            for (short i = 0; i < map.size(); i++) {
                HSSFCell cell = row.createCell(i);
                cell.setCellStyle(style2);
                String fieldName = (String) map.get(header[i]);
                String getMethodName;
                try {
                    Object value = null;
                    if (t instanceof Map) {
                        value= ((Map) t).get(fieldName);
                    } else {
                        getMethodName = "get"
                                + fieldName.substring(0, 1).toUpperCase()
                                + fieldName.substring(1);
                        Method getMethod = t.getClass().getMethod(getMethodName, new Class[]{});
                        value = getMethod.invoke(t, new Object[]{});
                    }
                    String textValue = null;
                    if (value != null) {
                        textValue = value.toString();
                    }
                    if (textValue != null) {
                        Pattern p = Pattern.compile("^//d+(//.//d+)?$");
                        Matcher matcher = p.matcher(textValue);
                        if (matcher.matches()) {
                            cell.setCellValue(Double.parseDouble(textValue));
                        } else {
                            HSSFRichTextString richString = new HSSFRichTextString(
                                    textValue);
                            HSSFFont font3 = workbook.createFont();
                            font3.setColor(HSSFColor.BLUE.index);
                            richString.applyFont(font3);
                            cell.setCellValue(richString);
                        }
                    }
                } catch (SecurityException e) {
                    e.printStackTrace();
                } catch (NoSuchMethodException e) {
                    e.printStackTrace();
                } catch (IllegalArgumentException e) {
                    e.printStackTrace();
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                } catch (InvocationTargetException e) {
                    e.printStackTrace();
                } finally {
                    // 清理资源
                }
            }
        }
        try {
            workbook.write(out);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}