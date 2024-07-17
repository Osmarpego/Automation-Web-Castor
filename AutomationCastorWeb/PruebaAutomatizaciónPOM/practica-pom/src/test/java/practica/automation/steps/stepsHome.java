package practica.automation.steps;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.annotations.Steps;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import practica.automation.pageobject.PageHomeOrange;

import java.io.FileReader;
import java.io.IOException;

public class stepsHome {

    @Steps(shared = true)
    PageHomeOrange pageHomeOrange;

    @Step("#actor select PIM module")
    public void selectPIMModule() {
        pageHomeOrange.selectPIMModule();
    }
}
