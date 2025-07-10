package stepdefinitions;

import com.saucedemo.models.UserModel;
import com.saucedemo.questions.SuccessLogin;
import com.saucedemo.questions.UnsuccesfulLogin;
import com.saucedemo.tasks.Login;
import com.saucedemo.ui.LoginPage;
import io.cucumber.java.DataTableType;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Open;

import java.util.List;
import java.util.Map;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class LoginSteps {

    @DataTableType
    public UserModel userEntry(Map<String, String> entry) {
        return new UserModel(
                entry.get("username"),
                entry.get("password")
        );
    }

    @Given("the user is on the login page")
    public void theUserIsOnTheLoginPage() {
        theActorInTheSpotlight().attemptsTo(
                Open.browserOn().the(LoginPage.class)
        );

    }

    @When("the user logs in with the following credentials:")
    public void theUserLogsInWithTheFollowingCredentials(List<UserModel> userModels) {
        UserModel userModel = userModels.get(0);
        theActorInTheSpotlight().attemptsTo(
                Login.using(userModel)
        );
    }

    @Then("the user should be redirected to the products page")
    public void theUserShouldBeRedirectedToTheProductsPage() {
        theActorInTheSpotlight().should(
                seeThat(SuccessLogin.isVisible())
        );
    }


    @Then("the user should not be able to log in due to invalid credentials")
    public void theUserShouldNotBeAbleToLogInDueToInvalidCredentials() {
        theActorInTheSpotlight().should(
                seeThat(UnsuccesfulLogin.loginError())
        );
    }
}
