package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features/HYR.feature",glue="stepDefinations",
plugin={"pretty","html:Reports/HtmlReports/hyr.html","json:Reports/JsonReports/hyr.json",
		"junit:Reports/JUnitReports/hyr.xml"},monochrome=true)
public class HyrRunner {

}
