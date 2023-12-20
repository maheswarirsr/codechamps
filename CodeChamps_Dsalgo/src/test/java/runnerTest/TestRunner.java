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
		plugin = { "pretty","html:target/reports/cucumber-reports.html",
				   "pretty","junit:target/reports/cucumber.xml",
				   "pretty","io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm",
				   "pretty","json:target/cucumber-report/cucumber.json",
				   "pretty","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
		monochrome=true		
		)
public class TestRunner {
	
}

//public class TestRunner extends AbstractTestNGCucumberTests {
//	@Override
//	@DataProvider(parallel = true)
//	public Object[][] scenarios() {
//
//		return super.scenarios();
//	}
//}
//	@BeforeTest
//    @Parameters({"browser"})
//    public void defineBrowser(String browser) throws Throwable {
//		configReader.loadConfig();
//		configReader.setBrowserType(browser);
//		System.out.println(" in runner " + browser);
//		}
//}