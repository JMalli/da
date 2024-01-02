package pom;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import newalgoutilities.BaseClass;

public class LinkedListPom extends BaseClass {
	
	
	WebDriver driver;
	WebDriverWait wait;
	
	@FindBy(xpath="/html/body/div[3]/div[3]/div/div/a") 
	WebElement GS_LinkedList;
	
	@FindBy(xpath="/html/body/div[2]/ul[2]/a")
	WebElement Introduction;

	@FindBy(xpath="//a[text()='Try here>>>']")
	WebElement Tryhere;
	
	@FindBy(xpath="//textarea[@id='editor']/../div/div/textarea")
	WebElement textarea;
	
	@FindBy(xpath="//*[@id=\"answer_form\"]/button")
	WebElement Run;

	@FindBy(xpath="//*[@id=\"content\"]/li[2]") 
	WebElement Creating_Linked_List;
	@FindBy(xpath="//*[@id=\"content\"]/li[4]/a")
	WebElement Implement_List;
	
	@FindBy(xpath="//*[@id=\"content\"]/li[5]/a")
	WebElement Traversal;
	
	@FindBy(xpath="//*[@id=\"content\"]/li[6]/a")
	WebElement Insertion;
	
	@FindBy(xpath="//*[@id=\"content\"]/li[7]/a")
	WebElement Deletion;


	@FindBy(xpath="//*[@id=\"content\"]/li[3]/a")
	WebElement TypesOfLinkedList;

	public LinkedListPom(WebDriver driver) {     
		wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		 this.driver=driver;
		PageFactory.initElements(driver,this);
	}
public void TypesOfLinkedList() {
		
		TypesOfLinkedList.click();
		
	}
	
	
	
	public void GSLinkedList() {
		
		GS_LinkedList.click();
		
	}
	
	public void clickIntroduction() {
		
		Introduction.click();
	}
	

	public void clickTryhere() {
		  Tryhere.click();
			
	  }


	
	
	public void clickTextAreaSendCodeRun() {
		
		
		textarea.sendKeys("print('Hello World')");  		
		Run.click();
	}
	public void revertback()
	{
		driver.navigate().back();
	
 }

public void ClickCreatingLinkedList() {
	
	Creating_Linked_List.click();
}


public void ClickImplementList() {
	
	Implement_List.click();
}



public void ClickTraversal() {

	Traversal.click();
}

public void ClickInsertion() {
	
	Insertion.click();
}



public void ClickDeletion() {

Deletion.click();
}


}

