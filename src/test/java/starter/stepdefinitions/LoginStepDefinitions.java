package starter.stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import starter.login.DoLogin;
import starter.navigation.NavigateTo;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

public class LoginStepDefinitions {

    String name;
    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^(.*) in to page Sign In")
    public void in_to_page_Sign_In(String name) {
        // Write code here that turns the phrase above into concrete actions
        this.name = name;
    }

    @When("he sends their valid credentials")
    public void he_sends_their_valid_credentials() {
        // Write code here that turns the phrase above into concrete actions
        theActorCalled(name).attemptsTo(NavigateTo.AutomationPracticeLoginPage(), DoLogin.Credentials("sescobar@choucair.com","123456"));
    }

}
