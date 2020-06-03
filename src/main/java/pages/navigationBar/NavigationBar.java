package pages.navigationBar;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class NavigationBar {
    private static final int TIMEOUT = 10;
    private WebDriver webDriver;

    @FindBy(xpath = "(//li[@class=\"topbar__li\"])[4]")
    private WebElement afisha;

    public NavigationBar(WebDriver driver) {
        this.webDriver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickAfisha() {
        (new WebDriverWait(webDriver, TIMEOUT))
                .until(ExpectedConditions.visibilityOf(afisha)).click();
    }
}
