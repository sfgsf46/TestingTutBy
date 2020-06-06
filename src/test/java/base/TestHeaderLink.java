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
import pages.header.HeaderLink;

public class TestHeaderLink {
    DriverManager driverManager;
    WebDriver driver;
    HeaderLink headerLink;

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
    public void clickPoster() {
        headerLink = new HeaderLink(driver);
        headerLink.clickButtonPoster();
        driver.navigate().back();
    }

    @Test(priority = 3)
    public void clickFinance() {
        headerLink.clickButtonFinance();
        driver.navigate().back();
    }

    @Test(priority = 4)
    public void clickPriceCatalog() {
        headerLink.clickButtonPriceCatalog();
        driver.navigate().back();
    }

    @Test(priority = 5)
    public void clickJob() {
        headerLink.clickButtonJob();
        driver.navigate().back();
    }

    @Test(priority = 6)
    public void clickWeather() {
        headerLink.clickButtonWeather();
        driver.navigate().back();
    }

    @Test(priority = 7)
    public void clickTV() {
        headerLink.clickButtonTV();
        driver.navigate().back();
    }

    @Test(priority = 8)
    public void clickSelectCity() {
        headerLink.clickButtonSelectCity();
        driver.navigate().back();
    }

    @Test(priority = 9)
    public void clickMail() {
        headerLink.clickButtonMail();
        driver.navigate().back();
    }
}
