package javaPackage.Utilities;

import java.io.FileInputStream;
import java.util.Properties;

public class ConfigUtils {

    public static String configVal;

    public static String getConfigVal (String keyName, String fileName) throws Throwable {
        Properties properties = new Properties();
        String propFileName = System.getProperty("user.dir")+"\\src\\main\\resources\\"+fileName;
        System.out.println(propFileName);
        FileInputStream inputStream = new FileInputStream(propFileName);
        properties.load(inputStream);
        configVal = properties.getProperty(keyName);
        return configVal;
    }

}
