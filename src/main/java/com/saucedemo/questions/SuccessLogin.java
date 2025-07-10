package com.saucedemo.questions;

import com.saucedemo.ui.LoginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class SuccessLogin implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        String actualText = LoginPage.VALIDATION_LOGIN.resolveFor(actor).getText().trim();
        return actualText.equalsIgnoreCase("Products");
    }

    public static Question<Boolean> isVisible() {
        return new SuccessLogin();
    }
}