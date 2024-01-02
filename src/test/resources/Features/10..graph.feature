Feature: To test Graph Module
@G_1
Scenario: To validate Graph module
Given User is on Home Page
When User clicks on dropdown and then select graph
Then User clicks on Graph from Topics covered and TryHere button
Then User send the python code, hit run button and revert back
@G_2
Scenario:To validate Graph Representation
Given User is in Graph module
When User clicks graph representation button
Then User click on TryHere button
Then User send the python code, hit run button


