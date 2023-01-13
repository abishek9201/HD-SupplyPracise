package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features/orangehrm.feature",glue="StepDefinations",
plugin={"pretty","html:Reports/HtmlReports/hrm.html","pretty","json:Reports/JsonReports/hrm.json","pretty","junit:Reports/JUnitReports/hrm.xml"}
)
public class OrangeRunner {

}
