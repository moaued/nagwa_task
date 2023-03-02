package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;


import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LessonPage;
import pages.LessonWorksheetPage;
import pages.SearchResultsPage;

public class BaseTests {  //parent l test classes
    protected WebDriver driver;
    protected HomePage homePage;
    protected SearchResultsPage searchResultsPage;

    protected LessonPage lessonPage;

    protected LessonWorksheetPage lessonWorksheetPage;

    @BeforeMethod
    public void setUp(){
        //WebDriverManager.chromedriver().setup(); //set property executable file ,b2olo setup no3 el driver wenzl ,>4.6 l
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.nagwa.com/en/");
        homePage = new HomePage(driver);
        searchResultsPage = new SearchResultsPage(driver);
        lessonPage = new LessonPage(driver);
        lessonWorksheetPage = new LessonWorksheetPage(driver);
    }


//@before,after hook.....

}
