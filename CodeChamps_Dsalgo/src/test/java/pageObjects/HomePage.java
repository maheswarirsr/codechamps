package pageObjects;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import factory.DriverFactory;
import utilities.configReader;

public class HomePage {
	
	WebDriver driver=DriverFactory.getdriver();
	String URL=configReader.getApplicationUrl();
	String HomeURL=configReader.getHomePage();
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	//ds algo page element
	@FindBy (xpath="//button[@class='btn']")WebElement getStartedbtn;
	@FindBy (xpath="//a[@class='navbar-brand']")WebElement hometitle;
	@FindBy (xpath="//*[@class='alert alert-primary']")WebElement alertMsg;
	
	//home drop down elements
	@FindBy (xpath="//a[@class='nav-link dropdown-toggle']")WebElement dropdown_DS;
	@FindBy (xpath="//a[normalize-space()='Arrays']")WebElement dropdown_Array;
	@FindBy (xpath="//a[normalize-space()='Linked List']")WebElement dropdown_List;
	@FindBy (xpath="//a[normalize-space()='Stack']")WebElement dropdown_Stack;
	@FindBy (xpath="//a[normalize-space()='Queue']")WebElement dropdown_Queue;
	@FindBy (xpath="//a[normalize-space()='Tree']")WebElement dropdown_Tree;
	@FindBy (xpath="//a[normalize-space()='Graph']")WebElement dropdown_Graph;
	
	//home get started elements
	//@FindBy (xpath="//a[@href='data-structures-introduction']")WebElement getstart_DS;
	@FindBy (xpath="//a[@href='array']")WebElement getstart_Array;
	@FindBy (xpath="//a[@href='linked-list']")WebElement getstart_List;
	@FindBy (xpath="//a[@href='stack']")WebElement getstart_Stack;
	@FindBy (xpath="//a[@href='queue']")WebElement getstart_Queue;
	@FindBy (xpath="//a[@href='tree']")WebElement getstart_Tree;
	@FindBy (xpath="//a[@href='graph']")WebElement getstart_Graph;
	
	//register
	@FindBy (xpath="//a[normalize-space()='Register']")WebElement registerlink;
	
	
	//signin
	@FindBy (xpath="//a[normalize-space()='Sign in']")WebElement signinlink;
	
	
	public void dsalgopage() {
		driver.get(URL);
	}
	
	
	public void getStartedBtn() {
		getStartedbtn.click();
	}
	
	public String getTitleofPage() {
		String title=driver.getTitle();
		return title;
	} 
	public void homepageUrl() {
		driver.get(HomeURL);
	}
	
	public String alert() {
		//driver.switchTo().alert();
		String message=alertMsg.getText();
		return message;
		
	}
	
	public void getDropDown(String string) {
		dropdown_DS.click();
		
		switch(string){
		
		case "Arrays":
			dropdown_Array.click();
			break;
		case "Linked List":
			dropdown_List.click();
			break;
		case "Stack":
			dropdown_Stack.click();
			break;
		case "Queue":
			dropdown_Queue.click();
			break;
		case "Tree":
			dropdown_Tree.click();
			break;
		case "Graph":
			dropdown_Graph.click();
			break;
			
		}
		
	}
	public void getStarted(String string) {
		switch(string) {
//		case "Data Structures-Introduction":
//			getstart_DS.click();
//			break;
		case "Array":
			getstart_Array.click();
			break;
		case "Linked List":
			getstart_List.click();
			break;
		case "Stack":
			getstart_Stack.click();
			break;
		case "Queue":
			getstart_Queue.click();
			break;
		case "Tree":
			getstart_Tree.click();
			break;
		case "Graph":
			getstart_Graph.click();
			break;
		}
		
	}
	public void getRegisterlink() {
		registerlink.click();
	}
	public String getRegisterpage() {
		String regTitle = driver.getTitle();
		return regTitle;
	}
	public void getSigninlink() {
		signinlink.click();
	}
	public String getLoginpage() {
		String logTitle = driver.getTitle();
		return logTitle;
	}
}
	
	
	
	