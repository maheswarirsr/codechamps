package stepDefinition;

import org.testng.Assert;

import io.cucumber.java.en.*;
import pageObjects.HomePage;
import utilities.LoggerLoad;

public class Home_SD {
	
	HomePage home = new HomePage();
	
	@Given("The user opens DS Algo portal link")
	public void the_user_opens_ds_algo_portal_link() {
	   home.dsalgopage();
	}

	@When("The user clicks the {string} button")
	public void the_user_clicks_the_button(String string) {
	    home.getStartedBtn();
	}

	@Then("The user should be redirected to homepage")
	public void the_user_should_be_redirected_to_homepage() {
	   String Title = home.getTitleofPage();
	   LoggerLoad.info(Title);
	   Assert.assertEquals(Title, "NumpyNinja", "Title doesn't match");
	}
	
	@Given("The user is on home page")
	public void the_user_is_on_home_page() {
	    home.homepageUrl();
	}

	@When("The user clicks on dropdown {string}")
	public void the_user_clicks_on_dropdown(String string) {
	   home.getDropDown(string);
	}

	@Then("The user get warning message {string}")
	public void the_user_get_warning_message(String string) {
	   String alertmsg=home.alert();
	   LoggerLoad.info(alertmsg);
	   Assert.assertEquals(alertmsg, string, "Alert doesn't match");
	}
	
	@When("The user click on getstarted in homepage {string} without signin")
	public void the_user_click_on_getstarted_in_homepage_without_signin(String string) {
	    home.getStarted(string);
	}
	
	@When("The user click on register link")
	public void the_user_click_on_register_link() {
	    home.getRegisterlink();
	}

	@Then("The user redirected to register page")
	public void the_user_redirected_to_register_page() {
	    String Title =home.getRegisterpage();
	    LoggerLoad.info(Title);
	    Assert.assertEquals(Title, "Registration", "Title doesn't match" );
	}
	@When("The user click on signin link")
	public void the_user_click_on_signin_link() {
	    home.getSigninlink();
	}

	@Then("The user redirected to login page")
	public void the_user_redirected_to_login_page() {
	   String Title=home.getLoginpage();
	   LoggerLoad.info(Title);
	   Assert.assertEquals(Title, "Login", "Title doesn't match");
	}





}
