package runnerTest;


import org.junit.runner.RunWith;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;



@Test
@RunWith(Cucumber.class)
@CucumberOptions(
		features = { "src/test/resources/features" },
		glue = { "stepDefinition", "appHooks" },
		plugin = { "pretty","html:target/reports/cucumber-reports", 
				   "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm",
				   "json:target/cucumber-report/cucumber.json",
				   "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
		monochrome=true
		//tags="@stack"
		)
//public class TestRunner {
//	
//}

public class TestRunner extends AbstractTestNGCucumberTests {
	@Override
	@DataProvider(parallel = true)
	public Object[][] scenarios() {

		return super.scenarios();
	}
}
//	@BeforeTest
//    @Parameters({"browser"})
//    public void defineBrowser(String browser) throws Throwable {
//		configReader.loadConfig();
//		configReader.setBrowserType(browser);
//		System.out.println(" in runner " + browser);
//		}
//}