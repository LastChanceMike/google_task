package pages.playQ;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PlayQContactPage {
    private WebDriver driver;

    private By nameFieldPath = By.id("contact_name");
    private By emailFieldPath = By.id("contact_email");
    private By subjectFieldPath = By.id("contact_subject");
    private By messageFieldPath = By.id("contact_message");
    private By submitButtonPath = By.id("contact_btn");

    public PlayQContactPage(WebDriver driver) {
        this.driver = driver;
    }

    public void fillNameField(String text){
        driver.findElement(nameFieldPath).sendKeys(text);
    }

    public void fillEmailField(String text){
        driver.findElement(emailFieldPath).sendKeys(text);
    }

    public void fillSubjectField(String text){
        driver.findElement(subjectFieldPath).sendKeys(text);
    }

    public void fillMessageField(String text){
        driver.findElement(messageFieldPath).sendKeys(text);
    }

    public void submit(){
        driver.findElement(submitButtonPath).click();
    }

}
