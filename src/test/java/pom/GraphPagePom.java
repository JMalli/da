package pom;
import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import newalgoutilities.BaseClass;
public class GraphPagePom extends BaseClass {
	
	WebDriver driver;
	WebDriverWait wait;
	
	@FindBy(xpath="//*[@id=\"navbarCollapse\"]/div[1]/div/div/a[6]")
	WebElement DropdownGraph;
	
	@FindBy(xpath="//*[@id=\"navbarCollapse\"]/div[1]/div/a")
	WebElement dropdown;
	@FindBy(xpath="/html/body/div[2]/ul[2]/a")
	WebElement TopicsGraph;
	@FindBy(xpath="//a[text()='Graph Representations']")    
	WebElement Representation;
	
	@FindBy(xpath="//a[text()='Try here>>>']")
	WebElement Tryhere;
	
	@FindBy(xpath="//textarea[@id='editor']/../div/div/textarea")
	WebElement textarea;
	
	@FindBy(xpath="//*[@id=\"answer_form\"]/button")
	WebElement Run;
	
	public GraphPagePom(WebDriver driver) {    
		wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		 this.driver=driver;
		PageFactory.initElements(driver,this);
	}
public void dropdown() {
		
		dropdown.click();
	}
	
	
	public void DropdownGraph() {
		
		DropdownGraph.click();
	}
	
	
	public void TopicsGraph() {
		
		TopicsGraph.click();
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
   public void Representation() {
   	
   	Representation.click();
   }
  
  
	
	
}

