//dryRun is which is not executed

package com.qa.runner;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
//where is feature files and where are step definition files
@CucumberOptions(
		features= {"D:\\Users\\Swapna\\eclipse-workspace2020\\10NovBDDCucumberEdureka1\\src\\test\\java\\com\\qa\\features"},
		
		glue= {"com.qa.steps"} ,
				
				 plugin = {"pretty",
						   "html:results/html",
						    "json:results/json/results.json",
						    "junit:results/junit/cucumber.xml"} 
				// ,dryRun = true          //executes which don't have step definition files, give this .
				// ,tags = "@ebay"   //executes only certain scenarios, give this
				)


//v can use full path in glue like below
/*@CucumberOptions(
features= {"D:\\Users\\Swapna\\eclipse-workspace2020\\10NovBDDCucumberEdureka1\\src\\test\\java\\com\\qa\\features"},
glue= {"D:\Users\Swapna\eclipse-workspace2020\10NovBDDCucumberEdureka1\src\test\java\com\qa\steps"}
) */


public class TestRunner {

	}
