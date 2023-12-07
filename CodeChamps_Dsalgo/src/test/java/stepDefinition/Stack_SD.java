package stepDefinition;

import io.cucumber.java.en.*;
import pageObjects.StackPage;

//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.When;
//import pageObjects.DataStructurePage;
//import pageObjects.StackPage;
//
public class Stack_SD {
	
	StackPage sp = new StackPage();

	@When("The user click get started on {string} page")
	public void the_user_click_get_started_on_page(String string) {
	    sp.clickGetStart();
	}	
	@Given("User is in the Stack Page after logged in")
	public void user_is_in_the_stack_page_after_logged_in() {
	    sp.getStackPage();
	}

	@When("User clicks on the Operations in Stack link")
	public void user_clicks_on_the_operations_in_stack_link() {
	    sp.getOpeInStack();
	}
	@When("User clicks on the Implementation link")
	public void user_clicks_on_the_implementation_link() {
	    sp.getImp();
	}
	@When("User clicks on the Applications link")
	public void user_clicks_on_the_applications_link() {
	   sp.getApp();
	}
}

	

