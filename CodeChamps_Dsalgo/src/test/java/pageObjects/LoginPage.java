package pageObjects;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import factory.DriverFactory;
import io.cucumber.datatable.DataTable;
import utilities.configReader;

public class LoginPage {
    
	WebDriver driver=DriverFactory.getdriver();
	
	String logUrl=configReader.getLoginUrl();
	
	
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (xpath="//input[@id='id_username']")WebElement usernametxt;
	@FindBy (xpath="//input[@id='id_password']")WebElement passwordtxt;
	@FindBy (xpath="//input[@value='Login']")WebElement loginbtn;
	@FindBy (xpath="//div[@role='alert']")WebElement eMessage;
	@FindBy (xpath="//a[normalize-space()='Numpy']")WebElement homelink;
	@FindBy (xpath="//..//div[2]/ul[1]/a[3]")WebElement signoutlink;
	@FindBy (xpath="/html[1]/body[1]/div[2]")WebElement logoutmsg;
	
	public void login() {
		driver.get(logUrl);
	}
	
	public void clickLogin() {
		loginbtn.click();
	}
	public String getErrMessage() {
		String msg = eMessage.getText();
		return msg;
	}
	public void getHomeLink() {
		homelink.click();
		homelink.getText();
		
	}
	public void getSignoutLink() {
		signoutlink.click();
	    logoutmsg.getText();
	}
	
	public void doLogin(String username, String password) {
		
		usernametxt.clear();
		usernametxt.sendKeys(username);
		
		passwordtxt.clear();
		passwordtxt.sendKeys(password);
		loginbtn.click();
	}
	public String getErrTextMessage() {
		String message = usernametxt.getAttribute("validationMessage");
		return message;
	}
	public void entervaliduser(DataTable table) {
		 List<Map<String, String>> userdetail = table.asMaps(String.class,String.class);
		    for(Map<String,String> form : userdetail) {
		    	String name = form.get("username");
		    	if(name != null && !name.isEmpty())
		    	{
		    		usernametxt.sendKeys(name);
		    	}
		    	
		    }
		}
		    
    public void entervalidpassword(DataTable table) {
		   	 List<Map<String, String>> userdetail = table.asMaps(String.class,String.class);
		   	    for(Map<String,String> form : userdetail) {
		   	    	String passwrd = form.get("password");
		   	    	if(passwrd != null && !passwrd.isEmpty()) {
		   	    	     passwordtxt.sendKeys(passwrd);
		   	    	}
		   	    }
			
		}

}
