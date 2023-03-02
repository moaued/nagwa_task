package lessonWorksheetPage;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Base64;
import java.util.concurrent.TimeUnit;

import static pages.HomePage.Language.English;

public class checkNumberOfQuestions extends BaseTests {

    @Test
    public void checkNumberOfQuestion(){
        homePage.selectLanguage(English);
        homePage.clickSearchButton();
        homePage.typeLesson("math");
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS); //Q: da msh betrun leh ?
        homePage.clickSubmitButton();
        searchResultsPage.getSecondLesson();
        lessonPage.clickLessonWorksheetLink();
        Assert.assertEquals(lessonWorksheetPage.getNumberOfQuestion(),10);
        System.out.println(lessonWorksheetPage.getNumberOfQuestion());
    }

}
