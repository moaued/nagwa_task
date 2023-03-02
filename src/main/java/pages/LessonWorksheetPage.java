package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class LessonWorksheetPage {
    private WebDriver driver;
    public LessonWorksheetPage(WebDriver driver){
        this.driver = driver;
    }

    private By startPractisingLink = By.cssSelector("div.cta a");

    public String clickStartPractisingLink(){
       return driver.findElement(startPractisingLink).getText();
    }

    //Q:ezay el processsing abl ma einitiate wel web driver mahwa kda msh shayf web driver

    public List getAllQuestion(){
        List<WebElement> allQuestions = driver.findElements(By.cssSelector("div.one-part-question"));
        return  allQuestions;
    }

    public int getNumberOfQuestion(){
        return getAllQuestion().size();
    }

}
