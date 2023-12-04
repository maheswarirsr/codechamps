package stepDefinition;


import org.junit.Assert;

import io.cucumber.java.en.*;
import pageObjects.TreePage;
import utilities.LoggerLoad;
import utilities.configReader;

public class Tree_SD {
	
	TreePage tp = new TreePage();
	String tree = configReader.getUrl();
	
	@When("The user click get started in tree panel")
	public void the_user_click_get_started_in_tree_panel() {
	   tp.clickGetStart();
	}	
	@Given("The user is on tree page")
	public void the_user_is_on_tree_page() {
	   tp.getTreePage();
	}
	@When("The user click on {string} link")
	public void the_user_click_on_link(String string) {
	  tp.clickLink(string);
	  
	}

	@Then("The user is redirected to {string} page")
	public void the_user_is_redirected_to_page(String string) {
	   String title = tp.getTitle();
	   LoggerLoad.info("Expected: " +title);
	   Assert.assertEquals(title, string);
	}

	@When("The user click try here button")
	public void the_user_click_try_here_button() {
	   tp.getTry();
	}
	


}
