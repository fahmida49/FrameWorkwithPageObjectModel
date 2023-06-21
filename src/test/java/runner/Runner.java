package runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src\\test\\resources\\features\\customer\\","src\\test\\resources\\features\\order\\"},	
		glue = {"step_definitions"},
		tags = {},
		monochrome = true,
		dryRun = false,
		plugin = {"pretty", "html:test-output", "json:target/cucumber-report/cucumber.json" }
)
public class Runner {

}

//Test Automation Framework
//with Cucumber BDD and Page Object Model

