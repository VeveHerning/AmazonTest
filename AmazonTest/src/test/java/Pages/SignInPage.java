package Pages;

import Utilities.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SignInPage extends BaseClass {

    public SignInPage(WebDriver webDriver, WebDriverWait webDriverWait){

        super(webDriver, webDriverWait);
        PageFactory.initElements(webDriver, this);
    }

    @FindBy(className = "a-link-nav-icon")
    private WebElement amazonIconLogo;

    @FindBy(xpath = "//h1[contains(text(),'Sign in')]")
    private WebElement titleSignInPage;

    @FindBy(xpath = "//input[@id='ap_email']")
    private WebElement textInputEmail;

    @FindBy(xpath = "//input[@id='continue']")
    private WebElement continueButton;

    @FindBy(xpath = "//a[@id='createAccountSubmit']")
    private WebElement createAccountButton;

    public boolean signInPageIsDisplayed(){
        waitUntilElementIsVisible(amazonIconLogo);
        waitUntilElementIsVisible(titleSignInPage);
        waitUntilElementIsVisible(textInputEmail);
        waitUntilElementIsVisible(continueButton);
        waitUntilElementIsVisible(createAccountButton);
        return true;
    }

    public void clickCreateAccountButton(){
        waitUntilElementIsClickable(createAccountButton);
        createAccountButton.click();
    }
}
