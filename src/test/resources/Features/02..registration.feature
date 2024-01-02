
Feature: Registration page
Scenario: User should be able to register
Given User is on Registration page
When User enters "Username","Password" and "ConfPassword"
Then User click on Register button and then signin button
Then User should be able to Register successfuly and navigate to login
