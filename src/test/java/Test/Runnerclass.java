package Test;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(

		features = {"src\\test\\resources\\Execution\\guru99.feature"},
		glue = {"Test"},

		//tags = "@addCustomer or @addTarif",
		plugin ="pretty"
		)



public class Runnerclass extends AbstractTestNGCucumberTests {

}
