package pageObjects;





import java.time.Duration;

import org.openqa.selenium.Alert;

import org.openqa.selenium.ElementNotInteractableException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;


import utilities.LoggerLoad;
import utilities.configReader;

public class DataStructurePage extends LoginPage {
	
	public DataStructurePage() {
		
	}
	
	
	@FindBy (xpath="//a[@href='data-structures-introduction']")WebElement dsgetstart_btn;
	@FindBy (xpath="//a[@href='time-complexity']")WebElement time_link;
	@FindBy (xpath="//button[text()='Run']")WebElement runbtn;
	@FindBy (xpath="//a[@class='btn btn-info']")WebElement tryBtn;
	@FindBy (xpath="//form/div/div/div/textarea")WebElement txteditor;	
	@FindBy (xpath="//div/pre[@id='output']")WebElement outputElement;	
	
	String strInput;
	
	
	
	public void getStart_DS(String pageName) {
		String url = configReader.getUrl(pageName);
		driver.get(url);
	}
	
	public String getPageTitle() {
		String title = driver.getTitle();
		return title;
	}
	public void getStartBtn() {
		dsgetstart_btn.click();
	}
	
	public void clickTryHere() {
		tryBtn.click();
	}
	public void getTimeLink() {
		time_link.click();
	}
	
	public void refreshPage() {
		driver.navigate().refresh();
	}
	
	public void entercode(String str) throws InterruptedException {	
		
		LoggerLoad.info("ENTERING INPUT:" + str);
		Wait<WebDriver> wait =
		        new FluentWait<>(driver)
		            .withTimeout(Duration.ofSeconds(1))
		            .pollingEvery(Duration.ofMillis(300))
		            .ignoring(ElementNotInteractableException.class);
		wait.until(
				d -> {
					txteditor.sendKeys(str);
					return true;
				});		   
	}
	
	public void clickRun() {
		runbtn.click();
	}

	
	public String getOutput(String elementToCheck) {
		String returnValue = "";	
		LoggerLoad.info("elementToCheck:" + elementToCheck);
		if (elementToCheck.equalsIgnoreCase("outputtext"))
		{			
			
			returnValue = outputElement.getText();
			LoggerLoad.info(returnValue);
			return returnValue;
		}
		else if(elementToCheck.equalsIgnoreCase("alerttext"))
		{
			 Wait<WebDriver> wait =
			        new FluentWait<>(driver)
			            .withTimeout(Duration.ofSeconds(5))
			            .pollingEvery(Duration.ofMillis(300))
			            .ignoring(ElementNotInteractableException.class);
			
			wait.until(ExpectedConditions.alertIsPresent());
			Alert alt = driver.switchTo().alert();
			returnValue = alt.getText();
			alt.accept();			
			return returnValue;
		} 
		return returnValue;	
		
	}


	
	
}
