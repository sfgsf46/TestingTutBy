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
import pages.searchBar.SearchStringCheck;

public class TestSearchLine {
    DriverManager driverManager;
    WebDriver driver;
    SearchStringCheck searchStringCheck;

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
    public void clickSearch() {
        searchStringCheck = new SearchStringCheck(driver);
        searchStringCheck.fillOutTheFormAndSearch();
    }
}
