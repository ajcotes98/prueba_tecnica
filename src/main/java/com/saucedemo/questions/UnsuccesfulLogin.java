package com.saucedemo.questions;

import com.saucedemo.ui.LoginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Visibility;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;

public class UnsuccesfulLogin implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        String actualText = LoginPage.ERROR_LOGIN.resolveFor(actor).getText().trim();
        return actualText.equalsIgnoreCase("Epic sadface: Username and password do not match any user in this service");
    }

    public static Question<Boolean> loginError() {
        return new UnsuccesfulLogin();
    }
}