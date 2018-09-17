package pages.playQ;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PlayQHomePage {
    private WebDriver driver;

    private By contactMenuPath = By.linkText("Contact");

    public PlayQHomePage(WebDriver driver) {
        this.driver = driver;
    }

    public PlayQContactPage goToPlayQContactPage(){
        driver.findElement(contactMenuPath).click();
        return new PlayQContactPage(driver);
    }
}
