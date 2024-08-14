package stepDefinition;

import javaPackage.PageFactory.LoginPage;
import javaPackage.PageFactory.SwagPage;
import javaPackage.Utilities.ConfigUtils;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import javaPackage.main.DriverClass;

import org.openqa.selenium.support.PageFactory;

import java.util.List;
import java.util.Map;


public class Login extends DriverClass {


    LoginPage loginPage = PageFactory.initElements(driver,LoginPage.class);
    SwagPage swagPage =PageFactory.initElements(driver,SwagPage.class);
    @Given("User is on Home Page")
    public void user_is_on_home_page() throws Throwable {
        driver.get(ConfigUtils.getConfigVal("url","config.properties"));

    }
    @When("^User enters \"(.*)\" and \"(.*)\"$")
    public void user_enters_user_name_and_password(String userName, String password) throws Throwable {
        loginPage.login(userName,password);

    }

    @When("^User enters username (.*) and password (.*)$")
    public void user_enters_user_name_password(String userName, String password) throws Throwable {
        loginPage.login(userName,password);
    }

    @Then("Message displayed Login Successfully")
    public void message_displayed_login_successfully() {
        swagPage.verifyPageHeader();
    }

    @When("^User enters username and password$")
    public void
    user_enters_username__and_password(DataTable usercredentials) throws Throwable {
        List<Map<String,String>> data = usercredentials.asMaps(String.class,String.class);
        loginPage.login(data.get(0).get("username"),data.get(0).get("password"));
    }




    }
