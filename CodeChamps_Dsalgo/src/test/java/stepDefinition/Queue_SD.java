package stepDefinition;


import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.QueuePage;
import utilities.LoggerLoad;
import utilities.configReader;

public class Queue_SD {
	QueuePage qs = new QueuePage();	
	String queue = configReader.getUrlQueue();

	@When("The user clicks the {string} button in Queue Panel")
	public void the_user_clicks_the_button_in_queue_panel(String string) {
		qs.getStartBtn();

	}

	@Then("The user should be redirected to {string} page")
	public void the_user_should_be_redirected_to_page(String string) {
		String title = qs.getPageTitle();
	    LoggerLoad.info("Expected: " +title);
	    Assert.assertEquals(title, string);

	}

	@Given("The user is on the queue page")
	public void the_user_is_on_the_queue_page() {
		qs.getQueuePage();

	}

	@When("The user clicks {string} link")
	public void the_user_clicks_link(String string) {
		qs.clickQueueLink(string);

	}
	
	

	@When("The user click try here button")
	public void the_user_click_try_here_button() {
		qs.clickTryHere();
	    
	}


}
