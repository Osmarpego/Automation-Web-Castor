import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features/crear_cuenta_web.feature"
        ,glue={"practica.automation.stepdefinitions"},
        tags = "@FieldValidation"
)

public class Runner {

}
