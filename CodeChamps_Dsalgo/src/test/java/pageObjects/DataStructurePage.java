package pageObjects;





import java.time.Duration;

import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.Alert;

import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.Keys;
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
	
	public void clickRun() {
		runbtn.click();
	}
	
	public void refreshPage() {
		driver.navigate().refresh();
	}
	
	public void entercode(String str) throws InterruptedException {	
		//String str = "def search(input_list, num):\nif(num in input_list):\nprint(\"Element Found\")\n\b\belse:\nprint(\"Not Found\")\n\b\b\b\bsearch([12, 23, 45, 67, 6, 90] , 12)";
		
		LoggerLoad.info("ENTERING INPUT:" + str);		
		
		String[] strArray = StringUtils.split(str, "|");
		
		Wait<WebDriver> wait =
		        new FluentWait<>(driver)
		            .withTimeout(Duration.ofSeconds(1))
		            .pollingEvery(Duration.ofMillis(300))
		            .ignoring(ElementNotInteractableException.class);
		wait.until(
				d -> {
					for(int i=0; i<strArray.length; i++)
					{	
						String aStr = strArray[i];
						if(aStr.equalsIgnoreCase("ENTER"))
						{
							txteditor.sendKeys(Keys.ENTER);
						}
						else if(aStr.equalsIgnoreCase("BACKSPACE"))
						{
							txteditor.sendKeys(Keys.BACK_SPACE);
						}
						else if(aStr.equalsIgnoreCase("DELETE"))
						{
							txteditor.sendKeys(Keys.DELETE);
						}
						else
						{
							txteditor.sendKeys(aStr);
						}						
					}					
					return true;
				});		   
	}

	
	public String getOutput(String elementToCheck) {
		String returnValue = "";	
		
		Wait<WebDriver> wait =
		        new FluentWait<>(driver)
		            .withTimeout(Duration.ofSeconds(10))
		            .pollingEvery(Duration.ofMillis(300))
		            .ignoring(ElementNotInteractableException.class);
		
		LoggerLoad.info("elementToCheck:" + elementToCheck);
		if (elementToCheck.equalsIgnoreCase("outputtext"))
		{	
			wait.until(ExpectedConditions.visibilityOf(outputElement));
			LoggerLoad.info(outputElement.getText());
			returnValue = outputElement.getText();
			LoggerLoad.info(returnValue);
			return returnValue;
		}
		else if(elementToCheck.equalsIgnoreCase("alerttext"))
		{
			wait.until(ExpectedConditions.alertIsPresent());
			Alert alt = driver.switchTo().alert();
			returnValue = alt.getText();
			alt.accept();			
			return returnValue;
		} 
		return returnValue;	
		
	}


	
	
}
