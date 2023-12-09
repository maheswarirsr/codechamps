package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utilities.configReader;

public class GraphPage extends DataStructurePage{
	
	@FindBy (xpath="//a[@href='graph']") WebElement gs_Graph;
	//@FindBy (xpath="//a[@class='list-group-item'][normalize-space()='Graph']")WebElement gra_graphlink;
	//@FindBy (xpath="//a[normalize-space()='Graph Representations']")WebElement gra_graphrep;
	
	public GraphPage()
	{
		
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
