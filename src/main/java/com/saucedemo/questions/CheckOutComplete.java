package com.saucedemo.questions;

import com.saucedemo.ui.CheckoutPage;
import com.saucedemo.ui.LoginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class CheckOutComplete implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        String actualText = CheckoutPage.CHECKOUT_COMPLETE_MESSAGE.resolveFor(actor).getText().trim();
        return actualText.equalsIgnoreCase("Checkout: Complete!");
    }

    public static Question<Boolean> isVisible() {
        return new CheckOutComplete();
    }
}
