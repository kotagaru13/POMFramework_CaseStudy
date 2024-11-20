package runners;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(

		features = "src//test//resources//feature//CRUD.feature",
		glue = {"stepDefs"},
		monochrome = true,
		dryRun = false,
		plugin = {"pretty",
				"html:target//Reports//HtmlReport.html"
				//"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
				
		}

		)

public class GooglePageRunner extends AbstractTestNGCucumberTests{
	//@DataProvider(parallel = true)
	//public Object[][] scenarios(){
	//	return super.scenarios();
	//}
	
}
