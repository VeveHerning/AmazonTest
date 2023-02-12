package StepDefinitions;

import Pages.HomePage;
import Pages.SignInPage;
import Utilities.PropertiesReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SignInSteps {

    private final WebDriver webDriver = Hooks.webDriver;
    private final WebDriverWait webDriverWait;

    public SignInSteps() throws Exception {

        PropertiesReader propertiesReader = new PropertiesReader();
        this.webDriverWait = new WebDriverWait(webDriver, propertiesReader.getTimeout());
    }

    private SignInPage signInPage;

    @Given("Open Sign In page")
    public void signInPageIsDisplayed(){
        signInPage = new SignInPage(webDriver, webDriverWait);
        signInPage.signInPageIsDisplayed();
    }

    @When("Open register page from sign in page")
    public void openRegisterPage(){
        signInPage = new SignInPage(webDriver, webDriverWait);
        signInPage.signInPageIsDisplayed();
        signInPage.clickCreateAccountButton();
    }
}
