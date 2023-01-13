package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features/StepByStep.feature",glue="StepDefinations",monochrome=true
,plugin= {"pretty","html:Reports/HtmlReports/stepby1.html"
		,"pretty","junit:Reports/JUnitReports/stepby2.xml","pretty","json:Reports/JsonReports/stepby3.json"})
public class StepRunner {

}
