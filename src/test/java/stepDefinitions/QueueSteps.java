package stepDefinitions;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import newalgoutilities.BaseClass;
import pom.HomePagePom;
import pom.LoginPagePom;
import pom.QueuePom;


public class QueueSteps extends BaseClass {
	
	QueueSteps queuesteps;
	LoginPagePom loginpagepom;
	HomePagePom homepagepom;


	
	
	@Given("User is in the DsAlgo Home Page")
	public void user_is_in_the_ds_algo_home_page() throws InterruptedException {
		
		 BaseClass.launchApp();
			
		    homepagepom=new HomePagePom(driver); 
			homepagepom.Get_Started_Portal();	
			
			LoginPagePom loginpagepom=new LoginPagePom(driver);
	        loginpagepom.click_Signin();
	        loginpagepom.loginValidCredential(prop.getProperty("username"),prop.getProperty("password"));
		
		


	}
	@When("User clicks on Get Started Queue button enters in Module")
	public void user_clicks_on_get_started_queue_button_enters_in_module() {
		
		QueuePom queuepom=new QueuePom(driver);
		queuepom.dropdown();
		queuepom.ClickQueue();


	}


	@Then("User clicks on Implimentation and then TryHere button")
	public void user_clicks_on_implimentation_and_then_try_here_button() {
		
		QueuePom queuepom=new QueuePom(driver);
		queuepom.ImplementationOfQueue();
		queuepom.Tryhere();


	    
	}


	@Then("User type in python code and hit run button")
	public void user_type_in_python_code_and_hit_run_button() {
		
		QueuePom queuepom=new QueuePom(driver);
		queuepom.Sendcode();
	    
	}


	@Then("User navigates to back")
	public void user_navigates_to_back() {
		
		QueuePom queuepom=new QueuePom(driver);
		queuepom.revertback();


	    
	}


	@Given("User is in the queue page")
	public void user_is_in_the_queue_page() {


	    
	}
	
	@When("User clicks on Implimentation using collections and then TryHere button")
	public void user_clicks_on_implimentation_using_collections_and_then_try_here_button() {
		
		QueuePom queuepom=new QueuePom(driver);
		queuepom.ImplimentationUsingCollections();
		queuepom.Tryhere();


	    
	}
	


    @Then("User type in python code and after that hit run button")
     public void user_type_in_python_code_and_after_that_hit_run_button() {
    	
		QueuePom queuepom=new QueuePom(driver);
		queuepom.Sendcode();
		queuepom.revertback();


   
    }




	@Given("User is inside queue module")
	public void user_is_inside_queue_module() {
	}


	@When("User clisks on implimentation using array and then TryHerebutton")
	public void user_clisks_on_implimentation_using_array_and_then_try_herebutton() {
		
		QueuePom queuepom=new QueuePom(driver);
		queuepom.ImplimentationUsingArray();
		queuepom.Tryhere();
    
	}


	@Then("User type in python code and then hit run button")
	public void user_type_in_python_code_and_then_hit_run_button() {
		
		QueuePom queuepom=new QueuePom(driver);
		queuepom.Sendcode();


	}


	@Then("User navigates to the back")
	public void user_navigates_to_the_back() {
		
		QueuePom queuepom=new QueuePom(driver);
		queuepom.revertback();




	}


	
	@Given("User is inside module")
	public void user_is_inside_module() {
	    


	}


	@When("User clicks on Queue operations and TryHere")
	public void user_clicks_on_queue_operations_and_try_here() {
		
		QueuePom queuepom=new QueuePom(driver);
		queuepom.QueueOperations();
		queuepom.Tryhere();
	}


	@Then("User type in python code, then hit run button")
	public void user_type_in_python_code_then_hit_run_button() {
		
		QueuePom queuepom=new QueuePom(driver);
		queuepom.Sendcode();
		queuepom.quit();
		
	}


}
