package pages.news;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;

public class NewsSteps {
    private static final int TIMEOUT = 10;
    private WebDriver webDriver;
    List<String> linksPage = new ArrayList<>();

    @FindBy(xpath = "//*[@id=\"title_news_block\"]/div[2]/div[2]/div/div[1]/a/span/span[1]")
    private WebElement HomePageLink;

    @FindBy(xpath = "//*[@id=\"geo_news_block\"]/div/div[2]/div/div[2]/div/div/div[3]/a/span/span[1]")
    private WebElement HomePageLink2;

    @FindBy(xpath = "//*[@id=\"title_news_block\"]/div[2]/div[2]/div/div[6]/a/span/span[1]")
    private WebElement HomePageLink3;

    @FindBy(xpath = "//*[@id=\"utm_article_block\"]/div[3]/div[1]/h1")
    private WebElement ArticleTitle;

    public NewsSteps(WebDriver driver) {
        this.webDriver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickOfNewsPartOne() {
        (new WebDriverWait(webDriver, TIMEOUT))
                .until(ExpectedConditions.visibilityOf(HomePageLink)).click();
    }

    public void getArticleTitleFromLinkPartOne() {
        (new WebDriverWait(webDriver, TIMEOUT))
                .until(ExpectedConditions.visibilityOf(HomePageLink));
        linksPage.add(HomePageLink.getText());
    }

    public void getArticleTitleFromTitlePartOne() {
        (new WebDriverWait(webDriver, TIMEOUT))
                .until(ExpectedConditions.visibilityOf(ArticleTitle));
        linksPage.add(ArticleTitle.getText());
    }

    public void clickOfNewsPartTwo() {
        (new WebDriverWait(webDriver, TIMEOUT))
                .until(ExpectedConditions.visibilityOf(HomePageLink2)).click();
    }

    public void getArticleTitleFromLinkPartTwo() {
        (new WebDriverWait(webDriver, TIMEOUT))
                .until(ExpectedConditions.visibilityOf(HomePageLink2));
        linksPage.add(HomePageLink2.getText());
    }

    public void getArticleTitleFromTitlePartTwo() {
        (new WebDriverWait(webDriver, TIMEOUT))
                .until(ExpectedConditions.visibilityOf(ArticleTitle));
        linksPage.add(ArticleTitle.getText());
    }

    public void clickOfNewsPartThree() {
        (new WebDriverWait(webDriver, TIMEOUT))
                .until(ExpectedConditions.visibilityOf(HomePageLink3)).click();
    }

    public void getArticleTitleFromLinkPartThree() {
        (new WebDriverWait(webDriver, TIMEOUT))
                .until(ExpectedConditions.visibilityOf(HomePageLink3));
        linksPage.add(HomePageLink3.getText());
    }

    public void getArticleTitleFromTitlePartThree() {
        (new WebDriverWait(webDriver, TIMEOUT))
                .until(ExpectedConditions.visibilityOf(ArticleTitle));
        linksPage.add(ArticleTitle.getText());
    }

    public void comparisonOfArticleTitles() {
        Assert.assertEquals(linksPage.get(0), linksPage.get(1),
                "Error in link 1, code verification is necessary!");
        Assert.assertEquals(linksPage.get(2), linksPage.get(3),
                "Error in link 2, code verification is necessary!");
        Assert.assertEquals(linksPage.get(4), linksPage.get(5),
                "Error in link 3, code verification is necessary!");
    }
}
