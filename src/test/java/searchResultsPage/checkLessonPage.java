package searchResultsPage;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import static pages.HomePage.Language.English;

public class checkLessonPage extends BaseTests {

    @Test
    public void checkLessonPage(){
        homePage.selectLanguage(English);
        homePage.clickSearchButton();
        homePage.typeLesson("math");
        //river.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS); //Q: da msh betrun leh ?
        homePage.clickSubmitButton();
        searchResultsPage.getSecondLesson();
        Assert.assertEquals(lessonPage.getHeadOfLessonPageText(),"Lesson Menu");
    }
}


//implicitWait-explicitWait   emta ast3ml da wemta ast3ml da mst9dmsh eletnen m3 b3d
