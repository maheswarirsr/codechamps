package runnerTest;


import org.junit.runner.RunWith;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(
		features = { "src/test/resources/features" },
		glue = { "stepDefinition", "appHooks" },
		plugin = { "pretty", "html:target/Reports/CucumberReport.html" },
<<<<<<< HEAD
		tags="@stack"
=======
		tags="@link"
>>>>>>> 217f887e66efc0138209bc3c39d6d84a12ad220e
		)
public class TestRunner {
	
}

//public class TestRunner extends AbstractTestNGCucumberTests {
//	@Override
//	@DataProvider(parallel = false)
//	public Object[][] scenarios() {
//
//		return super.scenarios();
//	}
//	@BeforeTest
//    @Parameters({"browser"})
//    public void defineBrowser(String browser) throws Throwable {
//		configReader.loadConfig();
//		configReader.setBrowserType(browser);
//		System.out.println(" in runner " + browser);
//
//}
//}