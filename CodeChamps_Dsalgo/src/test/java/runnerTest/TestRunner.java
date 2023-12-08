package runnerTest;


import org.junit.runner.RunWith;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import utilities.configReader;


@RunWith(Cucumber.class)
@CucumberOptions(
		features = { "src/test/resources/features" },
		glue = { "stepDefinition", "appHooks" },
		plugin = { "pretty", "html:target/Reports/CucumberReport.html" },
		tags="@array"
		)
//public class TestRunner {
//	
//}

public class TestRunner extends AbstractTestNGCucumberTests {
	@Override
	@DataProvider(parallel = false)
	public Object[][] scenarios() {

		return super.scenarios();
	}
	@BeforeTest
    @Parameters({"browser"})
    public void defineBrowser(String browser) throws Throwable {
		configReader.loadConfig();
		configReader.setBrowserType(browser);
		System.out.println(" in runner " + browser);
		}
}