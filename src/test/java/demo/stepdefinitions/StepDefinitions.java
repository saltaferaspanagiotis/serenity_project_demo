package demo.stepdefinitions;

import demo.questions.HomePageQuestionsUI;
import io.cucumber.java.Before;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;
import net.serenitybdd.core.pages.PageObject;

public class StepDefinitions extends PageObject {

    @Steps
    HomePageQuestionsUI homePageQuestionsUI;

    @Before
    public void setup(){
    }

    @When("the user browses to the Test Automation Playground")
    public void theUserBrowsesToTheTestAutomationPlayground() {
        openAt("https://play1.automationcamp.ir/");
    }

    @Then("home page is displayed")
    public void homePageIsDisplayed() {
        homePageQuestionsUI.verifyHomePageTitle();
    }
}
