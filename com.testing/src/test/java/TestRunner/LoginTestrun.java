package TestRunner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(features = ".//Feature/Login.feature", 
glue = "StepDefinition", 
dryRun = false, 
monochrome = false,
plugin= {
		"pretty","html:target/Cucumber-report/report1.html"
})

public class LoginTestrun {
	
	
	}



