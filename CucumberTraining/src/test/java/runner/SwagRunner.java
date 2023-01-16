package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features/SwagLabs.feature",glue="stepDefinations"
,plugin={"pretty","html:Reports/HtmlReports/Swag.html","json:Reports/JsonReports/Swag.json"
,"junit:Reports/JUnitReports/Swag.xml"},monochrome=true)
public class SwagRunner {

}
