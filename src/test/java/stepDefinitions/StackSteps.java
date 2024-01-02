package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import newalgoutilities.BaseClass;
import pom.HomePagePom;
import pom.LoginPagePom;
import pom.StackPom;
import pom.TreePagePom;
public class StackSteps extends BaseClass {
	
	HomePagePom homepagepom;
	 LoginPagePom loginpagepom;
	 StackPom stack= new StackPom(driver);
	@Given("user is on Stack page after navigating form getstarted")
	public void user_is_on_stack_page_after_navigating_form_getstarted() throws InterruptedException {
			BaseClass.launchApp();
	        homepagepom=new HomePagePom(driver);
		    Thread.sleep(2000);
		    homepagepom.Get_Started_Portal();	
			LoginPagePom loginpagepom=new LoginPagePom(driver);
	        loginpagepom.click_Signin();
	        loginpagepom.loginValidCredential(prop.getProperty("username"),prop.getProperty("password"));
	        stack=new StackPom(driver);
	        stack.Click_getstarted();
	}

	@When("user click on Operations in Stack")
	public void user_click_on_operations_in_stack() {
		stack=new StackPom(driver);
        stack.Click_OperationsInStack();
	}

	@When("user navigated to Operations in Stack")
	public void user_navigated_to_operations_in_stack() {
	    System.out.println("User is in Operation in stack page");
	}

	@Then("user click on Try Here button in Operations in Stack page")
	public void user_click_on_try_here_button_in_operations_in_stack_page() {
		stack=new StackPom(driver);
	    stack.Click_TryHereButton();
	}

	@Given("user is in TryEditor textarea  in Operations in Stack page")
	public void user_is_in_try_editor_textarea_in_operations_in_stack_page() {
	   
	}

	@When("user send valid code and click run in Operations in Stack page")
	public void user_send_valid_code_and_click_run_in_operations_in_stack_page() {
		stack=new StackPom(driver);
	    stack.SendCode();
	}

	@Then("code should get execute and display output")
	public void code_should_get_execute_and_display_output() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	}

	@Given("user is on Implimentation page after navigating form getstarted")
	public void user_is_on_implimentation_page_after_navigating_form_getstarted() {
		stack=new StackPom(driver);
	    stack.revertback();
	}

	@When("user click on Implimentation link in Stack")
	public void user_click_on_implimentation_link_in_stack() {
		stack=new StackPom(driver);
	    stack.Click_Implemenation();
	}

	@When("user navigated to Implimentation in Stack")
	public void user_navigated_to_implimentation_in_stack() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	}

	@Then("user click on Try Here button in  Implimentation page")
	public void user_click_on_try_here_button_in_implimentation_page() {
		stack=new StackPom(driver);
	    stack.Click_TryHereButton();
	}

	@Given("user is in TryEditor textarea  in Operations in Implimentation page")
	public void user_is_in_try_editor_textarea_in_operations_in_implimentation_page() {
		
	}

	@When("user send valid code and click run in Implimentation page")
	public void user_send_valid_code_and_click_run_in_implimentation_page() {
		stack=new StackPom(driver);
	    stack.SendCode();
	    stack.Run();
	}

	@Given("user is on Applications page after navigating form getstarted")
	public void user_is_on_applications_page_after_navigating_form_getstarted() {
		stack=new StackPom(driver);
	    stack.revertback();
	}

	@When("user click on Applications link  in Stack")
	public void user_click_on_applications_link_in_stack() {
		stack=new StackPom(driver);
	    stack.Click_Applications();
	}

	@When("user navigated to Applications in Stack")
	public void user_navigated_to_applications_in_stack() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
	}

	@Then("user click on Try Here button in Applications page")
	public void user_click_on_try_here_button_in_applications_page() {
		stack=new StackPom(driver);
	    stack.Click_TryHereButton();
	}

	@Given("user is in TryEditor textarea  in Applications page")
	public void user_is_in_try_editor_textarea_in_applications_page() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	}

	@When("user send valid code and click run in Applications page")
	public void user_send_valid_code_and_click_run_in_applications_page() {
		stack=new StackPom(driver);
	    stack.SendCode();
	    stack.Run();
	}

	@Given("user is on Applications page after navigating backs from textarea")
	public void user_is_on_applications_page_after_navigating_backs_from_textarea() {
		stack=new StackPom(driver);
	    stack.revertback();
	}

	@When("user click on practice questions page on stack page")
	public void user_click_on_practice_questions_page_on_stack_page() {
		stack=new StackPom(driver);
	    stack.Click_PracticeQuestions();
	}

	@When("user should navigate to practice questions page of stack")
	public void user_should_navigate_to_practice_questions_page_of_stack() {
		stack=new StackPom(driver);
		stack.revertback();
	   // stack.quit();
	}




}
