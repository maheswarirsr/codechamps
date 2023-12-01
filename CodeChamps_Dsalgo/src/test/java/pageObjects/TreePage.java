package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import utilities.LoggerLoad;
import utilities.configReader;

public class TreePage extends DataStructurePage {
	
	
	public TreePage() {
		
	}
	
	@FindBy (xpath="//a[@href='tree']")WebElement tree_getstart;
	@FindBy (xpath="//a[normalize-space()='Overview of Trees']")WebElement tree_overview;
	@FindBy (xpath="//html/body/div/h4")WebElement tree_title;
	@FindBy (xpath="//a[@class='btn btn-info']")WebElement tree_tryhere;
	
	public void clickGetStart() {
		tree_getstart.click();
	}
	public void getStart_Tree(String pageName) {
		String url = configReader.getUrl(pageName);
		driver.get(url);			
	}
	public void clickLink() {
		tree_overview.click();
	}	
	public String getTitle() {		
		String title = driver.getTitle();		
		LoggerLoad.info(title);
		return title;
	}
	public void getTry() {
		tree_tryhere.click();
	}
	
	

}
