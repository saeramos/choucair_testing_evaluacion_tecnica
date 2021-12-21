package starter.stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import starter.navigation.NavigateTo;
import starter.search.SearchFor;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class IndexStepDefinitions {
    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^(.*) is on the AutomationPractice home page")
    public void on_the_AutomationPractice_home_page(String actor) {
        theActorCalled(actor).attemptsTo(NavigateTo.AutomationPracticeHomePage());
    }
    @When("^s?he searches for \"(.*)\"")
    public void search_for(String term) {
        theActorInTheSpotlight().attemptsTo( SearchFor.term(term) );
    }
    @Then("^all the result titles should contain the word \"(.*)\"")
    public void all_the_result_titles_should_contain_the_word(String term) {

    }


}
