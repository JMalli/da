package pom;


import java.time.Duration;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;


import newalgoutilities.BaseClass;
public class QueuePom extends BaseClass {
	
	
	WebDriver driver;
	WebDriverWait wait;
	
	@FindBy(xpath="//*[@id=\"navbarCollapse\"]/div[1]/div/a")
	WebElement dropdown;
	
	@FindBy(xpath="//*[@id=\"navbarCollapse\"]/div[1]/div/div/a[4]")
	WebElement Queue;
	
	@FindBy(xpath="//a[text()='Implementation of Queue in Python']") 
	WebElement ImplementationOfQueue;


	@FindBy(xpath="//a[text()='Implementation using collections.deque']") 
	WebElement ImplimentationUsingCollections;


	@FindBy(xpath="//a[text()='Implementation using array']") 
	WebElement ImplimentationUsingArray;
	
	@FindBy(xpath="//a[text()='Queue Operations']") 
	WebElement QueueOperations;
	
	@FindBy(xpath="//a[text()='Try here>>>']")
	WebElement Tryhere;
	
	@FindBy(xpath="//textarea[@id='editor']/../div/div/textarea")
	WebElement textarea;
	
	@FindBy(xpath="//*[@id=\"answer_form\"]/button")
	WebElement Run;
	public QueuePom(WebDriver driver) {     
		wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		 this.driver=driver;
		PageFactory.initElements(driver,this);
}
	
	public void dropdown() {
		
		dropdown.click();
		
	}	
		
	public void ClickQueue() {
		
		Queue.click();
	}	
public void ImplementationOfQueue() {
		
		ImplementationOfQueue.click();
	}
	
	public void Tryhere() {
		
		Tryhere.click();
	}
	
	
	public void Sendcode() {
		
		textarea.sendKeys("print('Hello World')");  		
		Run.click();


		
	}
	
	public void revertback()
	{
		driver.navigate().back();
	
    }
	
	public void ImplimentationUsingCollections() {
		
		ImplimentationUsingCollections.click();
	}
	
	public void ImplimentationUsingArray() {
		
		ImplimentationUsingArray.click();
	}
public void QueueOperations() {
		
		QueueOperations.click();
	}
}
