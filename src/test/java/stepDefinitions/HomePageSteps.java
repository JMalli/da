package stepDefinitions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.cucumber.core.logging.Logger;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import newalgoutilities.BaseClass;
import pom.HomePagePom;
public class HomePageSteps extends BaseClass {
	
	
	 HomePagePom homepagepom;
	 //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	
	
	@Given("The user opens Home Page")
	public void the_user_opens_home_page() throws InterruptedException {
		System.out.println("the_user_opens_home_page: calling launchApp");
		BaseClass.launchApp();
			       //homepagepom=new HomePagePom(driver);
		           //homepagepom.Get_Started_Portal();
	}
	@When("User clicks Data Structure dropdown")
	public void user_clicks_data_structure_drop_down() throws InterruptedException {
			
		    homepagepom=new HomePagePom(driver);
		  
			homepagepom.Get_Started_Portal();	 
			
		}
	@Then("It should see six different data structure entried in dropdown")
	public void it_should_see_six_different_data_structure_entried_in_dropdown() {
			
	}
	@When("The user clicks any of the Get Started buttons below the data structures")
	public void the_user_clicks_any_of_the_get_started_buttons_below_the_data_structures() throws InterruptedException {
		
		homepagepom=new HomePagePom(driver);
		
		//Thread.sleep(2000);
	
		homepagepom.click_DS_Get_Started_Alert();
	   
	}
	@Then("It should alert the user with a message {string}")
	public void it_should_alert_the_user_with_a_message(String Alert) {	
	
	}
	@When("The user selects any data structures item from the drop down without Sign in")
	public void the_user_selects_any_data_structures_item_from_the_drop_down_without_sign_in() throws InterruptedException {
		homepagepom=new HomePagePom(driver);
		homepagepom.click_DS_Get_Started_Alert();
	   
	}
	@Then("It should alert the user with a message \"You are not logged in\"here")
	public void it_should_alert_the_user_with_a_message_you_are_not_logged_in_here() {
			
	}
	@When("The user clicks Sign in")
	public void the_user_clicks_sign_in() throws InterruptedException {
		
		homepagepom=new HomePagePom(driver);
		//Thread.sleep(2000);
		homepagepom.click_Signin();
	}
	@Then("The user should be redirected to Sign in page")
	public void the_user_should_be_redirected_to_sign_in_page() {
		
	   
	}
	@When("The user clicks Register")
	public void the_user_clicks_register() throws InterruptedException
		{
		    homepagepom=new HomePagePom(driver);
			homepagepom.click_Register();
		}
	@Then("The user should be redirected to Register form")
	public void the_user_should_be_redirected_to_register_form() {
		//homepagepom.quit();
	}
}
