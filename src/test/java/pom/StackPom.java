package pom;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class StackPom {
	 WebDriver driver;
	 WebDriverWait wait;
	 
	 @FindBy(xpath="//a[@href='stack']")
	  WebElement Stackgetstarted;
	  @FindBy(xpath="//a[text()='Operations in Stack']")
	  WebElement OperationsInStack;
	  @FindBy(xpath="//a[text()='Implementation']")
	  WebElement Implementation;
	  @FindBy(xpath="//a[text()='Applications']")
	  WebElement Applications;
	  @FindBy(xpath="//a[text()='Practice Questions']")
	  WebElement PracticeQuestions;
	  @FindBy(xpath="//a[text()='Try here>>>']")
	  WebElement tryhere;
	  @FindBy(xpath="//textarea[@id='editor']/../div/div/textarea")
	  WebElement textarea;
	  @FindBy(xpath="//button[contains(text(),'Run')]")
	  WebElement runbtn;
	  public StackPom(WebDriver driver) {
		  wait = new WebDriverWait(driver,Duration.ofSeconds(30));
	        this.driver = driver;
	     	PageFactory.initElements(driver,this);  
	  }
	  public void Click_getstarted() {
		  Stackgetstarted.click();
	  }
	  public void Click_OperationsInStack() {
		  OperationsInStack.click();
	  }
	  public void Click_Implemenation() {
		  Implementation.click();
	  }
	  public void Click_Applications() {
		  Applications.click();
	  }
	  public void Click_PracticeQuestions() {
		  PracticeQuestions.click();
	  }
	  public void Click_TryHereButton() {
		  tryhere.click();
	    }
	  //public void Click_TextArea() {
		//  textarea.click();
	  //}
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
