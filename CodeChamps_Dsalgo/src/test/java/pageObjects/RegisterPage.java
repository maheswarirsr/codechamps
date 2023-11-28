package pageObjects;


import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.devtools.v117.audits.model.FederatedAuthUserInfoRequestIssueDetails;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import factory.DriverFactory;
import io.cucumber.datatable.DataTable;
//import utilities.LoggerLoad;
import utilities.configReader;

public class RegisterPage {
	WebDriver driver=DriverFactory.getdriver();
	
	String RegisterURL=configReader.getRegisterPage();
	
	public RegisterPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (xpath="//input[@id='id_username']")WebElement usernametxt;
	@FindBy (xpath="//input[@id='id_password1']")WebElement passwordtxt;
	@FindBy (xpath="//input[@id='id_password2']")WebElement conpasswordtxt;
	@FindBy (xpath="//input[@value='Register']")WebElement registerbtn;
	@FindBy (xpath="//div[@role='alert']")WebElement eMessage;
	@FindBy (xpath="//a[contains(text(),'NumpyNinja')]")WebElement pagetitle;
	
	public void register() {
		driver.get(RegisterURL);
	}
	public void getRegisterbtn() {
		registerbtn.click();
	}
	
	public String getErrTextMessage() {
		String message = usernametxt.getAttribute("validationMessage");
		return message;
	}
	public String getErrMessage() {
		String msg=eMessage.getText();
		return msg;
	}
	public String getTitleofPage() {
		String title=pagetitle.getText();
		return title;
	} 
	
	//Maping through key, value pair(string name, string value )
	public void entervaliduser(DataTable table) {
	 List<Map<String, String>> userdetail = table.asMaps(String.class,String.class);
	    for(Map<String,String> form : userdetail) {
	    	String name = form.get("username");
	    	usernametxt.sendKeys(name);
	    }
	}
	    
	    public void entervalidpassword(DataTable table) {
	   	 List<Map<String, String>> userdetail = table.asMaps(String.class,String.class);
	   	    for(Map<String,String> form : userdetail) {
	   	    	String passwrd = form.get("password");
	   	    	passwordtxt.sendKeys(passwrd);
	   	    }
		
	}
	    public void entervalidconpassword(DataTable table) {
		   	 List<Map<String, String>> userdetail = table.asMaps(String.class,String.class);
		   	    for(Map<String,String> form : userdetail) {
		   	    	String cpasswrd = form.get("password confirmation");
		   	    	conpasswordtxt.sendKeys(cpasswrd);
		   	    }
			
		}

}
