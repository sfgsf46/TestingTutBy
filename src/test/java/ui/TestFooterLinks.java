package ui;

import core.browser.DriverManager;
import core.browser.DriverManagerFactory;
import core.configuration.Configuration;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import pages.footer.FooterLinks;

public class TestFooterLinks {
    DriverManager driverManager;
    WebDriver driver;
    FooterLinks footerLinks;
    Logger logger = Logger.getLogger(TestFooterLinks.class.getName());

    @BeforeTest
    public void beforeTest() {
        driverManager = DriverManagerFactory.getManager(Configuration.getDriverType());
        driver = driverManager.getDriver();
        logger.debug("Start driver");
    }

    @AfterTest
    public void afterMethod() {
        driverManager.quitDriver();
        logger.debug("Stop driver");
    }

    @Test(priority = 1)
    public void openSite() {
        driver.get("http://tut.by");
        Assert.assertEquals("Белорусский портал TUT.BY. Новости Беларуси и мира", driver.getTitle());
        logger.debug("Test done!");
    }

    @Test(priority = 2)
    public void clickMobileVersion() {
        footerLinks = new FooterLinks(driver);
        footerLinks.clickButtonMobileVersion();
        driver.navigate().back();
        logger.debug("Test done");
    }

    @Test(priority = 3)
    public void clickApps() {
        footerLinks = new FooterLinks(driver);
        footerLinks.clickButtonApps();
        logger.debug("Test done!");
    }

    @Test(priority = 5)
    public void clickBelarusianLanguage() {
        footerLinks.clickButtonBelorussianLanguage();
        logger.debug("Test done!");
    }

    @Test(priority = 4)
    public void clickContactEditors() {
        footerLinks.clickButtonContactEditors();
        driver.navigate().back();
        logger.debug("Test done!");
    }

    @Test(priority = 6)
    public void clickTermsOfUseOfMaterials() {
        footerLinks.clickButtonTermsOfUseOfMaterials();
        driver.navigate().back();
        logger.debug("Test done!");
    }

    @Test(priority = 7)
    public void clickTermsOfUse() {
        footerLinks.clickButtonTermsOfUse();
        driver.navigate().back();
        logger.debug("Test done!");
    }

    @Test(priority = 8)
    public void clickSubscribeToNewsletter() {
        footerLinks.clickButtonSubscribeToNewsletter();
        driver.navigate().back();
        logger.debug("Test done!");
    }

    @Test(priority = 9)
    public void clickUseRSS() {
        footerLinks.clickButtonUseRSS();
        driver.navigate().back();
        logger.debug("Test done!");
    }
}
