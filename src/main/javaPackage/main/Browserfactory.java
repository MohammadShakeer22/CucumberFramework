package javaPackage.main;

import javaPackage.Utilities.ConfigUtils;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.util.concurrent.TimeUnit;

public class Browserfactory {

    public static String browser;


    public static WebDriver driver;

    public static WebDriver launchBrowser() throws Throwable {

        browser = ConfigUtils.getConfigVal("browser","config.properties");
        switch (browser)
        {
            case "Chrome":
                WebDriverManager.chromedriver().setup();

                ChromeOptions options = new ChromeOptions();
                options.addArguments("start-maximized");
                options.addArguments("--incognito");
                //options.addArguments("--remote-allow-origins=*");
                //options.addArguments("--headless");
                DesiredCapabilities capabilities = new DesiredCapabilities();
                capabilities.setCapability(ChromeOptions.CAPABILITY, options);
                options.merge(capabilities);

                driver = new ChromeDriver(options);


                // driver.get(ConfigUtils.getConfigVal("url","config.properties"));
                driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
                // driver.quit();

        }

        return driver;
    }
}
