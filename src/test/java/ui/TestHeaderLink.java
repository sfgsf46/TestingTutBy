package ui;

import core.browser.DriverManager;
import core.browser.DriverManagerFactory;
import core.configuration.Configuration;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import pages.header.HeaderLink;

public class TestHeaderLink {
    DriverManager driverManager;
    WebDriver driver;
    HeaderLink headerLink;
    Logger logger = Logger.getLogger(TestHeaderLink.class.getName());

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
    public void clickPoster() {
        headerLink = new HeaderLink(driver);
        headerLink.clickButtonPoster();
        driver.navigate().back();
        logger.debug("Test done!");
    }

    @Test(priority = 3)
    public void clickFinance() {
        headerLink.clickButtonFinance();
        driver.navigate().back();
        logger.debug("Test done!");
    }

    @Test(priority = 4)
    public void clickPriceCatalog() {
        headerLink.clickButtonPriceCatalog();
        driver.navigate().back();
        logger.debug("Test done!");
    }

    @Test(priority = 5)
    public void clickJob() {
        headerLink.clickButtonJob();
        driver.navigate().back();
        logger.debug("Test done!");
    }

    @Test(priority = 6)
    public void clickWeather() {
        headerLink.clickButtonWeather();
        driver.navigate().back();
        logger.debug("Test done!");
    }

    @Test(priority = 7)
    public void clickTV() {
        headerLink.clickButtonTV();
        driver.navigate().back();
        logger.debug("Test done!");
    }

    @Test(priority = 8)
    public void clickSelectCity() {
        headerLink.clickButtonSelectCity();
        driver.navigate().back();
        logger.debug("Test done!");
    }

    @Test(priority = 9)
    public void clickMail() {
        headerLink.clickButtonMail();
        driver.navigate().back();
        logger.debug("Test done!");
    }
}
