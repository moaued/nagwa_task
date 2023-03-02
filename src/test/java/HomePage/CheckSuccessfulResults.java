package HomePage;



import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;

import static pages.HomePage.Language.English;
import static pages.HomePage.Language.العربية;

public class CheckSuccessfulResults extends BaseTests {

    /*
    Scenario Steps:
1.	Open Nagwa website.
2.	Choose a language to open the home page.
3.	Use the search icon to start searching on Nagwa lessons.
4.	Write any lesson name for example “addition” then search.
5.	A list with all lessons in Nagwa that match this name will appear.
6.	Click on 2nd lesson in the search results to open its home page.
7.	Go to worksheet section then click preview button.
8.	Worksheet home page will open then count number of questions displayed on it and print the count. (Bonus step but preferred to be done).
Recommended Tools Cucumber, Selenium, Java, Maven, Junit.



     */
    @Test
    public void successfulResults(){
         homePage.selectLanguage(English);
         homePage.searchForLesson("math");
        //homePage.clickSearchButton();
        //homePage.typeLesson("math");
        //homePage.clickSubmitButton();
        Assert.assertEquals(searchResultsPage.getHeadOfSearchPage(),"Search results [1-100]");
    }

    @Test
    public void differentLanguageSearch(){
        homePage.selectLanguage(English);
        homePage.searchForLesson("رياضه");
        Assert.assertEquals(homePage.getTextOfNoResult(),"No results found.");
    }

    //b assert 3la nfs el results
    //static and non static methods
    //css selector strategies =====input[type='submit']”
    //taskkill /F /IM chromedriver.exe /T
    //assertion in 37

}
