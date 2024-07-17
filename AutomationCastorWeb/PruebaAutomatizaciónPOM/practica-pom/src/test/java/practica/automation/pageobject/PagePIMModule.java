package practica.automation.pageobject;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class PagePIMModule extends PageObject {

    @FindBy(xpath = "//div[@class='orangehrm-header-container']/button")
    WebElement buttonAdd;

    @FindBy(xpath = "//input[@name='firstName']")
    WebElement inputFirstName;

    @FindBy(xpath = "//input[@name='middleName']")
    WebElement inputMiddleName;

    @FindBy(xpath = "//input[@name='lastName']")
    WebElement inputLastName;

    @FindBy(xpath = "//button[@type='submit']")
    WebElement buttonSave;

    @FindBy(xpath = "//h6[@class='oxd-text oxd-text--h6 --strong']")
    WebElement fullName;

    @FindBy(xpath = "//input[@placeholder='Type for hints...']")
    List<WebElement> listInputs;

    @FindBy(xpath = "//i[@class='oxd-icon bi-pencil-fill']")
    WebElement editUser;

    @FindBy(xpath = "//button[@class='oxd-button oxd-button--medium oxd-button--label-danger orangehrm-button-margin']")
    WebElement confirmDelete;

    @FindBy(xpath = "//div[@class='orangehrm-horizontal-padding orangehrm-vertical-padding']/span[@class='oxd-text oxd-text--span']")
    WebElement spanNoRecordFound;

    @FindBy(xpath = "//i[@class='oxd-icon bi-trash']")
    WebElement buttonDelete;

    @FindBy(xpath = "//span[@class='oxd-text oxd-text--span oxd-input-field-error-message oxd-input-group__message']")
    List<WebElement> listErrors;

    public void selectButtonAdd(){
        buttonAdd.click();
    }

    public void sendFirstName(String name){
        inputFirstName.clear();
        inputFirstName.sendKeys(name);
    }

    public void sendMidleName(String midleName) throws InterruptedException {
        inputMiddleName.sendKeys(midleName);
    }

    public void sendLastName(String lastName) throws InterruptedException {
        inputLastName.sendKeys(lastName);
    }

    public void clickSave(){
      buttonSave.click();
    }

    public String getFullName() throws InterruptedException {
        Thread.sleep(10000);
        return fullName.getText().toString();
    }

    public void selectInputEmployeeName(String name) throws InterruptedException {
        Thread.sleep(2000);
        listInputs.get(0).click();
        listInputs.get(0).sendKeys(name);
    }

    public void clickEditUser(){
        editUser.click();
    }

    public void clickDeleteUser() throws InterruptedException {
        Thread.sleep(2000);
        buttonDelete.click();
    }

    public void clickConfirmDelete() throws InterruptedException {
        Thread.sleep(2000);
        confirmDelete.click();
    }

    public String getTextSpan() throws InterruptedException {
        Thread.sleep(2000);
        return spanNoRecordFound.getText().toString();
    }

    public String getMessageError(int i) throws InterruptedException {
        Thread.sleep(2000);
        return listErrors.get(i).getText().toString();
    }



}
