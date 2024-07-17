package practica.automation.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;
import org.json.simple.parser.ParseException;
import practica.automation.steps.stepsLogin;

import java.io.IOException;

public class stepDefinitionLogin {

    @Steps(shared = true)
    stepsLogin userHome;

    @Given("Enter the Orange HRM Page with credentials")
    public void enter_the_orange_page() throws IOException, ParseException, InterruptedException {
        userHome.enterOrange();
        userHome.enterCredentials();
    }

    @When("I enter my credentials")
    public void i_enter_my_credentials() throws IOException, ParseException, InterruptedException {

    }
}
