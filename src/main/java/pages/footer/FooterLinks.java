package pages.footer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Set;

public class FooterLinks {
    private static final int TIMEOUT = 10;
    private WebDriver webDriver;

    @FindBy(xpath = "(//a[@class=\"footer__link\"])[1]")
    private WebElement mobileVersion;
    @FindBy(xpath = "(//a[@class=\"footer__link\"])[2]")
    private WebElement apps;
    @FindBy(xpath = "(//a[@class=\"footer__link\"])[3]")
    private WebElement belarusianLanguage;
    @FindBy(xpath = "(//a[@class=\"footer__link\"])[4]")
    private WebElement contactEditors;
    @FindBy(xpath = "(//a[@class=\"footer__link\"])[5]")
    private WebElement termsOfUseOfMaterials;
    @FindBy(xpath = "(//a[@class=\"footer__link\"])[6]")
    private WebElement termsOfUse;
    @FindBy(xpath = "(//a[@class=\"footer__link\"])[15]")
    private WebElement subscribeToNewsletter;
    @FindBy(xpath = "(//a[@class=\"footer__link\"])[16]")
    private WebElement useRSS;

    public FooterLinks(WebDriver driver) {
        this.webDriver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickButtonMobileVersion() {
        (new WebDriverWait(webDriver, TIMEOUT))
                .until(ExpectedConditions.visibilityOf(mobileVersion)).click();
    }

    public void clickButtonApps() {
        (new WebDriverWait(webDriver, TIMEOUT))
                .until(ExpectedConditions.visibilityOf(apps)).click();

    }

    public void clickButtonBelarusianLanguage() {
        (new WebDriverWait(webDriver, TIMEOUT))
                .until(ExpectedConditions.visibilityOf(belarusianLanguage)).click();
    }

    public void clickButtonContactEditors() {
        (new WebDriverWait(webDriver, TIMEOUT))
                .until(ExpectedConditions.visibilityOf(contactEditors)).click();
        String handle = webDriver.getWindowHandle();
        webDriver.switchTo().window(handle);
    }

    public void clickButtonTermsOfUseOfMaterials() {
        (new WebDriverWait(webDriver, TIMEOUT))
                .until(ExpectedConditions.visibilityOf(termsOfUseOfMaterials)).click();
    }

    public void clickButtonTermsOfUse() {
        (new WebDriverWait(webDriver, TIMEOUT))
                .until(ExpectedConditions.visibilityOf(termsOfUse)).click();
    }

    public void clickButtonSubscribeToNewsletter() {
        (new WebDriverWait(webDriver, TIMEOUT))
                .until(ExpectedConditions.visibilityOf(subscribeToNewsletter)).click();
    }

    public void clickButtonUseRSS() {
        (new WebDriverWait(webDriver, TIMEOUT))
                .until(ExpectedConditions.visibilityOf(useRSS)).click();
    }
}
