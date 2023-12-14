package appHooks;

import java.io.File;
import java.io.IOException;
import java.sql.DriverManager;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import factory.DriverFactory;
import io.cucumber.java.AfterAll;
import io.cucumber.java.AfterStep;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.Scenario;

import utilities.LoggerLoad;
import utilities.configReader;

public class Hooks {
	 
	private static DriverFactory driverfactory;
	private static WebDriver driver;
	static Scenario scenario;
    
	@BeforeAll
	public static void before() throws Throwable {
		
		LoggerLoad.info("Loading config file");
		configReader.loadConfig();
		String browser = configReader.getBrowserType();
		
		driverfactory = new DriverFactory();
		driver=driverfactory.initializeDrivers(browser);
		LoggerLoad.info(browser);
	}
	
	@AfterStep
	public void attachScreenshot(Scenario scenario) {
		
		if(scenario.isFailed()) {
			byte[] screenshotTaken = ((TakesScreenshot)DriverManager.getDrivers()).getScreenshotAs(OutputType.BYTES);
			scenario.attach(screenshotTaken, "image/png", "error screen");
		}
		
	}
	
//	@AfterStep
//	public void afterstep(Scenario scenario) throws IOException {
//		if (scenario.isFailed()) {
//			LoggerLoad.error("Steps Failed , Taking Screenshot");
//			TakesScreenshot ts=(TakesScreenshot)driver;
//			File source=ts.getScreenshotAs(OutputType.FILE);
//			File target=new File(".\\screenshots\\takingscreenshot.png");
//			FileUtils.copyFile(source, target);
//          }
//	}
	
	@AfterAll
	public static void after() {
		LoggerLoad.info("Closing driver");
		driverfactory.closeallDriver();
	}

}
