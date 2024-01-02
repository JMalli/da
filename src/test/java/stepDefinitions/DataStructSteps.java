package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import newalgoutilities.BaseClass;
import pom.DataStructPom;
import pom.HomePagePom;
import pom.LoginPagePom;


public class DataStructSteps  extends BaseClass {
	
	DataStructPom datastructpom = new DataStructPom(driver);
	
	@Given("User is on sign in  Page of DSAlgo Portal")
	public void user_is_on_sign_in_page_of_ds_algo_portal() throws InterruptedException {
		BaseClass.launchApp(); 
		HomePagePom homePagePom = new HomePagePom(driver);
		homePagePom.Get_Started_Portal();
	}

	@When("User entered valid Username as {string} and Password as {string}")
	public void user_entered_valid_username_as_and_password_as(String string, String string2) {
		LoginPagePom loginpagepom=new LoginPagePom(driver);
        loginpagepom.click_Signin(); 
		loginpagepom.loginValidCredential(prop.getProperty("username"),prop.getProperty("password"));
	}

	@Then("User is logged in successfully and directed to Home page of DsAlgo Portal")
	public void user_is_logged_in_successfully_and_directed_to_home_page_of_ds_algo_portal() {
	    System.out.println("user is in Home Page");
	}

	@Given("user is on Data Structure page after navigating form getstarted")
	public void user_is_on_data_structure_page_after_navigating_form_getstarted() {
		datastructpom = new DataStructPom(driver);
		datastructpom.clickDataStructureGetStarted();
	}

	@When("user click on Time Complexity")
	public void user_click_on_time_complexity() {
		datastructpom = new DataStructPom(driver);
		datastructpom.clickOnTimecomplexityLink();
	}

	@When("user navigated to Time Complexity")
	public void user_navigated_to_time_complexity() {
	    
	}

	@Then("user click on Try Here button in Time Complexity page")
	public void user_click_on_try_here_button_in_time_complexity_page() {
		datastructpom = new DataStructPom(driver);
		datastructpom.clickOnTryhereLink();	
	}

	@Given("user is in TryEditor textarea  in Time Complexity page")
	public void user_is_in_try_editor_textarea_in_time_complexity_page() {
		datastructpom = new DataStructPom(driver);
		datastructpom.TypeHere();
	}

	@When("user send valid code and click run in Time Complexity page")
	public void user_send_valid_code_and_click_run_in_time_complexity_page() {
		datastructpom = new DataStructPom(driver);
		datastructpom.Run();
		datastructpom.outputfield();
	}

	@Given("user is on Time Complexity after navigating backs from textarea")
	public void user_is_on_time_complexity_after_navigating_backs_from_textarea() {
		datastructpom = new DataStructPom(driver);
		datastructpom.revertback();
	}

	@When("user click on practice questions page on datastructures page")
	public void user_click_on_practice_questions_page_on_datastructures_page() {
		datastructpom = new DataStructPom(driver);
		datastructpom.click_PracticeQuestions();
	}
	@Then("user movie back and quit browser")
	public void user_movie_back_and_quit_browser() {
		//datastructpom = new DataStructPom(driver);
		//datastructpom.revertback();
		datastructpom.quit();
		
	}




}