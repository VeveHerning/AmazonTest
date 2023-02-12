package Pages;

import Utilities.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RegisterPage extends BaseClass {

    public RegisterPage(WebDriver webDriver, WebDriverWait webDriverWait){

        super(webDriver, webDriverWait);
        PageFactory.initElements(webDriver, this);
    }

    @FindBy(className = "a-link-nav-icon")
    private WebElement amazonIconLogo;

    @FindBy(xpath = "//h1[contains(text(),'Create account')]")
    private WebElement titleRegisterPage;

    @FindBy(xpath = "//input[@id='ap_customer_name']")
    private WebElement textInputCustomerName;

    @FindBy(xpath = "//input[@id='ap_email']")
    private WebElement textInputEmail;

    @FindBy(xpath = "//input[@id='ap_password']")
    private WebElement textInputPassword;

    @FindBy(xpath = "//input[@id='ap_password_check']")
    private WebElement textInputRePassword;

    @FindBy(xpath = "//input[@id='continue']")
    private WebElement continueButton;

    public boolean registerFormIsDisplayed(){
        waitUntilElementIsVisible(amazonIconLogo);
        waitUntilElementIsVisible(titleRegisterPage);
        waitUntilElementIsVisible(textInputCustomerName);
        waitUntilElementIsVisible(textInputEmail);
        waitUntilElementIsVisible(textInputPassword);
        waitUntilElementIsVisible(textInputRePassword);
        waitUntilElementIsVisible(continueButton);

        return true;
    }

    public void inputCustomerName(String name) {

        waitUntilElementIsClickable(textInputCustomerName);
        textInputCustomerName.sendKeys(name);
    }

    public void inputCustomerEmail(String email){
        waitUntilElementIsClickable(textInputEmail);
        textInputEmail.sendKeys(email);
    }

    public void inputCustomerPassword(String password){
        waitUntilElementIsClickable(textInputRePassword);
        textInputPassword.sendKeys(password);
    }

    public void inputCustomerRePassword(String repassword){
        waitUntilElementIsClickable(textInputRePassword);
        textInputRePassword.sendKeys(repassword);
    }

    public void clickContinueButton(){
        waitUntilElementIsClickable(continueButton);
        continueButton.click();
    }
}
