package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import factory.DriverFactory;
import utilities.configReader;

public class StackPage {
	WebDriver driver=DriverFactory.getdriver();
	@FindBy(xpath="//a[@href='stack']") WebElement gs_Stack;
	//@FindBy(xpath="//a[@href='operations-in-stack']") WebElement lnk_OpInStack ;
	//@FindBy(xpath="//a[@href='implementation']") WebElement lnk_Implementation;
	//@FindBy(xpath="//a[@href='stack-applications']") WebElement lnk_StkApp;
	
	public StackPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void gs_StackLinkClick()
	{
		gs_Stack.click();
	}
	
	public void clickLinksInStackPage(String stackLink)
	{
		String xpath = "//a[@href='"+stackLink+"']";
		driver.findElement(By.xpath(xpath)).click(); 
	}
	public void navigateTostackPage()
	{
	
		String url = configReader.getUrl("stack");
		driver.get(url);
	}
	
	
	
	
	
	

}
