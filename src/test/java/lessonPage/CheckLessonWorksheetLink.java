package lessonPage;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import static pages.HomePage.Language.English;

public class CheckLessonWorksheetLink extends BaseTests {

    @Test
    public  void checkLessonWorksheetLink(){
        homePage.selectLanguage(English);
        homePage.clickSearchButton();
        homePage.typeLesson("math");
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS); 
        homePage.clickSubmitButton();
        searchResultsPage.getSecondLesson();
        lessonPage.clickLessonWorksheetLink();
        Assert.assertEquals(lessonWorksheetPage.clickStartPractisingLink(),"START PRACTISING");
    }
}
