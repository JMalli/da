Feature: feature to test navigation for Array
Scenario: validate login
	Given The user is in homepage
	When the user gives proper loginid, password
	Then the user is logged in

Scenario: Validate getting started is working
		When user clicks on Get Started button
		Then user be directed to Array Data Structure page
		
Scenario: Validate arrays in python page is working
		When The user clicks Arrays in Python button
		Then The user should be redirected to Arrays in Python page
		
Scenario: Validate "tryEditor with a Run button to test" is working
		When The user is in the Arrays in Python page after logged in
		And The user clicks "Try Here" button in Arrays in Python page
		Then The user should be redirected to a page having an tryEditor with a Run button on arrays to test
		
Scenario: Validate "Arrays using List" is working
		When The user clicks "Arrays using List" button
	Then The user should be redirected to "Arrays using List" page
	
Scenario: Validate "Arrays using List try Editor" is working
		When The user is in the Arrays using List page after logged in
		And The user clicks "Try Here" button in Arrays using List page
		Then The user should be redirected to a arrays page having an tryEditor with a Run button to test
		
Scenario: Validate "Basic Operations in List" page is working
		When The user clicks "Basic Operations in List" button
		Then The user should be redirected to "Basic Operations in List" page
		
Scenario: Validate "Basic Operations in List Try Here" is working
	When The user clicks "Try Here" button in Arrays using List page
	Then The user should be redirected to a Basic operations page having an tryEditor with a Run button to test
	
Scenario: Validate "Applications of Array" page is working
		When The user clicks "Applications of Array" button
		Then The user should be redirected to "Applications of Array" page
Scenario: Validate "tryEditor in Applications of Arrays page" is working
	When The user clicks "Try Here" button in Applications of Arrays page
	Then The user should be redirected to a applications arrays page having an tryEditor with a Run button to test
	
Scenario: Validating "Practice Questions" page in Array.
	When User clicks on Practice questions link in aray page.
	Then user should see four different questions.
	
Scenario: Validating prcatice question 1
	When user click on Search the array link
	Then 	user should be in question 1 page
	And user send the solution code to textarea in Search the array
	Then user click on run and user should see output in Search the array
	Then user click submit user should see submition sucessful in Search the array
	
Scenario: Validating prcatice question 2
	When user click on Max Consecutive ones
	Then 	user should be in question 2 page
	And user send the solution code to textarea in Max Consecutive ones
	Then user click on run and user should see output in Max Consecutive ones
	Then user click submit user should see submition sucessful in Max Consecutive ones
	
Scenario: Validating prcatice question 3
	When user click on Find Numbers with Even Number of Digits
	Then 	user should be in question 3 page
	And user send the solution code to textarea in Find Numbers with Even Number of Digits
	Then user click on run and user should see output in Find Numbers with Even Number of Digits
	Then user click submit user should see submition sucessful in Find Numbers with Even Number of Digits
	
Scenario: Validating prcatice question 4
	When user click on Squares of a sorted Array
	Then 	user should be in question 4 page
	And user send the solution code to textarea in Squares of a sorted Array
	Then user click on run and user should see output in Squares of a sorted Array
	Then user click submit user should see submition sucessful in Squares of a sorted Array


	