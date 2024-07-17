package practica.automation.pageobject;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class PageHomeOrange extends PageObject {


    @FindBy(xpath = "//span[text()='PIM']")
    WebElement butttonPIM;

    public void selectPIMModule() {
        butttonPIM.click();
    }

}
