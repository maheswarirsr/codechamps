package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import factory.DriverFactory;
import utilities.configReader;

public class GraphPage {
	WebDriver driver=DriverFactory.getdriver();
	@FindBy(xpath="//a[@href='graph']") WebElement gs_Graph;
	//@FindBy(xpath="//a[@href='operations-in-stack']") WebElement lnk_OpInStack ;
	//@FindBy(xpath="//a[@href='implementation']") WebElement lnk_Implementation;
	//@FindBy(xpath="//a[@href='stack-applications']") WebElement lnk_StkApp;
	
	public GraphPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void gs_GraphLinkClick()
	{
		gs_Graph.click();
	}
	
	public void clickLinksInGraphPage(String graphLink)
	{
		String xpath = "//a[@href='"+graphLink+"']";
		driver.findElement(By.xpath(xpath)).click(); 
	}
	public void navigateToGraphPage()
	{
	
		String url = configReader.getUrl("graph");
		driver.get(url);
	}
	
	
	
	
	
	


}
