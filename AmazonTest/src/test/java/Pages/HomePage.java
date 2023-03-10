package Pages;

import Utilities.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage extends BaseClass {

    public HomePage(WebDriver webDriver, WebDriverWait webDriverWait) {

        super(webDriver, webDriverWait);
        PageFactory.initElements(webDriver, this);
    }

    private Actions actions = new Actions(webDriver);

    @FindBy(id = "nav-logo-sprites")
    @CacheLookup
    private WebElement headerLogo;

    private final String inputDismissLocator = "//input[@data-action-type='DISMISS']";
    @FindBy(xpath = inputDismissLocator)
    private WebElement dontChangeAddressButton;

    @FindBy(id = "glow-ingress-line2")
    private WebElement deliverToLocationButton;

    @FindBy(id = "twotabsearchtextbox")
    @CacheLookup
    private WebElement headerSearchTextBox;

    @FindBy(id = "nav-hamburger-menu")
    @CacheLookup
    private WebElement headerAllMenu;

    @FindBy(xpath = "//a[contains(text(),'Registry')]")
    @CacheLookup
    private WebElement headerRegisterTab;

    @FindBy(id = "anonCarousel1")
    private WebElement homeCarousel;

    @FindBy(id = "gw-card-layout")
    private WebElement homeCard;

    @FindBy(xpath = "//span[@id='nav-link-accountList-nav-line-1']")
    private WebElement accountListSection;

    public boolean headerIsDisplayed() {

        waitUntilElementIsVisible(headerLogo);
        waitUntilElementIsVisible(deliverToLocationButton);
        waitUntilElementIsVisible(headerSearchTextBox);
        waitUntilElementIsVisible(headerAllMenu);
        waitUntilElementIsVisible(headerRegisterTab);
        return true;
    }

    public boolean homeIsDisplayed() {

        waitUntilElementIsVisible(homeCarousel);
        waitUntilElementIsVisible(homeCard);
        return true;
    }

    public int dontChangeButtonQuestionSize() {

        return webDriver.findElements(By.xpath(inputDismissLocator)).size();
    }

    public void clickDontChangeAddress() {

        waitUntilElementIsVisible(dontChangeAddressButton);
        waitUntilElementIsClickable(dontChangeAddressButton);
        dontChangeAddressButton.click();
    }

    public void hoverToAccountList(){
        waitUntilElementIsVisible(accountListSection);
        actions.moveToElement(accountListSection);
        accountListSection.click();
    }
}
