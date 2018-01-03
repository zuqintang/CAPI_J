package com.goodwill.util;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * 读取Properties配置文件的工具类,使用单例模式
 */
public class PropertiesHelper {
    private static PropertiesHelper instance = null;

    //私有构造方法
    private PropertiesHelper() {
    }

    public static synchronized PropertiesHelper getInstance() {
        if (null == instance) {
            instance = new PropertiesHelper();
        }
        return instance;
    }

    /**
     * 获取配置文件里的某个键值
     *
     * @param fileName 文件名称
     * @param keyName  键值
     * @return
     */
    public String getProperty(String fileName, String keyName) {
        if (fileName == null) {
            fileName = "globalvar.properties";
        }
        ClassLoader classLoader = PropertiesHelper.class.getClassLoader();
        InputStream inputStream = classLoader.getResourceAsStream(fileName);
        Properties prop = new Properties();
        try {
            prop.load(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return prop.getProperty(keyName);
    }

    public String getProperty(String keyName) {
        return getProperty(null, keyName);
    }

}
