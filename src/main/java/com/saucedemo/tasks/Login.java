package com.saucedemo.tasks;

import com.saucedemo.models.UserModel;
import com.saucedemo.ui.LoginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Login implements Task {

    private final UserModel userModel;

    public Login(UserModel userModel) {
        this.userModel = userModel;
    }

    public static Login using(UserModel userModel) {
        return instrumented(Login.class, userModel);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(userModel.getUsername()).into(LoginPage.INPUT_USERNAME),
                Enter.theValue(userModel.getPassword()).into(LoginPage.INPUT_PASSWORD),
                Click.on(LoginPage.BUTTON_LOGIN)
        );
    }

}
