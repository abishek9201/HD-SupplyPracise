package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features/Parameters.feature",glue="stepDefinations"
,plugin={"pretty","html:Reports/HtmlReports/Parameter.html","json:Reports/JsonReports/Parameter.json"
,"junit:Reports/JUnitReports/Parameter.xml"},monochrome=true)
public class ParametersRunner {

}
