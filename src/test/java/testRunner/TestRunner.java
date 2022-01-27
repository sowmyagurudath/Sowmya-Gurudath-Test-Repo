package testRunner;



import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;





@RunWith(Cucumber.class)


@CucumberOptions
(strict = true, features = { ".//Features" },glue="stepDefinition",
			plugin = { "pretty", "html:target/Destination"},
					monochrome=true,
					tags="@test"
					
					//tags={"@Smoke,@Regression"}

			)



public class TestRunner extends AbstractTestNGCucumberTests {
	 
}



