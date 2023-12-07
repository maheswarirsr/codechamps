package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import utilities.configReader;

public class ArrayPage extends DataStructurePage{
	
	public ArrayPage() {
		
	}
	
	@FindBy (xpath="//a[@href='array']")WebElement array_getstart;
	@FindBy (xpath="//a[@href='arrays-in-python']")WebElement array_arrinpyth;
	@FindBy (xpath="//a[@href='arrays-using-list']")WebElement array_arrusinglist;
	@FindBy (xpath="//a[@href='basic-operations-in-lists']")WebElement array_basic;
	@FindBy (xpath="//a[@href='applications-of-array']")WebElement array_aofa;
	@FindBy (xpath="//a[normalize-space()='Search the array']")WebElement array_search;
	@FindBy (xpath="//a[normalize-space()='Max Consecutive Ones']")WebElement array_max;
	@FindBy (xpath="//a[normalize-space()='Find Numbers with Even Number of Digits']")WebElement array_find;
	@FindBy (xpath="//a[contains(text(),'Squares of')]")WebElement array_sq;
	@FindBy (xpath="//*[@type='submit']")WebElement array_submit;
	
	public void clickGetStart() {
		array_getstart.click();
	}
	public void clickSubmit() {
		array_submit.click();
	}
	public void getArrayPage() {
		String array = configReader.getArrayUrl();
		driver.get(array);
	}
	public void getPracticePage() {
		String prac = configReader.getPracticeUrl();
		driver.get(prac);
	}
	public void getArrinpython() {
		array_arrinpyth.click();
	}
	public void getArrusinList() {
		array_arrusinglist.click();
	}
	public void getBasic() {
		array_basic.click();
	}
	public void getAppofArray() {
		array_aofa.click();
	}
	public void getSearch() {
		array_search.click();
	}
	public void getMax() {
		array_max.click();
	}
	public void getFind() {
		array_find.click();
	}
	public void getSquare() {
		array_sq.click();
	}

}
