package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/resources/features",
glue = "com/stepDefinition")
public class TestNGCucumberRunner extends AbstractTestNGCucumberTests {
}
