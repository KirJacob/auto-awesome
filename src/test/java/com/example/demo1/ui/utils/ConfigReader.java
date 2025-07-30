package com.example.demo1.ui.utils;

import java.io.FileInputStream;
    import java.io.IOException;
    import java.util.Properties;

public class ConfigReader {
    private static Properties properties = new Properties();

    static {
        try {
            FileInputStream file = new FileInputStream("src/test/resources/config.properties");
            properties.load(file);
        } catch (IOException e) {
            System.out.println("Failed to load config.properties: " + e.getMessage());
        }
    }

    public static String get(String key) {
        return properties.getProperty(key);
    }
    public static String getBaseURL() {
        return ConfigReader.get("baseUrl");
    };
    public static long getImplicitWait() {
        return Long.parseLong(ConfigReader.get("implicitWait"));
    };
}
