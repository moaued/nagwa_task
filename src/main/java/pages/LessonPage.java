package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LessonPage {
    private WebDriver driver;
    public LessonPage(WebDriver driver){
        this.driver = driver;
    }
    private By headOfLessonPage = By.cssSelector(".components  h3");

    private By lessonWorksheetLink = By.xpath("//div[@class='components'] //ul //li[4] //a");

    public LessonWorksheetPage clickLessonWorksheetLink(){
        driver.findElement(lessonWorksheetLink).click();
        return new LessonWorksheetPage(driver);
    }

    public String getHeadOfLessonPageText(){
        return  driver.findElement(headOfLessonPage).getText();
    }


}
