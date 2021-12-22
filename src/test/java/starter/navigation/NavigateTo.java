package starter.navigation;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

public class NavigateTo  {

    public static Performable AutomationPracticeHomePage() {
        return Task.where("{0} opens the automationpractice.com home page",
                Open.browserOn().the(AutomationPracticeHomePage.class)
        );
    }

    public static Performable AutomationPracticeLoginPage() {
        return Task.where("{0} opens the automationpractice.com home page",
                Open.browserOn().the(AutomationPracticeLoginPage.class)
        );
    }

}