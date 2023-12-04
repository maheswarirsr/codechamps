package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import utilities.LoggerLoad;
import utilities.configReader;

public class TreePage extends DataStructurePage {
	
	
	public TreePage() {
		
	}
	
	@FindBy (xpath="//a[@href='tree']")WebElement tree_getstartbtn;	
	@FindBy (xpath="//html/body/div/h4")WebElement tree_title;
	@FindBy (xpath="//a[@class='btn btn-info']")WebElement tree_tryhere;	
	@FindBy (xpath="//a[normalize-space()='Overview of Trees']")WebElement overview_tree;
	@FindBy (xpath="//a[@href='terminologies']")WebElement termi_tree;
	@FindBy (xpath="//a[normalize-space()='Types of Trees']")WebElement types_tree;
	@FindBy (xpath="//a[normalize-space()='Tree Traversals']")WebElement traver_tree;
	@FindBy (xpath="//a[normalize-space()='Traversals-Illustration']")WebElement illus_tree;
	@FindBy (xpath="//a[normalize-space()='Binary Trees']")WebElement binary_tree;
	@FindBy (xpath="//a[normalize-space()='Types of Binary Trees']")WebElement typesbinary_tree;
	@FindBy (xpath="//a[normalize-space()='Implementation in Python']")WebElement implePy_tree;
	@FindBy (xpath="//a[normalize-space()='Binary Tree Traversals']")WebElement btt_tree;
	@FindBy (xpath="//a[normalize-space()='Implementation of Binary Trees']")WebElement ibt_tree;
	@FindBy (xpath="//a[normalize-space()='Applications of Binary trees']")WebElement abt_tree;
	@FindBy (xpath="//a[normalize-space()='Binary Search Trees']")WebElement bst_tree;
	@FindBy (xpath="//a[normalize-space()='Implementation Of BST']")WebElement iobst_tree;
	
	
	
	public void clickGetStart() {
		tree_getstartbtn.click();
	}
	public void getStart_Tree(String pageName) {
		String url = configReader.getUrl(pageName);
		driver.get(url);			
	}
	public void getTreePage() {
		String tree = configReader.getUrl();
		driver.get(tree);
	}
	
	public String getTitle() {		
		String title = driver.getTitle();		
		LoggerLoad.info("Actual :"+title);
		return title;
	}
	public void getTry() {
		tree_tryhere.click();
	}
	public void clickLink(String link) {
		switch(link) {
		case "overviewoftrees":
			overview_tree.click();
			break;
		case "terminologies":
			termi_tree.click();
			break;
		case "typesoftrees":
			types_tree.click();
			break;
		case "treetraversals":	
			traver_tree.click();
			break;
		case "traversalsillustration":
			illus_tree.click();
			break;
		case "binarytrees":
			binary_tree.click();
			break;
		case "typesofbinarytrees":
			typesbinary_tree.click();
			break;
		case "implementationinpython":
			implePy_tree.click();
			break;
		case "binarytreetraversals":
			btt_tree.click();
			break;
		case "implementationofbinarytrees":
			ibt_tree.click();
			break;
		case "applicationsofbinarytrees":
			abt_tree.click();
			break;
		case "binarysearchtrees":
			bst_tree.click();
			break;
		case "implementationofbst":
			iobst_tree.click();
			break;			
		}
	
		
	}
}
