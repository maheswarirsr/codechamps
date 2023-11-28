package stepDefinition;



import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.junit.Assert;

import io.cucumber.java.en.*;
import pageObjects.DataStructurePage;
import utilities.ExcelReader;
import utilities.LoggerLoad;
import utilities.configReader;



public class DataStructure_SD {
	
	DataStructurePage ds = new DataStructurePage();	
	String xlpath=configReader.getexcelfilepath();
	 
	
	
	@When("The user click get started")
	public void the_user_click_get_started() {
         ds.getStartBtn();
	}

	@Then("The user redirected to {string} page")
	public void the_user_redirected_to_page(String pageTitle) {
	    String currentPageTitle = ds.getPageTitle();
	    LoggerLoad.info(currentPageTitle);
	    Assert.assertEquals(currentPageTitle, pageTitle);
		
	}
	@When("The user click Time complexity link")
	public void the_user_click_time_complexity_link() {
	   ds.getTimeLink();
	}
	@When("The user click Try here button")
	public void the_user_click_try_here_button() {
	   ds.clickTryHere();
	}
	
	@When("The user enter the sheet {string} and {int}")
	public void the_user_enter_the_sheet_and(String sheetname, Integer rownumber) throws IOException {
		ExcelReader reader = new ExcelReader();
	    List<Map<String, String>> data = reader.getData(xlpath, sheetname);
	    @SuppressWarnings("unused")
		String python = data.get(rownumber).get("pythonCode");
	    String result = data.get(rownumber).get("Result");
	    Assert.assertTrue(result, true);
	}

	@When("The user click run button")
	public void the_user_click_run_button() {
	   ds.clickRun();
	}
	
}
