package com.saucedemo.ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CheckoutPage extends PageObject {
    public static final Target BUTTON_CHECKOUT = Target.the("Checkout button")
            .located(By.id("checkout"));

    public static final Target INPUT_FIRST_NAME = Target.the("First name input field")
            .located(By.id("first-name"));

    public static final Target INPUT_LAST_NAME = Target.the("Last name input field")
            .located(By.id("last-name"));

    public static final Target INPUT_POSTAL_CODE = Target.the("Postal code input field")
            .located(By.id("postal-code"));

    public static final Target BUTTON_CONTINUE = Target.the("Continue button")
            .located(By.id("continue"));

    public static final Target BUTTON_FINISH = Target.the("Finish button")
            .located(By.id("finish"));

    public static final Target CHECKOUT_COMPLETE_MESSAGE = Target.the("Checkout complete confirmation")
            .located(By.xpath("//span[text()='Checkout: Complete!']"));
}
