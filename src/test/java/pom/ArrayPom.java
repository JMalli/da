package pom;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import newalgoutilities.BaseClass;
import newalgoutilities.ExcelReader;

//import newalgoutilities.LoggerLoad;
import org.openqa.selenium.Keys;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
public class ArrayPom extends BaseClass {
	 WebDriver driver;
	 WebDriverWait wait;
	 
	 @FindBy(xpath="//h5[contains(text(),'Array')]/..//a")
	 	WebElement getstarted;
	 @FindBy(xpath="//*[text()=\"Arrays in Python\"]")
	 	WebElement arraysinPython;
	 @FindBy(xpath="//a[@href='/array/arrays-using-list/']")
	 	WebElement arraysusingList;
	 @FindBy(xpath="//*[text()=\"Basic Operations in Lists\"]")
	 	WebElement basicoperation;
	 @FindBy(xpath="//*[text()=\"Applications of Array\"]")
	 	WebElement applicationsofarray;
	 @FindBy(xpath="//*[text()=\"Try here>>>\"]")
	 	WebElement tryhere;
	 @FindBy(xpath="/html/body/div/div/form/div/div/div[1]/textarea")
	 	WebElement writeintexbox;
	 @FindBy(xpath="//button[contains(text(),'Run')]")
	 	WebElement runbutton;
	 @FindBy(xpath="//*[text()='Practice Questions']")
	 	WebElement Practicequestions;
	 @FindBy(xpath="//*[text()='Search the array']")
	 	WebElement Searchthearray;
	 @FindBy(xpath="//*[text()='Max Consecutive Ones']")
	 	WebElement MaxConsecutiveOnes;
	 @FindBy(xpath="//*[text()='Find Numbers with Even Number of Digits']")
	 	WebElement EvenNumberofDigits;
	 @FindBy(xpath="//*[text()='Squares of  a Sorted Array']")
	 	WebElement SquaresSortedArray;
	 @FindBy(xpath="//*[@id=\"answer_form\"]/div/div/div[6]/div[1]/div/div/div/div[5]/div/pre")
	 	WebElement question1;
	// @FindBy(xpath="/html/body/div/div[2]/form")
	 @FindBy(xpath="//div[@class='CodeMirror-scroll']")
	 	WebElement answer;
public ArrayPom(WebDriver driver) {
//super();
	wait = new WebDriverWait(driver,Duration.ofSeconds(30));
this.driver = driver;
	PageFactory.initElements(driver,this);
}
public void getstarted() {
	getstarted.click();
	}
	public void arraysinPython() {
		arraysinPython.click();
	}
	public void arraysusingList() {
		Actions actions=new Actions(driver);
		actions.scrollToElement(arraysusingList).build().perform();
		arraysusingList.click();
	}
	public void basicoperation() {
		Actions actions=new Actions(driver);
		actions.scrollToElement(basicoperation).build().perform();
		
		basicoperation.click();
	}
	public void applicationsofarray() {
		Actions actions=new Actions(driver);
		actions.scrollToElement(applicationsofarray).build().perform();
	
		 applicationsofarray.click();
	}
	public void tryhere() {
		tryhere.click();
		 
	}
	public void writeintexbox() {
		 writeintexbox.sendKeys("print 'welcome'");
			
	}
	public void runbutton() {
		 runbutton.click();
	}
	public void revertback()
	{
		driver.navigate().back();
	}
	 public String getErrorText() {
		 Alert alert = driver.switchTo().alert();
		 String message = alert.getText();
		 System.out.println(message);
		 alert.accept();
		 return message;
	 }
	 public void question() {
		 Practicequestions.click();
	 }
	 public void Searchthearray() {

		 Searchthearray.click();
			
		}
	 public void MaxConsecutiveOnes() {
		 MaxConsecutiveOnes.click();
	 }
	 public void EvenNumberofDigits() {
		 EvenNumberofDigits.click();
	 }
	 public void SquaresSortedArray() {
		 SquaresSortedArray.click();
	 }
	
	public void code() throws IOException, InterruptedException {
		 List<String> cellValuesList = ExcelReader.readExcelSheet();
		 Thread.sleep(2000);
		 Actions actions = new Actions(driver);
		 new Actions(driver)
	       .click(question1)
	       .keyDown(Keys.COMMAND)
	       .sendKeys("A")
	       .keyUp(Keys.COMMAND)
	       .keyDown(Keys.COMMAND)
	       .sendKeys("X")
	       .perform();
		 Thread.sleep(2000);
	     //question1.sendKeys(cellValuesList.get(0));
		 
	      answer.sendKeys(cellValuesList.get(0));
		 
	       


	}
	}
	

