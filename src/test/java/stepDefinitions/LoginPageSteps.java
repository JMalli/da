package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import newalgoutilities.BaseClass;
import newalgoutilities.LoggerLoad;
import pom.HomePagePom;
import pom.LoginPagePom;

public class LoginPageSteps extends BaseClass {
     
	 HomePagePom homepagepom;
	 LoginPagePom loginpagepom;
	 
		@Given("The user is in the Sign in page")
		public void the_user_is_in_the_sign_in_page() throws InterruptedException {
			
			BaseClass.launchApp();
			
		    homepagepom=new HomePagePom(driver); 
			homepagepom.Get_Started_Portal();	
			
			 LoginPagePom loginpagepom=new LoginPagePom(driver);
	         loginpagepom.click_Signin();
	         LoggerLoad.info("ti******tle of page " + driver.getTitle() + " on signin page");
		   
		}

		@Then("User enters Valid {string} and {string}")
		public void user_enters_valid_and(String username, String password) throws InterruptedException {
			
			LoginPagePom loginpagepom=new LoginPagePom(driver);
			loginpagepom.loginValidCredential(prop.getProperty(username),prop.getProperty(password));

		}

		@Then("User will able to navigate to homapage")
		public void user_will_able_to_navigate_to_homapage() {
			LoginPagePom loginpagepom=new LoginPagePom(driver);
			loginpagepom.quit();
		}


		
		
	}
