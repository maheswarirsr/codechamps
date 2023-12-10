package factory;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import utilities.LoggerLoad;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverFactory {

	public static WebDriver driver;

	
	@BeforeTest
	@Parameters("browser")
	public WebDriver initializeDrivers(String browser) {
		LoggerLoad.info("BROWSER:" + browser);
		if (browser.equalsIgnoreCase("firefox")) {
			LoggerLoad.info("Testing on firefox");
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();

		} else if (browser.equalsIgnoreCase("chrome")) {
			LoggerLoad.info("Testing on chrome");
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();

		} else if (browser.equalsIgnoreCase("edge")) {
			LoggerLoad.info("Testing on Edge");
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();

		}

	return driver;
}
	@Test
	public void test() {
		driver.get("https://dsportalapp.herokuapp.com/");
		driver.manage().window().maximize();
		System.out.println("Test completed Successfully");
	}

	public static WebDriver getdriver() {
		return driver;

	}

	@AfterTest
	public void closeallDriver() {
		driver.close();
	}

}

