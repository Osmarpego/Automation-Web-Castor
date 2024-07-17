package practica.automation.steps;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.annotations.Steps;
import org.junit.Assert;
import practica.automation.pageobject.PagePIMModule;

public class stepsPIMModule {


    @Steps(shared = true)
    PagePIMModule pagePIMModule;

    @Step("#actor select add button")
    public void selectAddButton() throws InterruptedException {
        pagePIMModule.selectButtonAdd();
    }

    @Step("#actor fill out the form")
    public void fillForm() throws InterruptedException {
        Thread.sleep(2000);
        pagePIMModule.sendFirstName("Test");
        pagePIMModule.sendMidleName("QA");
        pagePIMModule.sendLastName("Automation");
    }


    @Step("#actor select save button")
    public void selectSaveButton() throws InterruptedException {
        pagePIMModule.clickSave();
    }

    @Step("#actor verify registered user")
    public void verifyUser() throws InterruptedException {
        Assert.assertEquals("Test Automation", pagePIMModule.getFullName());
    }

    @Step("#actor find user to edit")
    public void findUserToEdit(String name) throws InterruptedException {
        pagePIMModule.selectInputEmployeeName(name);
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
