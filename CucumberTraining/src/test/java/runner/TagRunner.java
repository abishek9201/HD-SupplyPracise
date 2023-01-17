package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features/Tags.feature"
,glue={"stepDefinations"}
//,tags="@Sanity and @Regression"
//,tags="@Sanity or @Regression or @Smoke or @Functional"
//,tags="@All"
,tags="(@Sanity and @Regression) or @Functional"
)
public class TagRunner {

}
