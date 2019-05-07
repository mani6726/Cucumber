package stepdefinition;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(features= "src/test/resources",glue= {"stepdefinition"},plugin= {"html:target"},tags={"@smoke"})


public class Testrunner {
	
	
	

}
