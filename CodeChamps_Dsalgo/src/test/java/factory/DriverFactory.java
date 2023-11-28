package factory;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import utilities.LoggerLoad;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverFactory {

	public static WebDriver driver;

public WebDriver initializeDrivers(String browser) 
{
	LoggerLoad.info("BROWSER:" + browser);
	if (browser.equalsIgnoreCase("firefox")) {
		LoggerLoad.info("Testing on firefox");
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();

	} else if (browser.equalsIgnoreCase("chrome")) {
		LoggerLoad.info("Testing on chrome");
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		
    } else if (browser.equalsIgnoreCase("edge")) {
		LoggerLoad.info("Testing on Edge");
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();

	}
	// Set Page load timeout
    driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.manage().window().maximize();
    //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	return driver;
}

public static WebDriver getdriver() {
	return driver;

}

public void closeallDriver() {
	driver.close();
}

}

