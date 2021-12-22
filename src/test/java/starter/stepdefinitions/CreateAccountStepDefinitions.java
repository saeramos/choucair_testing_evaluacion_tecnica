package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import starter.login.DoNewUser;
import starter.navigation.NavigateTo;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

public class CreateAccountStepDefinitions {
    String n;

    @Given("^(.*) in to page Create Account")
    public void in_to_page_Create_Account(String n) {
        // Write code here that turns the phrase above into concrete actions
        this.n = n;
    }
    @When("he sends email")
    public void he_sends_email() {
        // Write code here that turns the phrase above into concrete actions
        theActorCalled(n).attemptsTo(NavigateTo.AutomationPracticeLoginPage(), DoNewUser.Sends("sescobar@choucair.com"));
    }

}
