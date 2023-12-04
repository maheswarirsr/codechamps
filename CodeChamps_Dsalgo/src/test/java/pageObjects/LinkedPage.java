package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import utilities.configReader;



public class LinkedPage extends DataStructurePage{
	
	public LinkedPage() {
		
	}
	
	@FindBy (xpath="//a[@href='linked-list']")WebElement link_getStart;
	@FindBy (xpath="//a[@class='btn btn-info']")WebElement link_try;
	@FindBy (xpath="//a[@href='introduction']")WebElement link_intro;
	@FindBy (xpath="//a[@href='creating-linked-list']")WebElement link_create;
	@FindBy (xpath="//a[@href='types-of-linked-list']")WebElement link_types;
	@FindBy (xpath="//a[@href='implement-linked-list-in-python']")WebElement link_implement;
	@FindBy (xpath="//a[@href='traversal']")WebElement link_traversal;
	@FindBy (xpath="//a[@href='insertion-in-linked-list']")WebElement link_insert;
	@FindBy (xpath="//a[@href='deletion-in-linked-list']")WebElement link_delete;
	
	public void clickGetStart() {
		link_getStart.click();
	}
	public void getLinkPage() {
		String link = configReader.getLinkUrl();
		driver.get(link);
	}
	public void clickLink(String link) {
		switch(link) {
		case "introduction":
			link_intro.click();
			break;
		case "creatinglinkedlist":
			link_create.click();
			break;
		case "typesoflinkedlist":
			link_types.click();
			break;
		case "implementlinkedlistinpython":
			link_implement.click();
			break;
		case "traversal":
			link_traversal.click();
			break;
		case "insertioninlinkedlist":
			link_insert.click();
			break;
		case "deletioninlinkedlist":
			link_delete.click();
			break;
		}			
		
	}
	

}
