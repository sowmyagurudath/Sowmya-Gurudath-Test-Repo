package testRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

//@RunWith(Cucumber.class)


@CucumberOptions
( features = { ".//Features" },glue="stepDefinition",
			plugin = { "pretty", "html:target/Destination"},
					monochrome=true,
					
					
					tags="@Regression"

			)



public class TestRunner extends AbstractTestNGCucumberTests {
	 
}

