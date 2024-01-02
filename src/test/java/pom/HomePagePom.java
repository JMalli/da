package pom;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import newalgoutilities.BaseClass;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
//import io.cucumber.core.plugin.PluginFactory;

public class HomePagePom extends BaseClass  {
	
	WebDriver driver;
	WebDriverWait wait;
	
	@FindBy(xpath="/html/body/div[1]/div/div/a/button")
	WebElement GetStartedPortal;
	
	@FindBy(xpath ="//*[@id=\"navbarCollapse\"]/div[1]/div/a") 
	WebElement GetStarted_dropdown;
	
	@FindBy(xpath ="/html/body/div[2]")
	WebElement Alert;
	
	@FindBy(xpath ="//*[@id=\"navbarCollapse\"]/div[2]/ul/a[3]")
	WebElement Sign_in;
	
	@FindBy(xpath ="//*[@id=\"navbarCollapse\"]/div[2]/ul/a[2]")
	WebElement Register;
	public HomePagePom(WebDriver driver) {      //created constructor
	wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		 this.driver=driver;
		PageFactory.initElements(driver,this);   //
                                     
	}
	 
	
	
	//page class should not have any assertion, step class will have it
	
	

	public void Get_Started_Portal () throws InterruptedException {
		
		GetStartedPortal.click();
		//Thread.sleep(2000);
	}

	
    public void click_DS_Get_Started_Alert() throws InterruptedException {
		
    	GetStarted_dropdown.click();
    	System.out.println(Alert);
    	//Thread.sleep(2000);
		
	}
   
     public void click_Signin() throws InterruptedException {
		
	   Sign_in.click();
	   Thread.sleep(2000);
}
   
   public void click_Register() throws InterruptedException {
		
	   Register.click();
	   Thread.sleep(2000);
	   driver.close();
	   driver.quit();
   
   }  
}
