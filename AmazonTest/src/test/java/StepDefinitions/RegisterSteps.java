package StepDefinitions;

import Pages.RegisterPage;
import Pages.SignInPage;
import Utilities.PropertiesReader;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RegisterSteps {

    private final WebDriver webDriver = Hooks.webDriver;
    private final WebDriverWait webDriverWait;

    public RegisterSteps() throws Exception  {

        PropertiesReader propertiesReader = new PropertiesReader();
        this.webDriverWait = new WebDriverWait(webDriver, propertiesReader.getTimeout());
    }

    private RegisterPage registerPage;

    @Then("Register page should be displayed")
    public void registryAndGiftingPageShouldBeDisplayed() {

        registerPage = new RegisterPage(webDriver, webDriverWait);
        Assert.assertTrue(registerPage.registerFormIsDisplayed());
    }

    @When("Input customer name with {string}")
    public void inputCustomerNameWith(String name) {

        registerPage = new RegisterPage(webDriver, webDriverWait);
        registerPage.inputCustomerName(name);
    }

    @When("Input customer email with {string}")
    public void inputCustomerEmailWith(String email) {

        registerPage = new RegisterPage(webDriver, webDriverWait);
        registerPage.inputCustomerEmail(email);
    }

    @When("Input customer password with {string}")
    public void inputCustomerPasswordWith(String password) {

        registerPage = new RegisterPage(webDriver, webDriverWait);
        registerPage.inputCustomerPassword(password);
    }

    @When("Input customer re-password with {string}")
    public void inputCustomerRePasswordWith(String repassword) {

        registerPage = new RegisterPage(webDriver, webDriverWait);
        registerPage.inputCustomerRePassword(repassword);
    }

    @When("Click continue button")
    public void clickContinurButton() {

        registerPage = new RegisterPage(webDriver, webDriverWait);
        registerPage.clickContinueButton();
    }
}
