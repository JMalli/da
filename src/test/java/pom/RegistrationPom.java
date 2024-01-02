package pom;
import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import newalgoutilities.BaseClass;
public class RegistrationPom extends BaseClass {
	 BaseClass baseclass=new BaseClass();
	
	WebDriver driver;
	WebDriverWait wait;
	
	@FindBy(xpath="//*[@id=\"navbarCollapse\"]/div[2]/ul/a[2]")
	WebElement RegisterHome;
	
	@FindBy(xpath="//*[@id=\"id_username\"]")
	WebElement username;
	
	@FindBy(xpath="//*[@id=\"id_password1\"]")
	WebElement password;
	
	@FindBy(xpath="//*[@id=\"id_password2\"]")
	WebElement ConfPassword;
	
	
	@FindBy(xpath="/html/body/div[2]/div/div[2]/form/input[5]")
    WebElement Register;
	
	
	public RegistrationPom(WebDriver driver) {      //created constructor
		wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		 this.driver=driver;
		PageFactory.initElements(driver,this); 
                                   
	}
	
	public void click_Registration() {
		
		RegisterHome.click();
		
	}
	
	public void Login (String Us,String Pw,String ConPw) {
		
		username.sendKeys(Us);
		password.sendKeys(Pw);
		ConfPassword.sendKeys(ConPw);
		Register.click();
		                                              	
	}	
	
}
