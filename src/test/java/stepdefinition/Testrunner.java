package stepdefinition;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(features= "src/test/resources",glue= {"stepdefinition/Usinglist"},plugin= {"html:target"})


public class Testrunner {
	
	
	

}
