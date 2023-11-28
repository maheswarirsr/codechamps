package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utilities.configReader;

public class DataStructurePage extends LoginPage {
	
	public DataStructurePage() {
		
	}
	
	
	@FindBy (xpath="//a[@href='data-structures-introduction']")WebElement dsgetstart_btn;
	@FindBy (xpath="//a[@href='time-complexity']")WebElement time_link;
	@FindBy (xpath="//button[text()='Run']")WebElement runbtn;
	@FindBy (xpath="//a[@class='btn btn-info']")WebElement tryBtn;
	
	
	
	
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
	
	
}
