package stepDefinitions;
import java.io.IOException;

import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import newalgoutilities.BaseClass;
import pom.ArrayPom;
import pom.HomePagePom;
import pom.LoginPagePom;
import pom.TreePagePom;
public class ArraySteps extends BaseClass{
	LoginPagePom loginpagepom = new LoginPagePom(driver);
	ArrayPom arraypom = new ArrayPom(driver);
	@Given("The user is in homepage")
	public void the_user_is_in_homepage() {
		BaseClass.launchApp();
			}
	@When("the user gives proper loginid, password")
	public void the_user_gives_proper_loginid_password() throws InterruptedException {
		BaseClass.launchApp();
	
		HomePagePom homepagepom = new HomePagePom(driver);
//		 Thread.sleep(2000);
		homepagepom.Get_Started_Portal();	
//			
			 LoginPagePom loginpagepom=new LoginPagePom(driver);
	 loginpagepom.click_Signin();
	 loginpagepom.loginValidCredential(prop.getProperty("username"),prop.getProperty("password"));
	
	
	}
	@Then("the user is logged in")
	public void the_user_is_logged_in() {
		
	}
	@When("user clicks on Get Started button")
	public void user_clicks_on_get_started_button() {
		arraypom.getstarted();	
	}
	@Then("user be directed to Array Data Structure page")
	public void user_be_directed_to_array_data_structure_page() {
		
	}
	@When("The user clicks Arrays in Python button")
	public void the_user_clicks_arrays_in_python_button() {
		arraypom=new ArrayPom(driver);
		arraypom.arraysinPython();
	}
	@Then("The user should be redirected to Arrays in Python page")
	public void the_user_should_be_redirected_to_arrays_in_python_page() {
	
	}
	@When("The user is in the Arrays in Python page after logged in")
	public void the_user_is_in_the_arrays_in_python_page_after_logged_in() {
		arraypom=new ArrayPom(driver);
		arraypom.tryhere();
	}
	@When("The user clicks {string} button in Arrays in Python page")
	public void the_user_clicks_button_in_arrays_in_python_page(String string) {
		arraypom=new ArrayPom(driver);
		arraypom.writeintexbox();
		arraypom.runbutton();
	}
	@Then("The user should be redirected to a page having an tryEditor with a Run button on arrays to test")
	public void the_user_should_be_redirected_to_a_page_having_an_try_editor_with_a_run_button_on_arrays_to_test() {
		arraypom=new ArrayPom(driver);
		arraypom.revertback();
	}
	@When("The user clicks {string} button")
	public void the_user_clicks_button(String string) {
		//arraypom=new ArrayPom(driver);
		//arraypom.arraysusingList();
	}
	@Then("The user should be redirected to {string} page")
	public void the_user_should_be_redirected_to_page(String string) {
	
	}
	@When("The user is in the Arrays using List page after logged in")
	public void the_user_is_in_the_arrays_using_list_page_after_logged_in() {
	
	}
	@When("The user clicks {string} button in Arrays using List page")
	public void the_user_clicks_button_in_arrays_using_list_page(String string) throws InterruptedException {
		//arraypom=new ArrayPom(driver);
		//Thread.sleep(2000);
		//arraypom.tryhere();
	}
	@Then("The user should be redirected to a arrays page having an tryEditor with a Run button to test")
	public void the_user_should_be_redirected_to_a_arrays_page_having_an_try_editor_with_a_run_button_to_test() {
		//arraypom=new ArrayPom(driver);
		//arraypom.writeintexbox();
		//arraypom.runbutton();
		
	}
	@Then("The user should be redirected to a Basic operations page having an tryEditor with a Run button to test")
	public void the_user_should_be_redirected_to_a_basic_operations_page_having_an_try_editor_with_a_run_button_to_test() {
		//arraypom=new ArrayPom(driver);
		//arraypom.revertback();
	}
	@When("The user clicks {string} button in Applications of Arrays page")
	public void the_user_clicks_button_in_applications_of_arrays_page(String string) {
		//arraypom=new ArrayPom(driver);
		//arraypom.basicoperation();
		
		
	}
	@Then("The user should be redirected to a applications arrays page having an tryEditor with a Run button to test")
	public void the_user_should_be_redirected_to_a_applications_arrays_page_having_an_try_editor_with_a_run_button_to_test() {
		//arraypom.tryhere();
		//arraypom.writeintexbox();
		//arraypom.runbutton();
		//arraypom.revertback();
	}
	@When("User clicks on Practice questions link in aray page.")
	public void user_clicks_on_practice_questions_link_in_aray_page() {
	   arraypom.question();
	}

	@Then("user should see four different questions.")
	public void user_should_see_four_different_questions() {
	    
	}

	@When("user click on Search the array link")
	public void user_click_on_search_the_array_link() {
		
	    arraypom.Searchthearray();
	}

	@Then("user should be in question {int} page")
	public void user_should_be_in_question_page(Integer int1) {
	   
	}

	@Then("user send the solution code to textarea in Search the array")
	public void user_send_the_solution_code_to_textarea_in_search_the_array() throws IOException, InterruptedException {
		arraypom=new ArrayPom(driver);
		
	    arraypom.code();
	}

	@Then("user click on run and user should see output in Search the array")
	public void user_click_on_run_and_user_should_see_output_in_search_the_array() {
	    
	}

	@Then("user click submit user should see submition sucessful in Search the array")
	public void user_click_submit_user_should_see_submition_sucessful_in_search_the_array() {
	    
	}

	@When("user click on Max Consecutive ones")
	public void user_click_on_max_consecutive_ones() {
	    
	}

	@Then("user send the solution code to textarea in Max Consecutive ones")
	public void user_send_the_solution_code_to_textarea_in_max_consecutive_ones() {
	   
	}

	@Then("user click on run and user should see output in Max Consecutive ones")
	public void user_click_on_run_and_user_should_see_output_in_max_consecutive_ones() {
	    
	}

	@Then("user click submit user should see submition sucessful in Max Consecutive ones")
	public void user_click_submit_user_should_see_submition_sucessful_in_max_consecutive_ones() {
	    
	}

	@When("user click on Find Numbers with Even Number of Digits")
	public void user_click_on_find_numbers_with_even_number_of_digits() {
	   
	}

	@Then("user send the solution code to textarea in Find Numbers with Even Number of Digits")
	public void user_send_the_solution_code_to_textarea_in_find_numbers_with_even_number_of_digits() {
	    
	}

	@Then("user click on run and user should see output in Find Numbers with Even Number of Digits")
	public void user_click_on_run_and_user_should_see_output_in_find_numbers_with_even_number_of_digits() {
	    
	}

	@Then("user click submit user should see submition sucessful in Find Numbers with Even Number of Digits")
	public void user_click_submit_user_should_see_submition_sucessful_in_find_numbers_with_even_number_of_digits() {
	    
	}

	@When("user click on Squares of a sorted Array")
	public void user_click_on_squares_of_a_sorted_array() {
	    
	}

	@Then("user send the solution code to textarea in Squares of a sorted Array")
	public void user_send_the_solution_code_to_textarea_in_squares_of_a_sorted_array() {
	    
	}

	@Then("user click on run and user should see output in Squares of a sorted Array")
	public void user_click_on_run_and_user_should_see_output_in_squares_of_a_sorted_array() {
	    
	}

	@Then("user click submit user should see submition sucessful in Squares of a sorted Array")
	public void user_click_submit_user_should_see_submition_sucessful_in_squares_of_a_sorted_array() {
	    driver.quit();
	}



}

