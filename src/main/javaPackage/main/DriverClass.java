package javaPackage.main;

import org.openqa.selenium.WebDriver;

public class DriverClass extends Browserfactory {

    public static WebDriver driver;

    static {
        try {
            driver = launchBrowser();
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

}
