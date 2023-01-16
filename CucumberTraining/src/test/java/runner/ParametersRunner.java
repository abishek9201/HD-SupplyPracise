package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features/Parameters.feature",glue="stepDefinations")
public class ParametersRunner {

}
