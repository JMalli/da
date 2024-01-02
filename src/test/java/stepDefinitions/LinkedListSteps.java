package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import newalgoutilities.BaseClass;
import pom.HomePagePom;
import pom.LinkedListPom;
import pom.LoginPagePom;

public class LinkedListSteps extends BaseClass {
	
	LinkedListPom linkedlistpom;
	LoginPagePom loginpagepom;
	HomePagePom homepagepom;
	
	@Given("User is in Home Page")
	public void user_is_in_home_page() throws InterruptedException {

         BaseClass.launchApp();
		
	    homepagepom=new HomePagePom(driver); 
		homepagepom.Get_Started_Portal();	
		
		 LoginPagePom loginpagepom=new LoginPagePom(driver);
         loginpagepom.click_Signin();
         loginpagepom.loginValidCredential(prop.getProperty("username"),prop.getProperty("password"));
         
	}

	@When("User clicks on Linked List button and enters in the Module")
	public void user_clicks_on_linked_list_button_and_enters_in_the_module() {
		
		LinkedListPom linkedlistpom=new LinkedListPom (driver);
		linkedlistpom.GSLinkedList();

	}

	@Then("User clicks Introduction from Topics covered and then user scrolls down and clicks on Try here button")
	public void user_clicks_introduction_from_topics_covered_and_then_user_scrolls_down_and_clicks_on_try_here_button() {

		LinkedListPom linkedlistpom=new LinkedListPom (driver);
		linkedlistpom.clickIntroduction();
		linkedlistpom.clickTryhere();
	}

	@Then("User will type in python code and hit run button")
	public void user_will_type_in_python_code_and_hit_run_button() throws InterruptedException {
		
		LinkedListPom linkedlistpom=new LinkedListPom (driver);
		linkedlistpom.clickTextAreaSendCodeRun();
	    
	}

	@Then("user navigate to back and cliks on Creating Linked List then user scrolls down and clicks on Try here button")
	public void user_navigate_to_back_and_cliks_on_creating_linked_list_then_user_scrolls_down_and_clicks_on_try_here_button() {
		
		LinkedListPom linkedlistpom=new LinkedListPom (driver);
		linkedlistpom.revertback();
		linkedlistpom.ClickCreatingLinkedList();
		linkedlistpom.clickTryhere();
		
	}

	
	@Then("User will type in python code,hit run button and user navigate to back")
	public void user_will_type_in_python_code_hit_run_button_and_user_navigate_to_back() {

		LinkedListPom linkedlistpom=new LinkedListPom (driver);
		linkedlistpom.clickTextAreaSendCodeRun();
		linkedlistpom.revertback();
	}

	@Given("User is in the Linked List Module")
	public void user_is_in_the_linked_list_module() {
		
		
		

	}

	@When("User clicks on Types of Linked list button and then user scrolls down and clicks on Try here button")
	public void user_clicks_on_types_of_linked_list_button_and_then_user_scrolls_down_and_clicks_on_try_here_button() {
		
		LinkedListPom linkedlistpom=new LinkedListPom (driver);
		linkedlistpom.TypesOfLinkedList();
		linkedlistpom.clickTryhere();
	
	 
	}
	@Then("User will type in python code and hit run button and user navigate to back")
	public void user_will_type_in_python_code_and_hit_run_button_and_user_navigate_to_back() {
		
		LinkedListPom linkedlistpom=new LinkedListPom (driver);
		linkedlistpom.clickTextAreaSendCodeRun();
		linkedlistpom.revertback();

	}

	@Then("user cliks on Impliment Link list in python and clicks on Try here button")
	public void user_cliks_on_impliment_link_list_in_python_and_clicks_on_try_here_button() {
		
		LinkedListPom linkedlistpom=new LinkedListPom (driver);
		linkedlistpom.ClickImplementList();
		linkedlistpom.clickTryhere();

	}

	@Given("User is inside Linked List Module")
	public void user_is_inside_linked_list_module() {
		
		//LinkedListPom linkedlistpom=new LinkedListPom (driver);
	  
	}

	@When("User clicks on Traversal button and then user scrolls down and clicks on Try here button")
	public void user_clicks_on_traversal_button_and_then_user_scrolls_down_and_clicks_on_try_here_button() {
		
		LinkedListPom linkedlistpom=new LinkedListPom (driver);
		linkedlistpom.ClickTraversal();
		linkedlistpom.clickTryhere();
		

	}

	@Then("User will type in python code and hit run button then user navigate to back")
	public void user_will_type_in_python_code_and_hit_run_button_then_user_navigate_to_back() {
		
		LinkedListPom linkedlistpom=new LinkedListPom (driver);
		linkedlistpom.clickTextAreaSendCodeRun();
		linkedlistpom.revertback();

	}
	@Then("user cliks on Inserion button and user scrolls down then clicks on Try here button")
	public void user_cliks_on_inserion_button_and_user_scrolls_down_then_clicks_on_try_here_button() {
		
		LinkedListPom linkedlistpom=new LinkedListPom (driver);
		linkedlistpom.ClickInsertion();
		linkedlistpom.clickTryhere();
			
		
	}
	@Then("User clicks on Deletion button and then user scrolls down and clicks on Try here button")
	public void user_clicks_on_deletion_button_and_then_user_scrolls_down_and_clicks_on_try_here_button() throws InterruptedException {
		
		LinkedListPom linkedlistpom=new LinkedListPom (driver);
		linkedlistpom.ClickDeletion();
		linkedlistpom.clickTryhere();
		//Thread.sleep(1000);
		//linkedlistpom.quit();
	
	}

}


