package com.saucedemo.tasks;

import com.saucedemo.interactions.WaitStopInteraction;
import com.saucedemo.ui.AddProductPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Cart implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitStopInteraction.enSegundos(2),
                Click.on(AddProductPage.BUTTON_CART),
                WaitStopInteraction.enSegundos(2)
        );
    }

    public static Cart goToCart() {
        return instrumented(Cart.class);
    }
}
