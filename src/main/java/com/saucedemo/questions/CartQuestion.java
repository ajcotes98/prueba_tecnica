package com.saucedemo.questions;

import com.saucedemo.ui.AddProductPage;
import com.saucedemo.ui.LoginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class CartQuestion implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        String actualText = AddProductPage.LBL_CART.resolveFor(actor).getText().trim();
        return actualText.equalsIgnoreCase("Your Cart");
    }

    public static Question<Boolean> isVisible() {
        return new CartQuestion();
    }
}
