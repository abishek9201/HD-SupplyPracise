package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/Features/demo.feature"},
        glue = {"stepDefinations"},
        plugin = {"json:target/cucumber.json"})
public class TestRunner {
}