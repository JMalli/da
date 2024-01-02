package stepDefinitions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import newalgoutilities.BaseClass;
import pom.GraphPagePom;
import pom.HomePagePom;
import pom.LoginPagePom;
import pom.QueuePom;
public class GraphPageSteps extends BaseClass {
	
	GraphPagePom graphpagepom;
	LoginPagePom loginpagepom;
	HomePagePom homepagepom;
	
	@Given("User is on Home Page")
	public void user_is_on_home_page() throws InterruptedException {
		
		
		 BaseClass.launchApp();
			
		    homepagepom=new HomePagePom(driver);
			homepagepom.Get_Started_Portal();	
			
			LoginPagePom loginpagepom=new LoginPagePom(driver);
	        loginpagepom.click_Signin();
	        loginpagepom.loginValidCredential(prop.getProperty("username"),prop.getProperty("password"));
	}
	@When("User clicks on dropdown and then select graph")
	public void user_clicks_on_dropdown_and_then_select_graph() {
		
		
		GraphPagePom graphpagepom=new GraphPagePom(driver);
		graphpagepom.dropdown();
		graphpagepom.DropdownGraph();
	  
	}
	@Then("User clicks on Graph from Topics covered and TryHere button")
	public void user_clicks_on_graph_from_topics_covered_and_try_here_button() {
		
		GraphPagePom graphpagepom=new GraphPagePom(driver);
		graphpagepom.TopicsGraph();
		graphpagepom.Tryhere();
		   
	}
	@Then("User send the python code, hit run button and revert back")
	public void user_send_the_python_code_hit_run_button_and_revert_back() {
		
		GraphPagePom graphpagepom=new GraphPagePom(driver);
		graphpagepom.Sendcode();
		graphpagepom.revertback();
		
	 
	}
	@Given("User is in Graph module")
	public void user_is_in_graph_module() {
		
		GraphPagePom graphpagepom=new GraphPagePom(driver);
	   
	}
	@When("User clicks graph representation button")
	public void user_clicks_graph_representation_button() {
		
		GraphPagePom graphpagepom=new GraphPagePom(driver);
		graphpagepom.Representation();
	   
	}
	@Then("User click on TryHere button")
	public void user_click_on_try_here_button() {
		
		GraphPagePom graphpagepom=new GraphPagePom(driver);
		graphpagepom.Tryhere();
	   
	}
	@Then("User send the python code, hit run button")
	public void user_send_the_python_code_hit_run_button() {
		
		GraphPagePom graphpagepom=new GraphPagePom(driver);
		graphpagepom.Sendcode();
		graphpagepom.quit();
	   
	}
}
