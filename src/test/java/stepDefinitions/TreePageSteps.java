package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import newalgoutilities.BaseClass;
import pom.HomePagePom;
import pom.LoginPagePom;
import pom.TreePagePom;

public class TreePageSteps  extends BaseClass {
	 //TreePagePom tree;
	 HomePagePom homepagepom;
	 LoginPagePom loginpagepom;
	
	 TreePagePom tree= new TreePagePom(driver);
	@Given("user is in home page after login")
	public void user_is_in_home_page_after_login() throws InterruptedException {
		
       BaseClass.launchApp();
     
       homepagepom=new HomePagePom(driver);
	    Thread.sleep(2000);
	    homepagepom.Get_Started_Portal();	
		 LoginPagePom loginpagepom=new LoginPagePom(driver);
       loginpagepom.click_Signin();
        loginpagepom.loginValidCredential(prop.getProperty("username"),prop.getProperty("password"));
        
	}

	@When("user choose tree form dropdown menu")
	public void user_choose_tree_form_dropdown_menu() throws InterruptedException {
		
		tree=new TreePagePom(driver);
		Thread.sleep(1000);
	    tree.DropdownforSelection();
	    System.out.println("tree is clicking");
		 
	}

	@Then("user redirected to tree home page")
	public void user_redirected_to_tree_home_page() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	}

	@Given("user is in tree page after selecting tree from dropdown")
	public void user_is_in_tree_page_after_selecting_tree_from_dropdown() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	}

	@When("user click on the Overview of trees link")
	public void user_click_on_the_overview_of_trees_link() throws InterruptedException {
		tree=new TreePagePom(driver);
		Thread.sleep(2000);
	    tree.click_OverviewOfTrees();
	}

	@When("user redirected to the Overview page")
	public void user_redirected_to_the_overview_page() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	}

	@Then("user click on Try Here button  in overview page")
	public void user_click_on_try_here_button_in_overview_page() {
		tree=new TreePagePom(driver);
	    tree.Click_TryHereButton();
	}

	@Given("user is in TryEditor textarea  of overview page")
	public void user_is_in_try_editor_textarea_of_overview_page() {
		//tree=new TreePagePom(driver);
	   // tree.Click_TextArea();
	   
	}

	@When("user send valid code and click run in overview page")
	public void user_send_valid_code_and_click_run() {
		tree=new TreePagePom(driver);
		 tree.SendCode();
	    tree.Run();
	}

	@Then("code should get execute and display out")
	public void code_should_get_execute_and_display_out() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
	}

	@When("user send invalid code and click run")
	public void user_send_invalid_code_and_click_run() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	}

	@Then("should display error through alert.")
	public void should_display_error_through_alert1() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
	}

	@Given("user is on Overview page after naviagting from overview texteditor")
	public void user_is_on_overview_page() {
		tree=new TreePagePom(driver);
	    tree.revertback();
	}

	@When("user click on Terminologies link")
	public void user_click_on_terminologies_link() {
		tree=new TreePagePom(driver);
	    tree.click_Terminologies();
	}

	@When("user navigated to {string} page")
	public void user_navigated_to_page(String string) {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
	}

	@Then("user click on Try Here button in Terminologies page")
	public void user_click_on_try_here_button_in_terminologies_page() {
		tree=new TreePagePom(driver);
	    tree.Click_TryHereButton();
	}

	@Given("user is in Terminologies TryEditor textarea")
	public void user_is_in_terminologies_try_editor_textarea() {
		//tree=new TreePagePom(driver);
		//tree.Click_TextArea();
	    
	}
	@When("user send valid code and click run in terminologies page")
	public void user_send_valid_code_and_click_run_in_terminologies_page() {
		tree=new TreePagePom(driver);
		tree.SendCode();
	   tree.Run();
	}

	@Then("should display error through alert")
	public void should_display_error_through_alert() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	}
