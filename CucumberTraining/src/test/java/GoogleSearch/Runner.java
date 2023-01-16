package GoogleSearch;


import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/GoogleSearch",glue="GoogleSearch",monochrome=true
,plugin= {"pretty","html:Reports/HtmlReports/report1.html","pretty","junit:Reports/JUnitReports/report1.xml","pretty","json:Reports/JsonReports/report1.json"}
,tags="@SmokeTest"
)
public class Runner {

}
