package starter.login;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class DoNewUser implements Task {


    private final String email;


    public DoNewUser(String name) {
        this.email = name;

    }

    public static Performable Sends(String n){
        return instrumented(DoNewUser.class, n);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(email).into(LoginForm.EMAIL_CREATE),
                Click.on(LoginForm.BTNSubmitCreate)
        );
    }

}