//	@Given("user is on terminologies page after navigating from types of tree")
//	public void user_is_on_terminologies_page_after_navigating_from_types_of_tree() {
//		tree=new TreePagePom(driver);
//	    tree.revertback();
//	}
	@Given("user is on terminologies page after navigating from terminologies text area")
	public void user_is_on_terminologies_page_after_navigating_from_terminologies_text_area() {
		tree=new TreePagePom(driver);
	    tree.revertback();
	}


	@When("user click on Types of Trees")
	public void user_click_on_types_of_trees() {
		tree=new TreePagePom(driver);
	    tree.click_TypesOfTrees();
	}

	@When("user navigated to Types of trees page")
	public void user_navigated_to_types_of_trees_page() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	}

	@Then("user click on Try Here button in Types of trees page")
	public void user_click_on_try_here_button_in_types_of_trees_page() {
		tree=new TreePagePom(driver);
	   tree.Click_TryHereButton();
	}

	@Given("user is in Types of trees page TryEditor textarea")
	public void user_is_in_types_of_trees_page_try_editor_textarea() {
	   //tree.Click_TextArea();
	    
	}
	@When("user send valid code and click run in types of tree page")
	public void user_send_valid_code_and_click_run_types_of_tree_page() {
		tree=new TreePagePom(driver);
		tree.SendCode();
	    tree.Run();
	}
	@Given("user is on Types of trees page after navigating form types of tree text area")
	public void user_is_on_types_of_trees_page() {
		tree=new TreePagePom(driver);
	    tree.revertback();
	}

	@When("user click on Tree Traverslas")
	public void user_click_on_tree_traverslas() {
		tree=new TreePagePom(driver);
	    tree.click_TreeTraversals();
	}

	@When("user navigated to Tree Traversals page")
	public void user_navigated_to_tree_traversals_page() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	}

	@Then("user click on Try Here button in tree traverals page")
	public void user_click_on_try_here_button_in_tree_traverals_page() {
		tree=new TreePagePom(driver);
	    tree.Click_TryHereButton();
	}

	@Given("user is in  Tree traversals TryEditor textarea")
	public void user_is_in_tree_traversals_try_editor_textarea() {
	    //tree.Click_TextArea();
	   
	}
	@When("user send valid code and click run in tree traversals page")
	public void user_send_valid_code_and_click_run_in_tree_traversals_page() {
		tree=new TreePagePom(driver);
		 tree.SendCode();
	    tree.Run();
	}

	@Given("user is on Tree Traversals page after navigating from tree traversals textarea")
	public void user_is_on_tree_traversals_page_after_navigating_from_tree_traversals_textarea() {
		tree=new TreePagePom(driver);
	    tree.revertback();
	}

	@When("user click on Traverslas-Illustration")
	public void user_click_on_traverslas_illustration() {
		tree=new TreePagePom(driver);
	    tree.click_TraversalsIllustration();
	}

	@When("user navigated to Traversals-Illustration page")
	public void user_navigated_to_traversals_illustration_page() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	}

	@Then("user click on Try Here button in traversal illustration page")
	public void user_click_on_try_here_button_in_traversal_illustration_page() {
		tree=new TreePagePom(driver);
	    tree.Click_TryHereButton();
	}

	@Given("user is in Traversals Illustation TryEditor textarea")
	public void user_is_in_traversals_illustation_try_editor_textarea() {
	   // tree.Click_TextArea();
	    
	}
	@When("user send valid code and click run in traversals Illustration")
	public void user_send_valid_code_and_click_run_in_traversals_Illustration() {
		tree=new TreePagePom(driver);
		 tree.SendCode();
	    tree.Run();
	}
	@Given("user is on Traversals-Illustration page after navigating from textarea")
	public void user_is_on_traversals_illustration_page_after_navigating_from_textarea() {
		tree=new TreePagePom(driver);
	    tree.revertback();
	}

	@When("user click on Binary Trees")
	public void user_click_on_binary_trees() {
		tree=new TreePagePom(driver);
	    tree.click_BinaryTrees();
	}

	@When("user navigated to Binary Tress page")
	public void user_navigated_to_binary_tress_page() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
	}

	@Then("user click on Try Here button in binary tree page")
	public void user_click_on_try_here_button_in_binary_tree_page() {
		tree=new TreePagePom(driver);
	    tree.Click_TryHereButton();
	}

	@Given("user is in  Binary Trees TryEditor textarea")
	public void user_is_in_binary_trees_try_editor_textarea() {
	    //tree.Click_TextArea();
	    
	}
	@When("user send valid code and click run in binary tree")
	public void user_send_valid_code_and_click_run_in_binary_tree() {
		tree=new TreePagePom(driver);
		tree.SendCode();
	    tree.Run();
	}
	@Given("user is on Binary Trees page after navigating from textarea")
	public void user_is_on_Binary_Trees_page_after_navigating_from_textarea() {
	    tree.revertback();
	}

	@When("user click on Types of Binary Trees")
	public void user_click_on_types_of_binary_trees() {
		tree=new TreePagePom(driver);
	    tree.click_TypesOfBinaryTrees();
	}

	@When("user navigated to Types of Binary Tress page")
	public void user_navigated_to_types_of_binary_tress_page() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
	}

	@Then("user click on Try Here button in types of binary tree page")
	public void user_click_on_try_here_button_in_types_of_binary_tree_page() {
	    tree.Click_TryHereButton();
	}

	@Given("user is in Types of binary Trees TryEditor textarea")
	public void user_is_in_types_of_binary_trees_try_editor_textarea() {
	    //tree.Click_TextArea();
	    
	}
	@When("user send valid code and click run in types of binary tree")
	public void user_send_valid_code_and_click_run_in_types_of_binary_tree() {
		tree=new TreePagePom(driver);
		tree.SendCode();
	    tree.Run();
	}
	@Given("user is on Types of Binary Trees page after navigating from textarea")
	public void user_is_on_types_of_binary_trees_page_after_navigating_from_textarea() {
	    tree.revertback();
	}

	@When("user click on  Implimentation in Python")
	public void user_click_on_implimentation_in_python() {
		tree=new TreePagePom(driver);
	    tree.click_ImplementationInPython();
	}

	@When("user navigated to Implimentation in Python page")
	public void user_navigated_to_implimentation_in_python_page() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
	}

	@Then("user click on Try Here button in implimentation in python page")
	public void user_click_on_try_here_button_in_implimentation_in_python_page() {
	    tree.Click_TryHereButton();
	}

	@Given("user is in  implimentaion in python TryEditor textarea")
	public void user_is_in_implimentaion_in_python_try_editor_textarea() {
	    //tree.Click_TextArea();
	    
	}
	@When("user send valid code and click run inimplimentation in python")
	public void user_send_valid_code_and_click_run_inimplimentation_in_python() {
		tree=new TreePagePom(driver);
		tree.SendCode();
	    tree.Run();
	}
	@Given("user is on  Implimentaion in Python page after navigating from textarea")
	public void user_is_on_implimentaion_in_python_page_after_navigating_from_textarea() {
	    tree.revertback();
	}
	
	@When("user click on  Binary Tree Traversals")
	public void user_click_on_binary_tree_traversals() {
		tree=new TreePagePom(driver);
	    tree.click_BinaryTreeTraversals();
	}

	@When("user navigated to Binary Tree Traversals page")
	public void user_navigated_to_binary_tree_traversals_page() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	}

	@Then("user click on Try Here button in binary tree traversals page")
	public void user_click_on_try_here_button_in_binary_tree_traversals_page() {
	    tree.Click_TryHereButton();
	}

	@Given("user is in  binary tree traversals TryEditor textarea")
	public void user_is_in_binary_tree_traversals_try_editor_textarea() {
	   // tree.Click_TextArea();
	   
	}
	@When("user send valid code and click run  in binary tree traversals")
	public void user_send_valid_code_and_click_run_in_binary_tree_traversals() {
		tree=new TreePagePom(driver);
		tree.SendCode();
	   tree.Run();
	}
	@Given("user is on Binary Tree Traversals page after navigating from textarea")
	public void user_is_on_binary_tree_traversals_page_after_navigating_from_textarea() {
		tree=new TreePagePom(driver);
	    tree.revertback();
	}

	@When("user click on  Implemenation of Binary Trees")
	public void user_click_on_implemenation_of_binary_trees() {
		tree=new TreePagePom(driver);
	    tree.click_ImplementationofBinaryTrees();
	}

	@When("user navigated to Implementation of Binary Trees page")
	public void user_navigated_to_implementation_of_binary_trees_page() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	}

	@Then("user click on Try Here button in Implementation of Binary Trees page")
	public void user_click_on_try_here_button_in_implementation_of_binary_trees_page() {
			//String click= tree.Click_TryHereButton();
		//Actions actions = new Actions(driver);
		 //actions.scrollToElement(click).perform();
		tree=new TreePagePom(driver);
	   tree.Click_TryHereButton();
	}

	@Given("user is in  Implimentation of binary trees TryEditor textarea")
	public void user_is_in_implimentation_of_binary_trees_try_editor_textarea() {
	   //tree.Click_TextArea();
	   
	}
	@When("user send valid code and click run in implementation of binary trees")
	public void user_send_valid_code_and_click_run_in_implementation_of_binary_trees() {
		tree=new TreePagePom(driver);
		tree.SendCode();
	    tree.Run();
	}

	@Given("user is on Implimenation of Binary Trees page after navigating form textarea")
	public void user_is_on_implimenation_of_binary_trees_page_after_navigating_form_textarea() {
	    tree.revertback();
	}

	@When("user click on  Application of Binary Trees")
	public void user_click_on_application_of_binary_trees() {
		tree=new TreePagePom(driver);
	    tree.click_ApplicationsOfBinaryTrees();
	}

	@When("user navigated to Application of Binary Trees page")
	public void user_navigated_to_application_of_binary_trees_page() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	}

	@Then("user click on Try Here button in Application of Binary Trees page")
	public void user_click_on_try_here_button_in_application_of_binary_trees_page() {
	    tree.Click_TryHereButton();
	}

	@Given("user is in Application of Binary Trees TryEditor textarea")
	public void user_is_in_application_of_binary_trees_try_editor_textarea() {
	   // tree.Click_TextArea();
	   
	}
	@When("user send valid code and click run in application of binary trees")
	public void user_send_valid_code_and_click_run_in_application_of_binary_trees() {
		tree=new TreePagePom(driver);
		tree.SendCode();
	    tree.Run();
	}
	
	@Given("user is on  Application of Binary Trees page after navigating from textarea")
	public void user_is_on_application_of_binary_trees_page_after_navigating_from_textarea() {
	   tree.revertback();
	}

	@When("user click on  Binary Search Trees")
	public void user_click_on_binary_search_trees() {
		tree=new TreePagePom(driver);
	    tree.click_BinarySearchTrees();
	}

	@Then("user click on Try Here button in  Binary Search Trees")
	public void user_click_on_try_here_button_in_binary_search_trees() {
	    tree.Click_TryHereButton();
	}

	@Given("user is in Binary Search Trees TryEditor textarea")
	public void user_is_in_binary_search_trees_try_editor_textarea() {
	   // tree.Click_TextArea();
	    
	}
	@When("user send valid code and click run  in binary search trees page")
	public void user_send_valid_code_and_click_run_in_binary_search_trees_page() {
		tree=new TreePagePom(driver);
		tree.SendCode();
	    tree.Run();
	}
	@Given("user is on Binary Search Trees page")
	public void user_is_on_binary_search_trees_page() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	}
	@Given("user is on Binary Search Trees page after navigating form textarea")
	public void user_is_on_binary_search_trees_page_after_navigating_form_textarea() {
	   tree.revertback();
	}

	@When("user click on Implementation of BTS")
	public void user_click_on_implementation_of_bts() {
		tree=new TreePagePom(driver);
	    tree.click_ImplementationOfBTS();
	}

	@When("user navigated to Implementation of BTS page")
	public void user_navigated_to_implementation_of_bts_page() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
	}

	@Then("user click on Try Here button in Implementation of BTS page")
	public void user_click_on_try_here_button_in_implementation_of_bts_page() {
		tree=new TreePagePom(driver);
	    tree.Click_TryHereButton();
	}
	@Given("user is in TryEditor textarea  in BTS page")
	public void user_is_in_try_editor_textarea_in_bts_page() {
	    //tree.Click_TextArea();
	   
	}
	@When("user send valid code and click run in BTS page")
	public void user_send_valid_code_and_click_run_in_bts_page() {
		tree=new TreePagePom(driver);
		tree.SendCode();
	    tree.Run();
	}
	@Given("user is on Implementation of BTS after navigating backs from textarea")
	public void user_is_on_implementation_of_bts_after_navigating_backs_from_textarea() {
	    tree.revertback();
	}
	@When("user click on practice questions page")
	public void user_click_on_practice_questions_page() {
	    tree.click_PracticeQuestions();
	    tree.revertback();
	}

	@Then("user should navigate to practice questions page")
	public void user_should_navigate_to_practice_questions_page() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		tree.quit();
	}




	
	


	
}