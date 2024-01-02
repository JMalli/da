package pom;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import newalgoutilities.BaseClass;

public class LoginPagePom extends BaseClass {
	
	WebDriver driver;
	WebDriverWait wait;
	
	@FindBy(xpath="//*[@id=\"navbarCollapse\"]/div[2]/ul/a[3]")
	WebElement SignIn;
	
	@FindBy(xpath="//*[@id=\"id_username\"]")
	WebElement username;
	
	@FindBy(xpath="//*[@id=\"id_password\"]")
	WebElement password;
	
	@FindBy(xpath="/html/body/div[2]/div/div[2]/form/input[4]")
	WebElement Login;
	
	@FindBy(xpath="/html/body/div[3]")
	WebElement Error;
	
	
	public LoginPagePom(WebDriver driver) {                               //created constructor
		wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		this.driver=driver;
		PageFactory.initElements(driver,this);  
	}
	
	public void click_Signin() {
		
		SignIn.click();
}
	
	public void  login_invalid_credential(String InvUser,String InvPw){
		username.sendKeys(InvUser);
		password.sendKeys(InvPw);
		Login.click();
		
	}
	
	
	public void Alert() {
		
		String error=Error.getText();
		System.out.println("Error is:"+error);
		
	}
	public String gettitle()
	{
		String title=driver.getTitle();
		return title;
	}
	
	public void loginValidCredential(String Us,String Pw) {
		username.sendKeys(Us);
		password.sendKeys(Pw);
		Login.click();
		
		
	}

}
