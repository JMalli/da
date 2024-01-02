package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import newalgoutilities.BaseClass;
import newalgoutilities.LoggerLoad;
import pom.HomePagePom;
import pom.RegistrationPom;

public class RegistrationSteps extends BaseClass {

	 HomePagePom homepagepom;
	 RegistrationPom registrationpom;
	
@Given("User is on Registration page")
	public void user_is_on_registration_page() throws InterruptedException {
		
				BaseClass.launchApp();
	
				 
		RegistrationPom registrationpom=new RegistrationPom(driver);  //should be their
		homepagepom=new HomePagePom(driver);                          //otherwise will get NullPointException
		homepagepom.Get_Started_Portal();	
		registrationpom.click_Registration();
		//LoggerLoad.info("title of page " + driver.getTitle() + " on home page");
		
	    
	}
@When("User enters {string},{string} and {string}")
public void user_enters_and(String username, String password, String ConfPassword) {
	
	RegistrationPom registrationpom=new RegistrationPom(driver);
	registrationpom.Login(prop.getProperty("username"),prop.getProperty("password"),
	prop.getProperty("ConfPassword"));
	
}
@Then("User click on Register button and then signin button")
public void user_click_on_register_button_and_then_signin_button() {
	
	RegistrationPom registrationpom=new RegistrationPom(driver);
	registrationpom.click_Registration();
   
}

@Then("User should be able to Register successfuly and navigate to login")
public void user_should_be_able_to_register_successfuly_and_navigate_to_login() {
    	
     System.out.println("user is on login page");
}
}

