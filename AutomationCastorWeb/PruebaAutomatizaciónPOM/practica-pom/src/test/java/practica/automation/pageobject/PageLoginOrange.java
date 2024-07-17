package practica.automation.pageobject;

import net.serenitybdd.core.pages.PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class PageLoginOrange extends PageObject {


    @FindBy(xpath = "//input[@name='username']")
    WebElement inputUsername;

    @FindBy(xpath = "//input[@name='password']")
    WebElement inputPassword;

    @FindBy(xpath = "//button[@type='submit']")
    WebElement buttonLogIn;

    public void insertUser(String user) {
        inputUsername.sendKeys(user);
    }

    public void insertPassword(String pass) {
        inputPassword.sendKeys(pass);
    }

    public void selectLogIn() {
        buttonLogIn.click();
    }

}
