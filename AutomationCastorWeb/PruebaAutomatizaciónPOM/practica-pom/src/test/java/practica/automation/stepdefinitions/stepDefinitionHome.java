package practica.automation.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;
import org.json.simple.parser.ParseException;
import practica.automation.steps.stepsHome;
import practica.automation.steps.stepsLogin;

import java.io.IOException;

public class stepDefinitionHome {

    @Steps(shared = true)
    stepsHome userHome;

    @Given("Select PIM module")
    public void enter_the_orange_page(){
        userHome.selectPIMModule();
    }
}
