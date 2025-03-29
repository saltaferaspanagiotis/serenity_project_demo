package demo.questions;

import demo.locators.HomePage;
import demo.utils.Wait;
import net.serenitybdd.core.pages.PageObject;
import org.junit.Assert;

public class HomePageQuestionsUI extends PageObject {

    public void verifyHomePageTitle(){
        Wait.forElementToBeDisplayed(getDriver(), $(HomePage.title));
        Assert.assertEquals("The Playground", $(HomePage.title).getText());
    }
}
