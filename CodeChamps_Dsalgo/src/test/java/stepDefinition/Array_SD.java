package stepDefinition;

import org.junit.Assert;

import io.cucumber.java.en.*;
import pageObjects.ArrayPage;
import utilities.LoggerLoad;

public class Array_SD {
	
	ArrayPage ap=new ArrayPage();
	
	@When("The user click get started in array panel")
	public void the_user_click_get_started_in_array_panel() {
	   ap.clickGetStart();
	}
	@Given("The user is on array page after logged in")
	public void the_user_is_on_array_page_after_logged_in() {
	   ap.getArrayPage();
	}

	@When("The user click on Arrays in Python link")
	public void the_user_click_on_arrays_in_python_link() {
	    ap.getArrinpython();
	}
	@When("The user click on Arrays Using List link")
	public void the_user_click_on_arrays_using_list_link() {
	    ap.getArrusinList();
	}
	@When("The user click on Basic Operations in Lists link")
	public void the_user_click_on_basic_operations_in_lists_link() {
	   ap.getBasic();
	}
	@When("The user click on Applications of Array link")
	public void the_user_click_on_applications_of_array_link() {
	   ap.getAppofArray();
	}
	@Given("The user is on pactice question page after logged in")
	public void the_user_is_on_pactice_question_page_after_logged_in() {
	    ap.getPracticePage();
	}

	@When("The user click on Search the array link")
	public void the_user_click_on_search_the_array_link() {
	   ap.getSearch();
	}

	@Then("The user is redirected to Questions page contains a tryEditor with Run and Submit buttons")
	public void the_user_is_redirected_to_questions_page_contains_a_try_editor_with_run_and_submit_buttons() {
		LoggerLoad.info("User is redirected to Questions page having a Try Editor with Run button and Submit buttons");
		String title=ap.getPageTitle();
		LoggerLoad.info("Page Title is " +title);
		String expectedTitle="Assessment";
		Assert.assertEquals(title,expectedTitle);	    
	}
	@When("The user click submit button")
	public void the_user_click_submit_button() {
	   ap.clickSubmit();
	}
	@When("The user click on Max Consecutive Ones link")
	public void the_user_click_on_max_consecutive_ones_link() {
	   ap.getMax();
	}
	@When("The user click on Find Numbers with Even Number of Digits link")
	public void the_user_click_on_find_numbers_with_even_number_of_digits_link() {
	    ap.getFind();
	}
	@When("The user click on Squares of a Sorted Array link")
	public void the_user_click_on_squares_of_a_sorted_array_link() {
	   ap.getSquare();
	}




}
