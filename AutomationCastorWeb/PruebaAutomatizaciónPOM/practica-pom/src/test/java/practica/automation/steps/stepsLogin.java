package practica.automation.steps;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.annotations.Steps;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import practica.automation.pageobject.PageLoginOrange;

import java.io.FileReader;
import java.io.IOException;

public class stepsLogin {

    @Steps(shared = true)
    PageLoginOrange pageHomeOrange;

    @Step("#actor enter to orange page")
    public void enterOrange() {
        pageHomeOrange.setDefaultBaseUrl("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        pageHomeOrange.open();
    }

    @Step("#actor enter the credentials")
    public void enterCredentials() throws InterruptedException, IOException, ParseException {
        Object obj = new JSONParser().parse(new FileReader("src/test/resources/Datos/Datos.json"));
        JSONObject data = (JSONObject) obj;
        data.toJSONString();
        pageHomeOrange.insertUser(data.get("user").toString());
        pageHomeOrange.insertPassword(data.get("password").toString());
        pageHomeOrange.selectLogIn();
    }
}
