
Feature: Home Page
Scenario: The user should redirected to Register page
Given The user opens Home Page
When User clicks Data Structure dropdown
Then It should see six different data structure entried in dropdown
When The user clicks any of the Get Started buttons below the data structures
Then It should alert the user with a message "You are not logged in"
When The user selects any data structures item from the drop down without Sign in
Then It should alert the user with a message "You are not logged in"here
When The user clicks Sign in
Then The user should be redirected to Sign in page
When The user clicks Register
Then The user should be redirected to Register form
