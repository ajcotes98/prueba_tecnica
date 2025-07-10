package com.saucedemo.ui;

import net.serenitybdd.annotations.DefaultUrl;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

@DefaultUrl("https://www.saucedemo.com/")
public class LoginPage extends PageObject {
    public static final Target INPUT_USERNAME = Target.the("Username input").located(By.name("user-name"));
    public static final Target INPUT_PASSWORD = Target.the("Password input").located(By.name("password"));
    public static final Target BUTTON_LOGIN = Target.the("Login button").located(By.id("login-button"));
    public static final Target VALIDATION_LOGIN = Target.the("Login successful").located(By.xpath("//span[text()='Products']"));
    public static final Target ERROR_LOGIN = Target.the("Login error message").located(By.cssSelector("h3[data-test='error']"));
}