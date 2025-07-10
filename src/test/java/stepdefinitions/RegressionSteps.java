package stepdefinitions;

import com.saucedemo.models.CheckOutModel;
import com.saucedemo.models.ProductsModel;
import com.saucedemo.models.UserModel;
import com.saucedemo.tasks.AddProductToCart;
import com.saucedemo.tasks.Cart;
import com.saucedemo.tasks.CheckOut;
import com.saucedemo.tasks.Login;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class RegressionSteps {

    @Given("the user logs in with username {string} and password {string}")
    public void the_user_logs_in_with_username_and_password(String username, String password) {
        OnStage.theActorCalled("user").attemptsTo(
                Login.using(new UserModel(username, password))
        );
    }

    @Given("the user adds the product {string} to the cart")
    public void the_user_adds_the_product_to_the_cart(String productName) {
        theActorInTheSpotlight().attemptsTo(
                AddProductToCart.addProductToCart(new ProductsModel(productName)),
                Cart.goToCart()
        );
    }

    @When("the user enters their checkout information {string}, {string} and {string}")
    public void the_user_enters_their_checkout_information_and(String firstName, String lastName, String postalCode) {
        theActorInTheSpotlight().attemptsTo(
                CheckOut.processCheckOut(
                        new CheckOutModel(firstName, lastName, postalCode)
                )
        );
    }
}
