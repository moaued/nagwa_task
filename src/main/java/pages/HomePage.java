package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.sql.SQLOutput;
import java.util.List;

public class HomePage {
    private WebDriver driver;
    public HomePage(WebDriver driver){
        this.driver = driver;
    }

    private String url;
    private By languageDropDown = By.xpath("//div[@class='user-actions']  /ul /li[1]");
    private By searchButton = By.cssSelector(".search > button");

    private By searchField = By.id("txt_search_query");

    private By submitButton = By.xpath("//button[@type='submit']");

    private String languagePath = "//li[@class='dropdown open']  //ul  //*[text()='English']";

    private By languageElement;

    private By headOfHomePage = By.cssSelector(".home-landing__banner__info " +
            ".home-landing__banner__info__title");

    private By noResultsFound = By.cssSelector(".no-results span");

    public  enum Language {English,Español,Français,Português,العربية};

    public  String getTextOfNoResult(){
        return driver.findElement(noResultsFound).getText();
    }

    public void selectLanguage(Language language){
        driver.findElement(languageDropDown).click();
        languagePath = languagePath.replace("English",language.toString());
        languageElement = By.xpath(languagePath);
        driver.findElement(languageElement).click();
    }

    public String getHeadText(){
        return driver.findElement(headOfHomePage).getText();
    }

    public void clickSearchButton(){
        driver.findElement(searchButton).click();
    }

    public void typeLesson(String lesson){
        driver.findElement(searchField).sendKeys(lesson);
    }

    public SearchResultsPage clickSubmitButton(){
        driver.findElement(submitButton).click();
        return new SearchResultsPage(driver);
    }

    public SearchResultsPage searchForLesson(String lesson){
        clickSearchButton();
        typeLesson(lesson);
        return clickSubmitButton();
    }
    
}
