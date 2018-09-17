import org.junit.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.GoogleMainPage;
import pages.playQ.PlayQContactPage;
import pages.playQ.PlayQHomePage;

import java.util.concurrent.TimeUnit;

public class Tests {
    private static WebDriver driver;
    private GoogleMainPage googleMainPage;
    private PlayQHomePage playQHomePage;
    private PlayQContactPage playQContactPage;

    @BeforeClass
    public static void beforeClass(){
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    @Before
    public void before(){

    }

    @Test
    public void googleSearchTest(){
        driver.get("https://www.google.com");
        googleMainPage = new GoogleMainPage(driver);
        googleMainPage.doSearch("PlayQ");
        googleMainPage.goToFirstElementPage();
        Assert.assertEquals("https://www.playq.com/", driver.getCurrentUrl());
    }

    @Test
    public void playQContactPageTest(){
        driver.get("https://www.playq.com");
        playQHomePage = new PlayQHomePage(driver);
        playQContactPage = playQHomePage.goToPlayQContactPage();
        playQContactPage.fillNameField("Name");
        playQContactPage.fillEmailField("email@gmail.com");
        playQContactPage.fillSubjectField("subject");
        playQContactPage.fillMessageField("message");
        //playQContactPage.submit();
    }

    @AfterClass
    public static void afterClass(){
        driver.quit();
    }
}
