package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pageObjects.DataStructurePage;
import pageObjects.GraphPage;

public class Graph_SD {
	GraphPage gp = new GraphPage();
	DataStructurePage ds = new DataStructurePage();	
	
	
	@When("The user click get started button on {string} page")
	public void the_user_click_get_started_button_on_page(String string) {
		gp.gs_GraphLinkClick();
	}

	@When("The user click {string} link in Graph Page")
	public void the_user_click_link_in_Graph_Page(String graphLink) {
		gp.clickLinksInGraphPage(graphLink);
	}
	@Given("The user is on graph page")
	public void the_user_is_on_graph_page() {
		gp.navigateToGraphPage();
	}



}
