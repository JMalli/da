package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber; //import because of error on line no 8 

@RunWith(Cucumber.class)
@CucumberOptions (features={ "src/test/resources/features"}, 
glue= {"stepDefinitions","newalgoutilities"},
monochrome=true,
dryRun=false,
plugin= {"pretty",
		"html:target/htmlReports/report.html",
		"json:target/jsonReports/report.json",
		"junit:target/junitReports/report.xml",
     	"html:target/cucumber.html","io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm",
        "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
    	
   })
public class TestRunner{

	
}
