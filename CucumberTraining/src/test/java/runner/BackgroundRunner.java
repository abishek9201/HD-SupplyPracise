package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features/Background.feature",glue="stepDefinations",
plugin={"pretty","html:Reports/HtmlReports/background.html","junit:Reports/JUnitReports/background.xml",
		"json:Reports/JsonReports/background.json"})
public class BackgroundRunner {

}
