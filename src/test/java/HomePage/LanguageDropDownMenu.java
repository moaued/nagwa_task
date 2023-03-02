package HomePage;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;

import static pages.HomePage.Language.*;

public class LanguageDropDownMenu extends BaseTests {

    @Test()
    public void checkLanguagePage(){
        String currentUrl;
        homePage.selectLanguage(English);  //n: hna ana ghrb kol el 5 data ely 3ndy ezay ab3t mn file bra ?
        currentUrl = driver.getCurrentUrl();
        Assert.assertEquals(currentUrl,"https://www.nagwa.com/en/");//q:ezay a5leha msh hard coded ?
        Assert.assertEquals(homePage.getHeadText(),"Transforming Education");//q:ezay a5leha msh hard coded ?
    }



}


