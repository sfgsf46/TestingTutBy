package base;

import core.browser.DriverManager;
import core.browser.DriverManagerFactory;
import core.configuration.Configuration;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import pages.navigationBar.NavigationBar;

public class FactoryPatternTest {
    DriverManager driverManager;
    WebDriver driver;
    NavigationBar navigationBar;

    @BeforeTest
    public void beforeTest() {
        driverManager = DriverManagerFactory.getManager(Configuration.getDriverType());
    }

    @BeforeMethod
    public void beforeMethod() {
        driver = driverManager.getDriver();
    }

    @Test
    public void automationTutByTest() {
        driver.get("http://tut.by");
        Assert.assertEquals("Белорусский портал TUT.BY. Новости Беларуси и мира", driver.getTitle());
        navigationBar.clickAfisha();
    }

    @AfterMethod
    public void afterMethod() {
//        navigationBar.clickAfisha();
        driverManager.quitDriver();
    }
}
