package practica.automation.steps;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.annotations.Steps;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.junit.Assert;
import practica.automation.pageobject.PagePIMModule;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class stepsPIMModule {


    @Steps(shared = true)
    PagePIMModule pagePIMModule;

    String firstName, lastName;

    @Step("#actor select add button")
    public void selectAddButton() throws InterruptedException {
        pagePIMModule.selectButtonAdd();
    }

    @Step("#actor fill out the form")
    public void fillForm() throws InterruptedException, IOException, ParseException {
        Thread.sleep(2000);
        Object obj = new JSONParser().parse(new FileReader("src/test/resources/Datos/DatosUser.json"));
        JSONObject data = (JSONObject) obj;
        data.toJSONString();
        firstName = data.get("firstName").toString();
        lastName = data.get("lastName").toString();
        pagePIMModule.sendFirstName(data.get("firstName").toString());
        pagePIMModule.sendMidleName(data.get("midleName").toString());
        pagePIMModule.sendLastName(data.get("lastName").toString());
    }


    @Step("#actor select save button")
    public void selectSaveButton() throws InterruptedException {
        pagePIMModule.clickSave();
    }

    @Step("#actor verify registered user")
    public void verifyUser() throws InterruptedException {
        Assert.assertEquals(firstName + " "+lastName, pagePIMModule.getFullName());
    }

    @Step("#actor find user to edit")
    public void findUserToEdit() throws InterruptedException, IOException, ParseException {
        Object obj = new JSONParser().parse(new FileReader("src/test/resources/Datos/DatosUser.json"));
        JSONObject data = (JSONObject) obj;
        data.toJSONString();
        firstName = data.get("firstName").toString();
        lastName = data.get("lastName").toString();
        pagePIMModule.selectInputEmployeeName(data.get("firstName").toString()+" "+data.get("midleName").toString());
    }

    @Step("#actor select search button ")
    public void selectSearchAndSelectUser() throws InterruptedException {
        pagePIMModule.clickSave();
    }

    @Step("actor select option to edit user")
    public void selectOptionEdit(){
        pagePIMModule.clickEditUser();
    }

    @Step("#actor edit user fields")
    public void editUserFields() throws InterruptedException {
        pagePIMModule.sendFirstName("Test Edit");
    }

    @Step("#actor select delete option")
    public void deleteUser() throws InterruptedException {
        pagePIMModule.clickDeleteUser();
    }

    @Step("#actor confirm deletion process")
    public void confirmProcessDelete() throws InterruptedException {
        pagePIMModule.clickConfirmDelete();
    }

    @Step("#Actor verifies log information")
    public void verify_record_found() throws InterruptedException {
        pagePIMModule.getTextSpan();
    }

    @Step("#Actor verifies errors")
    public void verify_errors() throws InterruptedException {
        Assert.assertEquals("Required", pagePIMModule.getMessageError(0));
    }
}
