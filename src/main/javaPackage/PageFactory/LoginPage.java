package javaPackage.PageFactory;

import javaPackage.main.DriverClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends DriverClass {

    @FindBy(xpath = "//input[@id='user-name']") static WebElement txt_userName;
    @FindBy(xpath = "//input[@id='password']") static WebElement txt_password;
    @FindBy(xpath = "//input[@id='login-button']") static WebElement btn_login;

    public static void login(String userName,String password) throws InterruptedException {
        txt_userName.sendKeys(userName);
        txt_password.sendKeys(password);
        btn_login.click();
    }
}
