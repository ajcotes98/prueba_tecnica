package com.saucedemo.tasks;

import com.saucedemo.interactions.WaitStopInteraction;
import com.saucedemo.models.CheckOutModel;
import com.saucedemo.ui.CheckoutPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static net.serenitybdd.screenplay.Tasks.instrumented;


public class CheckOut implements Task {

    private final CheckOutModel data;

    public CheckOut(CheckOutModel data) {
        this.data = data;
    }

    public static CheckOut processCheckOut(CheckOutModel data) {
        return instrumented(CheckOut.class, data);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(CheckoutPage.BUTTON_CHECKOUT),
                Enter.theValue(data.getFirstName()).into(CheckoutPage.INPUT_FIRST_NAME),
                Enter.theValue(data.getLastName()).into(CheckoutPage.INPUT_LAST_NAME),
                Enter.theValue(data.getPostalCode()).into(CheckoutPage.INPUT_POSTAL_CODE),
                Click.on(CheckoutPage.BUTTON_CONTINUE),
                Click.on(CheckoutPage.BUTTON_FINISH),
                WaitStopInteraction.enSegundos(3)
        );
    }

}
