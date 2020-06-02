package base;

import core.browser.DriverManager;
import core.browser.DriverManagerFactory;
import core.configuration.Configuration;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FactoryPatterTest {
    DriverManager driverManager;
    WebDriver driver;

    @BeforeTest
    public void beforeTest() {
        driverManager = DriverManagerFactory.getManager(Configuration.getDriverType());
    }

    @BeforeMethod
    public void beforeMethod() {
        driver = driverManager.getDriver();
    }

    @AfterMethod
    public void afterMethod() {
        driverManager.quitDriver();
    }

    @Test
    public void launchTestAutomationTutByTest() {
        driver.get("http://tut.by");
        Assert.assertEquals("Белорусский портал TUT.BY. Новости Беларуси и мира", driver.getTitle());
    }
}
