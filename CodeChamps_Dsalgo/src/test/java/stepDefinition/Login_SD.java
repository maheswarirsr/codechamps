package stepDefinition;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.junit.Assert;

import io.cucumber.java.en.*;

import pageObjects.LoginPage;
import utilities.ExcelReader;
import utilities.LoggerLoad;
import utilities.configReader;

public class Login_SD {
	
	LoginPage lp=new LoginPage();
	String xlpath=configReader.getexcelfilepath();
	static String message;
	
	static String username;
	static String password;
	
	
	@Given("The user is on login page")
	public void the_user_is_on_login_page() {
	    lp.login();
	}

	@When("The user enter invalid {string} and {string}")
	public void the_user_enter_invalid_and(String username, String password, io.cucumber.datatable.DataTable dataTable) {
	   lp.entervaliduser(dataTable);
	   lp.entervalidpassword(dataTable);
	   lp.doLogin(username, password);
	}

	@And("The user click login button")
	public void the_user_click_login_button() {
		 lp.clickLogin();
		}
	
	@When("The user enter sheet {string} and {int}")
	public void the_user_enter_sheet_and(String sheetname,Integer rownumber) throws IOException, Exception {
	    ExcelReader reader = new ExcelReader();
	    List<Map<String, String>> data = reader.getData(xlpath, sheetname);
	   
	    username=data.get(rownumber).get("username");
	    password=data.get(rownumber).get("password");
	    message=data.get(rownumber).get("expectedmessage");
	    if(username !=null || password !=null) {
	    	 lp.doLogin(username, password);
	    	 String errMessage = lp.getErrMessage();
	    	 LoggerLoad.info("ERROR MESSAGE FROM SCREEN:" + errMessage);
	    	 Assert.assertNotEquals(message, errMessage);
	    	}
	    
	}
	@When("The user enter {string} and {string}")
	public void the_user_enter_and(String username, String password) {
	   lp.doLogin(username, password);
	}

	@Then("The user should be redirected to home page as {string}")
	public void the_user_should_be_redirected_to_home_page_as(String string) {
	   lp.getHomeLink();
       LoggerLoad.info(string);
       Assert.assertEquals(string, "Numpy");

	}
	@Given("The user is on login page with valid {string} and {string}")
	public void the_user_is_on_login_page_with_valid_and(String username, String password) {
		lp.login();
	    lp.doLogin(username, password);
	}
	
	@When("The user click signout link")
	public void the_user_click_signout_link() {
	   lp.getSignoutLink();
	}

	@Then("The user should be redirected to home page with message {string}")
	public void the_user_should_be_redirected_to_home_page_with_message(String string) {
	   lp.getSignoutLink();
	   LoggerLoad.info(string);
	   Assert.assertEquals(string, "Logged out successfully");
	}

	


}
