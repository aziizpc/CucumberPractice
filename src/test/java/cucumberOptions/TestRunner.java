package cucumberOptions;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
			features = "src/test/java/features",	// We can pass individual file name as well
			glue = "stepDefinitions"	// Just the package name (cucumberOptions and this package should be in the same hierarchy)
		)

public class TestRunner {

}