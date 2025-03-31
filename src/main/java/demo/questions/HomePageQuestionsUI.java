package demo.questions;

import demo.locators.HomePage;
import demo.utils.ScenarioContext;
import demo.utils.Wait;
import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.pages.PageObject;
import org.junit.Assert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class HomePageQuestionsUI extends PageObject {

    @Autowired
    private ScenarioContext scenarioContext;

    @Step
    public void verifyHomePageTitle(){
        Wait.forElementToBeDisplayed(getDriver(), $(HomePage.title));
        System.out.println(scenarioContext.get("TEST"));
        Assert.assertEquals("The Playground", $(HomePage.title).getText());
    }
}
