import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/features/"
        ,glue={"stepDefinition"},
        plugin ={"pretty","html:target/CucumberReport.html"},
        tags = "@Regression and not @Scenario",
        monochrome = false

)
public class TestRunner {


}
