package pom;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import newalgoutilities.BaseClass;

public class TreePagePom  extends BaseClass{
	
	 WebDriver driver;
	 WebDriverWait wait;
	 
	  // @FindBy(xpath="//div[@id='navbarCollapse']")
	  //WebElement dropdown;
	  //@FindBy(xpath="//*[@href='/tree']")
	  //WebElement TreefromDropdown;
	  @FindBy(xpath="//a[@href='tree']")
	  WebElement Treegetstarted;
	  @FindBy(xpath="//a[text()='Overview of Trees']")
	  WebElement OverviewOfTrees;
	  @FindBy(xpath="//a[text()='Terminologies']")
	  WebElement Terminologies;
	  @FindBy(xpath="//a[text()='Types of Trees']")
	  WebElement TypesOfTrees;
	  @FindBy(xpath="//a[text()='Tree Traversals']")
	  WebElement TreeTraversals;
	  @FindBy(xpath="//a[text()='Traversals-Illustration']")
	  WebElement TraversalsIllustration;
	  @FindBy(xpath="//a[text()='Binary Trees']")
	  WebElement BinaryTrees;
	  @FindBy(xpath="//a[text()='Types of Binary Trees']")
	  WebElement TypesOfBinaryTrees;
	  @FindBy(xpath="//a[text()='Implementation in Python']")
	  WebElement ImplementationInPython;
	  @FindBy(xpath="//a[text()='Binary Tree Traversals']")
	  WebElement BinaryTreeTraversals;
	  @FindBy(xpath="//a[text()='Implementation of Binary Trees']")
	  WebElement ImplementationofBinaryTrees;
	  @FindBy(xpath="//a[text()='Applications of Binary trees']")
	  WebElement ApplicationsOfBinaryTrees;
	  @FindBy(xpath="//a[text()='Binary Search Trees']")
	  WebElement BinarySearchTrees;
	  @FindBy(xpath="//a[text()='Implementation Of BST']")
	  WebElement ImplementationOfBST;
	  @FindBy(xpath="//a[text()='Practice Questions']")
	  WebElement PracticeQuestions;
	  @FindBy(xpath="//a[text()='Try here>>>']")
	  WebElement tryhere;
	 //@FindBy(xpath="//*[@id='editor']")
	  @FindBy(xpath="//textarea[@id='editor']/../div/div/textarea")
	  WebElement textarea;
	  @FindBy(xpath="//button[contains(text(),'Run')]")
	  WebElement runbtn;
	  
	  public TreePagePom(WebDriver driver) {
	    	wait = new WebDriverWait(driver,Duration.ofSeconds(30));
	        this.driver = driver;
	     	PageFactory.initElements(driver,this);
	    }
	  
	  public void DropdownforSelection() throws InterruptedException {
		  Thread.sleep(1000);
		  Treegetstarted.click();
			 
	  }

	public void click_OverviewOfTrees() {
		  OverviewOfTrees.click();
	  }
	  public void click_Terminologies() {
		  Terminologies.click();
	  }
	  public void click_TypesOfTrees() {
		  TypesOfTrees.click();
	  }
	  public void click_TreeTraversals() {
		  TreeTraversals.click();
	  }
	  public void click_TraversalsIllustration() {
		  TraversalsIllustration.click();
	  }
	  public void click_BinaryTrees() {
		  BinaryTrees.click();
	  }
	  public void click_TypesOfBinaryTrees() {
		  TypesOfBinaryTrees.click();
	  }
	  public void click_ImplementationInPython() {
		  ImplementationInPython.click();
	  }
	  public void click_BinaryTreeTraversals() {
		  BinaryTreeTraversals.click();
	  }
	  public void click_ImplementationofBinaryTrees() {
		  ImplementationofBinaryTrees.click();
	  }
	  public void click_ApplicationsOfBinaryTrees() {
		  ApplicationsOfBinaryTrees.click();
	  }
	  public void click_BinarySearchTrees() {
		  BinarySearchTrees.click();
	  }
	  public void click_ImplementationOfBTS() {
		  ImplementationOfBST.click();
	  }
	  public void click_PracticeQuestions() {
		  PracticeQuestions.click();
	  }
	  public void Click_TryHereButton() {
		  tryhere.click();
	    }
	  public void Click_TextArea() {
		  textarea.click();
	  }
	  public void SendCode() {
		  
	    	textarea.sendKeys("print 'welcome'");
	    }
	  public void Run() {
	        runbtn.click();
	    }
	  public void revertback()
		{
			driver.navigate().back();
		}
	  
	  
	  
	 }
	  


