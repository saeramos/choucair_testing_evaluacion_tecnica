package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import starter.search.SearchFor;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class IndexStepDefinitions {

    @When("^s?he searches for \"(.*)\"")
    public void search_for(String term) {
        theActorInTheSpotlight().attemptsTo( SearchFor.term(term) );
    }
}
