package utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class configurationReader extends driver {
    private static Properties config;

    static {
        try{
            FileInputStream fileInputStream = new FileInputStream("configuration.properties");
            config = new Properties();
            config.load(fileInputStream);
        }catch (FileNotFoundException e){
            throw new RuntimeException(e);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static String getProperties(String key){
        return config.getProperty(key);
    }
}
