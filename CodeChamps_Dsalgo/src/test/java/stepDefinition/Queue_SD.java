package stepDefinition;



import io.cucumber.java.en.*;
import pageObjects.QueuePage;




public class Queue_SD {
	QueuePage qs = new QueuePage();	
	
	
	@When("The user click get started in queue panel")
	public void the_user_click_get_started_in_queue_panel() {
	    qs.clickGetStart();
	}
	
	@Given("User is in the Queue Page after logged in")
	public void user_is_in_the_queue_page_after_logged_in() {
	    qs.getQueuePage();
	}

	@When("User clicks on the Implementation of Queue in Python link")
	public void user_clicks_on_the_implementation_of_queue_in_python_link() {
	   qs.getImpofQue();
	}

	@Then("User redirected to {string} page")
	public void user_redirected_to_page(String string) {
	    qs.clickQueueLink(string);
	}
	@When("User clicks on the Implementation using collections.deque link")
	public void user_clicks_on_the_implementation_using_collections_deque_link() {
	  qs.getImpofColl();
	}
	@When("User clicks on the Implementation using array link")
	public void user_clicks_on_the_implementation_using_array_link() {
	    qs.getImpofArr();
	}
	@When("User clicks on the Queue Operations link")
	public void user_clicks_on_the_queue_operations_link() {
	   qs.getQueOpe();
	}
	
}

