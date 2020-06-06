package base;

import core.browser.DriverManager;
import core.browser.DriverManagerFactory;
import core.configuration.Configuration;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.footer.FooterLinks;

public class TestFooterLinks {
    DriverManager driverManager;
    WebDriver driver;
    FooterLinks footerLinks;

    @BeforeTest
    public void beforeTest() {
        driverManager = DriverManagerFactory.getManager(Configuration.getDriverType());
    }

    @BeforeMethod
    public void beforeMethod() {
        driver = driverManager.getDriver();
    }

    @AfterSuite
    public void afterMethod() {
        driverManager.quitDriver();
    }

    @Test(priority = 1)
    public void openSite() {
        driver.get("http://tut.by");
        Assert.assertEquals("Белорусский портал TUT.BY. Новости Беларуси и мира", driver.getTitle());
    }

    @Test(priority = 2)
    public void clickMobileVersion() {
        footerLinks = new FooterLinks(driver);
        footerLinks.clickButtonMobileVersion();
        driver.navigate().back();
    }

    @Test(priority = 3)
    public void clickApps() {
        footerLinks = new FooterLinks(driver);
        footerLinks.clickButtonApps();
    }

    @Test(priority = 5)
    public void clickBelarusianLanguage() {
        footerLinks.clickButtonBelarusianLanguage();
    }

    @Test(priority = 4)
    public void clickContactEditors() {
        footerLinks.clickButtonContactEditors();
        driver.navigate().back();
    }

    @Test(priority = 6)
    public void clickTermsOfUseOfMaterials() {
        footerLinks.clickButtonTermsOfUseOfMaterials();
        driver.navigate().back();
    }

    @Test(priority = 7)
    public void clickTermsOfUse() {
        footerLinks.clickButtonTermsOfUse();
        driver.navigate().back();
    }

    @Test(priority = 8)
    public void clickSubscribeToNewsletter() {
        footerLinks.clickButtonSubscribeToNewsletter();
        driver.navigate().back();
    }

    @Test(priority = 9)
    public void clickUseRSS() {
        footerLinks.clickButtonUseRSS();
        driver.navigate().back();
    }
}
