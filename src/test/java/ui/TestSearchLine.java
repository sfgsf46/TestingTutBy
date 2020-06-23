package ui;

import core.browser.DriverManager;
import core.browser.DriverManagerFactory;
import core.configuration.Configuration;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import pages.searchBar.SearchStringCheck;

public class TestSearchLine {
    DriverManager driverManager;
    WebDriver driver;
    SearchStringCheck searchStringCheck;
    Logger logger = Logger.getLogger(TestSearchLine.class.getName());

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
    public void clickSearch() {
        searchStringCheck = new SearchStringCheck(driver);
        searchStringCheck.fillOutTheFormAndSearch();
        logger.debug("Test done!");
    }
}
