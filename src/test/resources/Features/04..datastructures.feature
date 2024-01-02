Feature: Data Structure Introduction Page
@DS_1
Scenario: User entered valid login details on Login Page and logged in
 Given User is on sign in  Page of DSAlgo Portal
 When User entered valid Username as "Selenium2023" and Password as "Texas@2023"
 Then User is logged in successfully and directed to Home page of DsAlgo Portal
@DS_2
  Scenario: Moving to Validate "Time Complexity" page
	Given user is on Data Structure page after navigating form getstarted
	When user click on Time Complexity
	And user navigated to Time Complexity
	Then user click on Try Here button in Time Complexity page
 	
@DS_3
Scenario: Validating "Time Complexity" textarea
	Given user is in TryEditor textarea  in Time Complexity page
  When user send valid code and click run in Time Complexity page 
  Then code should get execute and display out 
  When user send invalid code and click run
  Then should display error through alert 
@DS_4
Scenario: Validating "Practice Question" page of datastructure
		Given user is on Time Complexity after navigating backs from textarea
		When user click on practice questions page on datastructures page
		And user should navigate to practice questions page
	  Then user movie back and quit browser
		