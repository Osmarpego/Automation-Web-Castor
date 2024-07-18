package practica.automation.stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;
import org.json.simple.parser.ParseException;
import practica.automation.steps.stepsPIMModule;

import java.io.FileNotFoundException;
import java.io.IOException;

public class stepDefinitionPIM {

    @Steps(shared = true)
    stepsPIMModule userPIM;

    @When("Select add button")
    public void select_add_button() throws InterruptedException {
        userPIM.selectAddButton();
    }

    @When("Fill out the form")
    public void fill_out_the_form() throws InterruptedException, IOException, ParseException {
        userPIM.fillForm();
    }

    @When("Select Save Button")
    public void select_save_button() throws InterruptedException {
        userPIM.selectSaveButton();
    }

    @Then("I verify successful registration")
    public void verifyRegisteredUser() throws InterruptedException {
        userPIM.verifyUser();
    }

    @When("Find user for employee information")
    public void find_user_to_edit() throws InterruptedException, IOException, ParseException {
        userPIM.findUserToEdit();
    }

    @When("Select search button")
    public void search_user() throws InterruptedException {
        userPIM.selectSearchAndSelectUser();
    }

    @When("select user to edit")
    public void select_user(){
        userPIM.selectOptionEdit();
    }

    @When("edit user fields")
    public void edit_user_fields() throws InterruptedException {
        userPIM.editUserFields();
    }

    @When("select user to delete")
    public void select_user_to_delete() throws InterruptedException {
        userPIM.deleteUser();
    }

    @When("confirm deletion process")
    public void confirm_deletion_process() throws InterruptedException {
        userPIM.confirmProcessDelete();
    }

    @Then("verify span with no record found")
    public void verify_span_information() throws InterruptedException {
        userPIM.verify_record_found();
    }

    @Then("verify span with errors")
    public void verify_span_error() throws InterruptedException {
        userPIM.verify_errors();
    }
}
