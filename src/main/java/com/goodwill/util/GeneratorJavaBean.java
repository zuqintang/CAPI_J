package com.goodwill.util;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.FileInputStream;
import java.sql.*;
import java.util.*;

/**
 * Created by wangnianlei on 2017/7/17.
 */
public class GeneratorJavaBean {


    public static void main(String[] args) {
        //TODO 直接写表名称（大小写都行），直接会生成到model文件夹中（覆盖）
        create("SET_VS_ELEMENT");
    }

    public static Connection conn;
    public static String packagePath = "com/goodwill/domain";
    public static String dotPackagePath = "com.goodwill.domain";    
    public static String resourcePath = "/src/main/java";

    //获取数据库连接
    static {
        try {
            Properties properties = new Properties();
            properties.load(new FileInputStream("src/main/resources/jdbc.properties"));
            String driver = properties.getProperty("db.driver");
            //  String url="jdbc:mysql://192.168.2.117:3306/jhedc";这个地址需要切一下（问号后面的不要）
            String url = properties.getProperty("db.url").split("\\?")[0];
            String username = properties.getProperty("db.users");
            String password = properties.getProperty("db.password");
            Class.forName(driver);
            conn = DriverManager.getConnection(url, username, password);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 得到注释
     *
     * @param conn      连接
     * @param tableName 表名
     * @throws Exception
     */
    public static Map<String, String> getCommentsMap(Connection conn, String tableName) throws Exception {
        Map<String, String> map = new HashMap<String, String>();
        Statement statement = conn.createStatement();
        String sql = "SHOW FULL COLUMNS  FROM `" + tableName + "`";
        ResultSet resultSet = statement.executeQuery(sql);
        while (resultSet.next()) {
            String comments = resultSet.getString(9);
            if (comments != null) {
                comments = comments.replaceAll("\\s", " ");
            }
            map.put(resultSet.getString(1).toUpperCase(), comments);
        }
        close(statement, resultSet);
        return map;
    }

    /**
     * 创建表
     *
     * @param tableName
     */
    public static void create(String tableName) {
        ResultSet rs = null;
        Statement stmt = null;
        try {
            stmt = conn.createStatement();
            rs = stmt.executeQuery("select * from " + tableName + " limit 0,1");
            ResultSetMetaData metaData = rs.getMetaData();
            int columnCount = metaData.getColumnCount();
            List<String> columnNameList = new ArrayList<String>();
            List<Integer> columnTypeList = new ArrayList<Integer>();
            List<String> javaTypeList = new ArrayList<String>();
            Map<String, String> commentsMap = getCommentsMap(conn, tableName);
            for (int i = 0; i < columnCount; i++) {
                String tableColName = metaData.getColumnName(i + 1);
                columnNameList.add(tableColName);
                int columnType = metaData.getColumnType(i + 1);
                columnTypeList.add(columnType);
            }
            StringBuilder javaClassName = new StringBuilder();
            String[] split = tableName.split("_");
            for (int i = 0; i < split.length; i++) {
                split[i] = split[i].toLowerCase();
                javaClassName.append("_").append(split[i].substring(0, 1).toUpperCase()).append(split[i].substring(1));
            }
            String className = javaClassName.substring(1);
            StringBuilder header = new StringBuilder("package " + dotPackagePath + ";\n\n" +
                    "import java.io.Serializable;\n");
            header.append("import java.sql.*;\n");
            StringBuilder content = new StringBuilder();
            content.append("\n/**\n" + " * Created by GeneratorJavaBean \n")
                    .append(" */\npublic class ")
                    .append(className)
                    .append(" implements Serializable {\n\n");
            //生成数据库对应的字段
            for (int i = 0; i < columnNameList.size(); i++) {
                int sqlType = columnTypeList.get(i);
                String comments = commentsMap.get(columnNameList.get(i));
                if (comments != null) {
                    content.append("    /**\n     *  ").append(comments).append("\n     */\n");
                }
                String javaType;
                if (sqlType == Types.INTEGER) {
                    javaType = "Integer";
                } else if (sqlType == Types.BIGINT) {
                    javaType = "Long";
                } else if (sqlType == Types.TIMESTAMP) {
                    javaType = "String";
                } else if (sqlType == Types.VARCHAR) {
                    javaType = "String";
                } else if (sqlType == Types.DECIMAL) {
                    javaType = "BigDecimal";
                } else if(sqlType==Types.LONGVARCHAR){
                    javaType="String";
                }else {

                    //TODO 更多类型暂未优化
                    javaType = null;
                }
                javaTypeList.add(javaType);
                //字段
                content.append("    private ").append(javaType).append(" ").append(columnNameList.get(i)).append(" ;\n\n");
            }
            //生成get  set 方法
            for (int i = 0; i < columnNameList.size(); i++) {
                String javaField = columnNameList.get(i);
                String javaType = javaTypeList.get(i);
                content.append("    public ").append(javaTypeList.get(i)).append(" get").append(javaField).append("() {\n")
                        .append("        return ").append(javaField).append(";\n    }\n\n    public void set").append(javaField)
                        .append("(").append(javaType).append(" ").append(javaField).append(") {\n        this.").append(javaField)
                        .append(" = ").append(javaField).append(";\n    }\n\n");
            }
            content.append("}");
            String fileName = System.getProperty("user.dir").replaceAll("\\\\", "/") + resourcePath + "/" + packagePath + "/" + className + ".java";
            File file = new File(fileName);
            FileUtils.writeStringToFile(file, header.append(content).toString(), "UTF-8");
            System.out.println("恭喜你，文件：" + file.getName() + "创建成功");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            close(stmt, rs);
        }
    }

    /**
     * 关闭资源
     *
     * @param stmt
     * @param rs
     */
    public static void close(Statement stmt, ResultSet rs) {
        try {
            if (rs != null) {
                rs.close();
            }
            if (stmt != null) {
                stmt.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
