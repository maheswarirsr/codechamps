package stepDefinition;

import io.cucumber.java.en.*;
import pageObjects.LinkedPage;

public class Linked_SD {
	
	LinkedPage lp = new LinkedPage();
	
	@When("The user click get started in linked panel")
	public void the_user_click_get_started_in_linked_panel() {
	   lp.clickGetStart();
	}

	@Given("The user is on linkedlist page")
	public void the_user_is_on_linkedlist_page() {
	   lp.getLinkPage();
	}
	@When("The user click {string} link")
	public void the_user_click_link(String string) {
	   lp.clickLink(string);
	}

	
	

}
