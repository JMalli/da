package pom;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import newalgoutilities.BaseClass;

public class DataStructPom  extends BaseClass {
	  
		WebDriver driver;
		WebDriverWait wait;

		//@FindBy(xpath="//a[@href='data-structures-introduction']")
	    @FindBy(xpath="//h5[contains(text(),'Data')]/..//a")
		WebElement getstarted;
		@FindBy(xpath="//*[text()='Time Complexity']")
		WebElement timecomplexity;
		@FindBy(xpath="//*[text()='Try here>>>']")
		WebElement tryhere;
		@FindBy(xpath="//textarea[@id='editor']/../div/div/textarea")
		WebElement tryeditor;
		@FindBy(xpath="//*[contains(text(),'Run')]")
		WebElement run;
		@FindBy(xpath="//pre[@id='output']")
		WebElement outputField;	
		@FindBy(xpath="//a[text()='Practice Questions']")
		  WebElement PracticeQuestions;
		public DataStructPom(WebDriver driver) {
	    	wait = new WebDriverWait(driver,Duration.ofSeconds(30));
	        this.driver = driver;
	     	PageFactory.initElements(driver,this);
	    }
		public void clickDataStructureGetStarted() {
						getstarted.click();
					}
		 public void clickOnTimecomplexityLink()
			{
				timecomplexity.click();
			}
		 public void click_PracticeQuestions() {
			  PracticeQuestions.click();
		  }
			public void clickOnTryhereLink()
			{
				tryhere.click();
			}
			public void TypeHere() {
				tryeditor.sendKeys("print'Hello'");
			}
			public void Run() {
				run.click();
			}
			public void outputfield() {
				String display = outputField.getText();
				System.out.println(display);
			}
			public void revertback()
			{
				driver.navigate().back();
			}
}

