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
	String expectedResult;	
	String elementToCheck;
	
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
	
	@When("The user enter the python code from sheet {string} and {int}")
	public void the_user_enter_the_sheet_and(String sheetname, Integer rownumber) throws IOException, InterruptedException {
		ExcelReader reader = new ExcelReader();
		List<Map<String, String>> code  = reader.getData(xlpath, sheetname);
	     
	    String python = code.get(rownumber).get("pythonCode");	
	    expectedResult = code.get(rownumber).get("Result");
	    elementToCheck = code.get(rownumber).get("Element");
	    LoggerLoad.info("EXPECTED:" + expectedResult);
	    
	    if(python != null) {
	    	 ds.refreshPage();
	         ds.entercode(python);	         
	    }
	}

	@And("The user click run button")
	public void the_user_click_run_button() {
	   ds.clickRun();
	}
	
	@Then("The user should see the expected output")
	public void the_user_should_see_the_expected_output() {
		String actualOutput = ds.getOutput(elementToCheck);
		LoggerLoad.info("EXPECTED:" + expectedResult);
		LoggerLoad.info("ACTUAL:"+ actualOutput);
		Assert.assertEquals(expectedResult,actualOutput);    
	}
	
}
