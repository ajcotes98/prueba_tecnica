package com.saucedemo.tasks;

import com.saucedemo.models.ProductsModel;
import com.saucedemo.ui.AddProductPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;


import static net.serenitybdd.screenplay.Tasks.instrumented;

public class AddProductToCart implements Task {

    private final ProductsModel productsModel;

    public AddProductToCart(ProductsModel productsModel) {
        this.productsModel = productsModel;
    }

    public static AddProductToCart addProductToCart(ProductsModel productsModel) {
        return instrumented(AddProductToCart.class, productsModel);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {


        switch(productsModel.getProductName()) {

            case "Sauce Labs Backpack":
                actor.attemptsTo(Click.on(AddProductPage.BUTTON_ADD_BACKPACK));
                break;

            case "Sauce Labs Bike Light":
                actor.attemptsTo(Click.on(AddProductPage.BUTTON_ADD_BIKE));
                break;

            case "Sauce Labs Bolt T-Shirt":
                actor.attemptsTo(Click.on(AddProductPage.BUTTON_ADD_BOLTSHIRT));
                break;

            case "Sauce Labs Onesie":
                actor.attemptsTo(Click.on(AddProductPage.BUTTON_ADD_ONESIE));
                break;

            case "Sauce Labs Fleece Jacket":
                actor.attemptsTo(Click.on(AddProductPage.BUTTON_ADD_FLECEE));
                break;

            case "Test.allTheThings() T-Shirt (Red)":
                actor.attemptsTo(Click.on(AddProductPage.BUTTON_ADD_TSHIRTRED));
                break;

        }

    }
}
