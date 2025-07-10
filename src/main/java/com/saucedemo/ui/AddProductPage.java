package com.saucedemo.ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class AddProductPage extends PageObject {
    public static Target BUTTON_SELECT_PRODUCT(String productName) {
        return Target.the("Select the product " + productName)
                .located(By.xpath("//div[normalize-space()='" + productName + "']"));
    }
    public static Target BUTTON_ADD_BACKPACK =  Target.the("Add back pack").located(By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']"));
    public static Target BUTTON_ADD_BOLTSHIRT =  Target.the("Add Bolt T-Shirt").located(By.xpath("//button[@id='add-to-cart-sauce-labs-bolt-t-shirt']"));
    public static Target BUTTON_ADD_FLECEE =  Target.the("Add Fleece Jacket").located(By.xpath("//button[@id='add-to-cart-sauce-labs-fleece-jacket']"));
    public static Target BUTTON_ADD_ONESIE =  Target.the("Add  Onesie").located(By.xpath("//button[@id='add-to-cart-sauce-labs-onesie']"));
    public static Target BUTTON_ADD_BIKE =  Target.the("Add Bike Light").located(By.xpath("//button[@id='add-to-cart-sauce-labs-bike-light']"));
    public static Target BUTTON_ADD_TSHIRTRED =  Target.the("Add T-Shirt Red").located(By.xpath("//button[@id='add-to-cart-test.allthethings()-t-shirt-(red)']"));
    public static Target BUTTON_CART =  Target.the("Open Cart").located(By.xpath("//a[@class='shopping_cart_link']"));
    public static Target LBL_CART =  Target.the("Validate Cart").located(By.xpath("//span[text()='Your Cart']"));
}
