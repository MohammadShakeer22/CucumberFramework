package javaPackage.PageFactory;

import javaPackage.main.DriverClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class SwagPage extends DriverClass {

    @FindBy(xpath = "//div[text()='Swag Labs']") static WebElement header_Swag;

    @FindBy(xpath = "//button[@id='add-to-cart-test.allthethings()-t-shirt-(red)']") static WebElement btn_AddRedShirt;

    public SwagPage() throws Throwable {
    }

    public static void verifyPageHeader()
    {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(header_Swag));
        Assert.assertTrue(header_Swag.isDisplayed());
    }

    public static void addProduct()
    {
        Actions actions = new Actions(driver);
        actions.moveToElement(btn_AddRedShirt).build().perform();
        btn_AddRedShirt.click();
    }
}
