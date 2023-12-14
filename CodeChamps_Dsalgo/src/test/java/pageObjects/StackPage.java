package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import utilities.configReader;

public class StackPage extends DataStructurePage{
	
	public StackPage() {
		
	}
	
	@FindBy (xpath="//a[@href='stack']")WebElement stack_getStart;
	@FindBy (xpath="//a[normalize-space()='Operations in Stack']")WebElement stack_opeinstack;
	@FindBy (xpath="//a[normalize-space()='Implementation']")WebElement stack_imp;
	@FindBy (xpath="//a[normalize-space()='Applications']")WebElement stack_app;
	
	
	public void clickGetStart() {
		stack_getStart.click();
	}
	public void getStackPage() {
		String stack = configReader.getStackUrl();
		driver.get(stack);
	}
	public String getStackPageTitle() {
		String title = driver.getTitle();
		return title;
	}
	public void getOpeInStack() {
		stack_opeinstack.click();
	}
	public void getImp() {
		stack_imp.click();
	}
	public void getApp() {
		stack_app.click();
	}
}


