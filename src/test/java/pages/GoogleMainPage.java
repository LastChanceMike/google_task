package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.playQ.PlayQHomePage;

public class GoogleMainPage {

    private WebDriver driver;

    private By requestLabelPath = By.id("lst-ib");
    private By firstSearchResultLink = By.xpath("//div[@class='srg']/div[1]//a[1]");


    public GoogleMainPage(WebDriver driver) {
        this.driver = driver;
    }

    public void doSearch(String text){
        WebElement element = driver.findElement(requestLabelPath);
        element.sendKeys(text);
        element.sendKeys(Keys.ENTER);
    }

    public PlayQHomePage goToFirstElementPage(){
        (new WebDriverWait(driver, 5))
                .until(ExpectedConditions.elementToBeClickable(firstSearchResultLink)).click();
        return new PlayQHomePage(driver);
    }
}
