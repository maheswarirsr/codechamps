package stepDefinition;

import org.testng.Assert;

//import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;
import pageObjects.RegisterPage;


public class Register_SD {
	
	RegisterPage rp = new RegisterPage();
	
	@Given("The user open register page")
	public void the_user_open_register_page() {
	    rp.register();
	}

	@When("The user click Register button")
	public void the_user_click_register_button() {
	    rp.getRegisterbtn();
	}

    @Then("It should display error message {string}")
	public void it_should_display_error_message(String string) {
	    String msg = rp.getErrTextMessage();
	    Assert.assertEquals(msg, string, "Message doesn't match");
	    
	}
    @When("The user enters a {string} with characters other than Letters, digits and {string}")
    public void the_user_enters_a_with_characters_other_than_letters_digits_and(String string, String string2, io.cucumber.datatable.DataTable dataTable) {
        
    	rp.entervaliduser(dataTable);
        rp.entervalidpassword(dataTable);
        rp.entervalidconpassword(dataTable);
        rp.getRegisterbtn();
    }
    @Then("The user get error message {string}")
    public void the_user_get_error_message(String string) {       
    	String message=rp.getErrMessage();
    	Assert.assertEquals(message, string, "Error message doesn't match");
    }
    
    @When("The user enters a valid {string} and {string} similar to username")
    public void the_user_enters_a_valid_and_similar_to_username(String string, String string2, io.cucumber.datatable.DataTable dataTable) {
       rp.entervaliduser(dataTable);
       rp.entervalidpassword(dataTable);
       rp.entervalidconpassword(dataTable);
       rp.getRegisterbtn();
    }
    
    @When("The user enters a valid {string} and {string} with characters less than {int}")
    public void the_user_enters_a_valid_and_with_characters_less_than(String string, String string2, Integer int1, io.cucumber.datatable.DataTable dataTable) {
    	rp.entervaliduser(dataTable);
        rp.entervalidpassword(dataTable);
        rp.entervalidconpassword(dataTable);
        rp.getRegisterbtn();
    }
    @When("The user enters a valid {string} and commonly used password {string}")
    public void the_user_enters_a_valid_and_commonly_used_password(String string, String string2, io.cucumber.datatable.DataTable dataTable) {
    	rp.entervaliduser(dataTable);
        rp.entervalidpassword(dataTable);
        rp.entervalidconpassword(dataTable);
        rp.getRegisterbtn();
    }
    @When("The user enters a valid {string} and {string} with only numbers")
    public void the_user_enters_a_valid_and_with_only_numbers(String string, String string2, io.cucumber.datatable.DataTable dataTable) {
    	rp.entervaliduser(dataTable);
        rp.entervalidpassword(dataTable);
        rp.entervalidconpassword(dataTable);
        rp.getRegisterbtn();
    }
    @When("The user enters a valid {string} and {string} and {string}")
    public void the_user_enters_a_valid_and_and(String string, String string2, String string3, io.cucumber.datatable.DataTable dataTable) {
    	rp.entervaliduser(dataTable);
        rp.entervalidpassword(dataTable);
        rp.entervalidconpassword(dataTable);
        rp.getRegisterbtn();
    }

    @Then("The user should be redirected to homepage with message {string}")
    public void the_user_should_be_redirected_to_homepage_with_message(String string) {
       String Title = rp.getTitleofPage();
       Assert.assertEquals(Title, "NumpyNinja", "Title doesn't match");
    }

   



}
