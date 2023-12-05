package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import utilities.LoggerLoad;
import utilities.configReader;

public class QueuePage extends DataStructurePage {

	public QueuePage() {

	}

	@FindBy(xpath = "//a[@href='queue']")
	WebElement queue_getStarted;
	@FindBy(xpath = "//html/body/div/h4")
	WebElement queue_title;
	@FindBy(xpath = "//a[@href='implementation-lists']")
	WebElement impleofQueueinPython;
	@FindBy(xpath = "//a[@href='implementation-collections']")
	WebElement impleUsingCollects;
	@FindBy(xpath = "//a[@href='Implementation-array']")
	WebElement impleUsingArray;
	@FindBy(xpath = "//a[@href='QueueOp']")
	WebElement queueOperations;
	@FindBy(xpath = "//button[text()='Run']")
	WebElement runbtn;
	@FindBy(xpath = "//a[@class='btn btn-info']")
	WebElement tryBtn;
	@FindBy(xpath = "//form/div/div/div/textarea")
	WebElement txteditor;
	@FindBy(xpath = "//div/pre[@id='output']")
	WebElement outputElement;

	String strInput;

	public void getStart_Queue(String pageName) {
		String url = configReader.getUrl(pageName);
		driver.get(url);
	}

	public String getPageTitle() {
		String title = driver.getTitle();
		LoggerLoad.info("Actual :" + title);
		return title;
	}

	public void getStartBtn() {
		queue_getStarted.click();
	}

	public void getQueuePage() {
		String queue = configReader.getUrlQueue();
		driver.get(queue);
	}

	public void clickTryHere() {
		tryBtn.click();
	}

	public void clickQueueLink(String link) {

		switch (link) {
		case "Implementation of Queue in Python":
			impleofQueueinPython.click();
			break;
		case "Implementation using collections.deque":
			impleUsingCollects.click();
			break;
		case "Implementation using array":
			impleUsingArray.click();
			break;
		case "Queue Operations":
			queueOperations.click();
			break;
		}

	}

}
