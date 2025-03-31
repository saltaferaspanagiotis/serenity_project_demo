package demo.stepdefinitions;

import demo.config.TestConfig;
import demo.questions.HomePageQuestionsUI;
import demo.utils.ScenarioContext;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.core.pages.PageObject;
import org.springframework.beans.factory.annotation.Autowired;


public class StepDefinitions extends PageObject {

    @Autowired
    private HomePageQuestionsUI homePageQuestionsUI;

    @Autowired
    private ScenarioContext scenarioContext;

    @Autowired
    private TestConfig testConfig;


    @When("the user browses to the Test Automation Playground")
    public void theUserBrowsesToTheTestAutomationPlayground() {
        openAt("https://play1.automationcamp.ir/");
        scenarioContext.set("TEST","001");
    }

    @Then("home page is displayed")
    public void homePageIsDisplayed() {
        homePageQuestionsUI.verifyHomePageTitle();
    }
}
