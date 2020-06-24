package ui;

import core.browser.DriverManager;
import core.browser.DriverManagerFactory;
import core.configuration.Configuration;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.news.NewsSteps;

public class TestNewsLinks {
    DriverManager driverManager;
    WebDriver driver;
    NewsSteps news;
    Logger logger = Logger.getLogger(TestNewsLinks.class.getName());

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
    public void testClickNewsPartOne() {
        news = new NewsSteps(driver);
        news.clickOfNewsPartOne();
        logger.debug("Test done!");
    }

    @Test(priority = 3)
    public void testGetArticleTitleFromTitlePartOne() {
        news.getArticleTitleFromTitlePartOne();
        driver.navigate().back();
    }

    @Test(priority = 4)
    public void testGetArticleTitleFromLinkPartOne() {
        news.getArticleTitleFromLinkPartOne();
    }

    @Test(priority = 5)
    public void testClickNewsPartTwo() {
        news.clickOfNewsPartTwo();
        logger.debug("Test done!");
    }

    @Test(priority = 6)
    public void testGetArticleTitleFromTitlePartTwo() {
        news.getArticleTitleFromTitlePartTwo();
        driver.navigate().back();
    }

    @Test(priority = 7)
    public void testGetArticleTitleFromLinkPartTwo() {
        news.getArticleTitleFromLinkPartTwo();
    }

    @Test(priority = 8)
    public void testClickNewsPartThree() {
        news.clickOfNewsPartThree();
        logger.debug("Test done!");
    }

    @Test(priority = 9)
    public void testGetArticleTitleFromTitlePartThree() {
        news.getArticleTitleFromTitlePartThree();
        driver.navigate().back();
    }

    @Test(priority = 10)
    public void testGetArticleTitleFromLinkPartThree() {
        news.getArticleTitleFromLinkPartThree();
    }

    @Test(priority = 11)
    public void testComparisonOfArticleTitles() {
        news.comparisonOfArticleTitles();
    }
}
