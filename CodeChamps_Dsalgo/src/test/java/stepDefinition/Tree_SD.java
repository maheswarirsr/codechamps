package stepDefinition;



import io.cucumber.java.en.*;
import pageObjects.TreePage;

public class Tree_SD {
	
	TreePage tp = new TreePage();
	
	@When("The user click get started in tree panel")
	public void the_user_click_get_started_in_tree_panel() {
	   tp.clickGetStart();
	}
	


}
