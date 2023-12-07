package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import utilities.configReader;

public class QueuePage extends DataStructurePage {

	public QueuePage() {
	}
	
	@FindBy(xpath = "//a[@href='queue']")WebElement queue_getStarted;
	@FindBy(xpath = "//a[normalize-space()='Implementation of Queue in Python']")WebElement implementationofpython;
	@FindBy(xpath = "//a[normalize-space()='Implementation using collections.deque']")WebElement implementationcollections;
	@FindBy(xpath = "//a[normalize-space()='Implementation using array']")WebElement implementationarray;
	@FindBy(xpath = "//a[normalize-space()='Queue Operations']")WebElement queueop;
	
	////a[normalize-space()='Implementation of Queue in Python']
	
	public void clickGetStart() {
		queue_getStarted.click();
	}
	public void getQueuePage() {
		String queue = configReader.getQueueUrl();
		driver.get(queue);
	}
	public String getQueuePageTitle() {
		String title = driver.getTitle();
		return title;
	}
	public void getImpofQue() {
		implementationofpython.click();
	}
	public void getImpofColl() {
		implementationcollections.click();
	}
	public void getImpofArr() {
		implementationarray.click();
	}
	public void getQueOpe() {
		queueop.click();
	}	
	public void clickQueueLink(String link) {

		switch (link) {
		case "Implementation of Queue in Python":
			implementationofpython.click();
			break;
		case "Implementation using collections.deque":
			implementationcollections.click();
			break;
		case "Implementation using array":
			implementationarray.click();
			break;
		case "Queue Operations":
			queueop.click();
			break;
		}

	}
	
}
	
	



	
//
//}
