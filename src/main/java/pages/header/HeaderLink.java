package pages.header;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HeaderLink {
    private static final int TIMEOUT = 10;
    private WebDriver webDriver;

    @FindBy(xpath = "(//li[@class=\"topbar__li\"])[1]")
    private WebElement selectCity;
    @FindBy(xpath = "(//li[@class=\"topbar__li\"])[2]")
    private WebElement mail;
    @FindBy(xpath = "(//li[@class=\"topbar__li\"])[3]")
    private WebElement finance;
    @FindBy(xpath = "(//li[@class=\"topbar__li\"])[4]")
    private WebElement poster;
    @FindBy(xpath = "(//li[@class=\"topbar__li\"])[5]")
    private WebElement job;
    @FindBy(xpath = "(//li[@class=\"topbar__li\"])[6]")
    private WebElement weather;
    @FindBy(xpath = "(//li[@class=\"topbar__li\"])[7]")
    private WebElement TV;
    @FindBy(xpath = "(//li[@class=\"topbar__li\"])[8]")
    private WebElement priceCatalog;

    public HeaderLink(WebDriver driver) {
        this.webDriver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickButtonPoster() {
        (new WebDriverWait(webDriver, TIMEOUT))
                .until(ExpectedConditions.visibilityOf(poster)).click();
    }

    public void clickButtonMail() {
        (new WebDriverWait(webDriver, TIMEOUT))
                .until(ExpectedConditions.visibilityOf(mail)).click();
    }

    public void clickButtonFinance() {
        (new WebDriverWait(webDriver, TIMEOUT))
                .until(ExpectedConditions.visibilityOf(finance)).click();
    }

    public void clickButtonPriceCatalog() {
        (new WebDriverWait(webDriver, TIMEOUT))
                .until(ExpectedConditions.visibilityOf(priceCatalog)).click();
    }

    public void clickButtonJob() {
        (new WebDriverWait(webDriver, TIMEOUT))
                .until(ExpectedConditions.visibilityOf(poster)).click();
    }

    public void clickButtonWeather() {
        (new WebDriverWait(webDriver, TIMEOUT))
                .until(ExpectedConditions.visibilityOf(mail)).click();
    }

    public void clickButtonTV() {
        (new WebDriverWait(webDriver, TIMEOUT))
                .until(ExpectedConditions.visibilityOf(finance)).click();
    }

    public void clickButtonSelectCity() {
        (new WebDriverWait(webDriver, TIMEOUT))
                .until(ExpectedConditions.visibilityOf(priceCatalog)).click();
    }
}
