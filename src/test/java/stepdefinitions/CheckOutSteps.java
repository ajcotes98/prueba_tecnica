package stepdefinitions;

import com.saucedemo.models.CheckOutModel;
import com.saucedemo.questions.CheckOutComplete;
import com.saucedemo.questions.SuccessLogin;
import com.saucedemo.tasks.CheckOut;
import io.cucumber.java.DataTableType;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;
import java.util.Map;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class CheckOutSteps {

    @DataTableType
    public CheckOutModel checkoutEntry(Map<String, String> entry) {
        return new CheckOutModel(
                entry.get("firstName"),
                entry.get("lastName"),
                entry.get("postalCode")
        );
    }

    @When("they enter their checkout information:")
    public void they_enter_their_checkout_information(List<CheckOutModel> data) {
        data.forEach(dataList ->
                theActorInTheSpotlight().attemptsTo(
                        CheckOut.processCheckOut(dataList)
                )
        );
    }

    @Then("the order should be successfully completed")
    public void the_order_should_be_successfully_completed() {
        theActorInTheSpotlight().should(
                seeThat(CheckOutComplete.isVisible())
        );
    }

}
