package stepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pageObjects.DataStructurePage;
import pageObjects.StackPage;

public class Stack_SD {
	
	StackPage sp = new StackPage();
	DataStructurePage ds = new DataStructurePage();	
	
	
	@When("The user click get started on {string} page")
	public void the_user_click_get_started_on_page(String string) {
		sp.gs_StackLinkClick();
	}

	@When("The user click {string} link")
	public void the_user_click_link(String stackLink) {
		sp.clickLinksInStackPage(stackLink);
	}
	@Given("The user is on stack page")
	public void the_user_is_on_stack_page() {
		sp.navigateTostackPage();
	}


}
