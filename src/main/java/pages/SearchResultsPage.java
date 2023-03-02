package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class SearchResultsPage {
    private WebDriver driver;
    public SearchResultsPage(WebDriver driver){
        this.driver = driver;
    }

    private By headOfSearchPage =By.xpath("//h1[contains(text(),' Search results ')]");

    private By lessonsList = By.cssSelector(".list li a");
    public String getHeadOfSearchPage(){
       return  driver.findElement(headOfSearchPage).getText().toString();
    }



    public LessonPage getSecondLesson(){
        List<WebElement> element=new ArrayList<WebElement>();
        List<WebElement> allLessons = driver.findElements(lessonsList);
        allLessons.get(1).click();
        return new LessonPage(driver);
    }

    //lesson eob2a mot9yr
}
