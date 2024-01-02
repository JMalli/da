Feature: Stack Page
@SS_1
Scenario: User entered valid login details on Login Page and logged in
 Given User is on sign in  Page of DSAlgo Portal
 When User entered valid Username as "Selenium2023" and Password as "Texas@2023"
 Then User is logged in successfully and directed to Home page of DsAlgo Portal
@SS_2
  Scenario: Moving to Validate "Operations in Stack" page
	Given user is on Stack page after navigating form getstarted
	When user click on Operations in Stack 
	And user navigated to Operations in Stack
	Then user click on Try Here button in Operations in Stack page
 	
@SS_3
Scenario: Validating "Operations in Stack" textarea
	Given user is in TryEditor textarea  in Operations in Stack page
  When user send valid code and click run in Operations in Stack page 
  Then code should get execute and display output 
  When user send invalid code and click run
  Then should display error through alert 
@SS_4
  Scenario: Moving to Validate "Implimentation" page
	Given user is on Implimentation page after navigating form getstarted
	When user click on Implimentation link in Stack 
	And user navigated to Implimentation in Stack
	Then user click on Try Here button in  Implimentation page
 	
@SS_5
 Scenario: Validating "Implimentation" textarea
	Given user is in TryEditor textarea  in Operations in Implimentation page
  When user send valid code and click run in Implimentation page 
  Then code should get execute and display output
  When user send invalid code and click run
  Then should display error through alert 
 @SS_6
  Scenario: Moving to Validate "Applications" page
	Given user is on Applications page after navigating form getstarted
	When user click on Applications link  in Stack 
	And user navigated to Applications in Stack
	Then user click on Try Here button in Applications page
 	
@SS_7
 Scenario: Validating "Applications" textarea
	Given user is in TryEditor textarea  in Applications page
  When user send valid code and click run in Applications page 
  Then code should get execute and display output
  When user send invalid code and click run
  Then should display error through alert 
@SS_6
Scenario: Validating "Practice Questions" page
		Given user is on Applications page after navigating backs from textarea
		When user click on practice questions page on stack page
		And user should navigate to practice questions page of stack
	  Then user movie back and quit browser
		