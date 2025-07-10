package stepdefinitions;

import com.saucedemo.models.ProductsModel;
import com.saucedemo.questions.CartQuestion;
import com.saucedemo.tasks.AddProductToCart;
import com.saucedemo.tasks.Cart;
import io.cucumber.java.DataTableType;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;
import java.util.Map;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class AddProductsSteps {

    @DataTableType
    public ProductsModel userEntry(Map<String, String> entry) {
        return new ProductsModel(
                entry.get("productName")
        );
    }

    @When("they add the following product")
    public void they_add_the_following_product(List<ProductsModel> products) {

        products.forEach(product ->
                theActorInTheSpotlight().attemptsTo(
                        AddProductToCart.addProductToCart(product)
                )
        );

        theActorInTheSpotlight().attemptsTo(
                Cart.goToCart()
        );
    }
    @Then("the cart should display the product")
    public void the_cart_should_display_the_product() {
        theActorInTheSpotlight().should(
                seeThat(CartQuestion.isVisible())
        );

    }


}
