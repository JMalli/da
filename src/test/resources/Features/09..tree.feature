
Feature:Testing tree module
  
  @TS_1
  Scenario:Validating "Dropdown" for tree page
    Given user is in home page after login
    When user choose tree form dropdown menu
    Then user redirected to tree home page
  @TS_2
  Scenario: Validating "Overview of Trees" page  
  	Given user is in tree page after selecting tree from dropdown
  	When user click on the Overview of trees link
  	And user redirected to the Overview page
 		Then user click on Try Here button  in overview page
 		
 @TS_3
  Scenario: Validating "TryEditor" textarea in overview page
  	Given user is in TryEditor textarea  of overview page
    When user send valid code and click run in overview page
    Then code should get execute and display out 
    When user send invalid code and click run
    Then should display error through alert.
 @TS_4
  Scenario: Moving to Validate "Terminologies" page
   	Given user is on Overview page after naviagting from overview texteditor
   	When user click on Terminologies link
   	And user navigated to "Termonologies" page
   	Then user click on Try Here button in Terminologies page
   
  @TS_5
  Scenario: Validating "Terminologies" textarea 
  	Given user is in Terminologies TryEditor textarea 
    When user send valid code and click run in terminologies page
    Then code should get execute and display out 
    When user send invalid code and click run
    Then should display error through alert 	
  @TS_6
  Scenario: Moving to Validate "Types of Trees" page
  	Given user is on terminologies page after navigating from terminologies text area
  	When user click on Types of Trees 
		And user navigated to Types of trees page
  	Then user click on Try Here button in Types of trees page
  @TS_7
  Scenario: Validating "Types of Tree" textarea 
  	Given user is in Types of trees page TryEditor textarea 
    When user send valid code and click run in types of tree page
    Then code should get execute and display out 
    When user send invalid code and click run
    Then should display error through alert 
  @TS_8  
  Scenario: Moving to Validate "Tree Traversals" page
  	Given user is on Types of trees page after navigating form types of tree text area
  	When user click on Tree Traverslas 
		And user navigated to Tree Traversals page
  	Then user click on Try Here button in tree traverals page
  @TS_9
  Scenario: Validating "Tree Traversals" textarea in tree traverals page
  	Given user is in  Tree traversals TryEditor textarea 
    When user send valid code and click run in tree traversals page
    Then code should get execute and display out 
    When user send invalid code and click run
    Then should display error through alert 
 @TS_10
  Scenario: Moving to Validate "Traversals-Illustration" page
  	Given user is on Tree Traversals page after navigating from tree traversals textarea
  	When user click on Traverslas-Illustration
		And user navigated to Traversals-Illustration page
  	Then user click on Try Here button in traversal illustration page
   	
  @TS_11
  Scenario: Validating "Traversals-Illustration" textarea in traversal illustration page
  	Given user is in Traversals Illustation TryEditor textarea 
    When user send valid code and click run in traversals Illustration
    Then code should get execute and display out 
    When user send invalid code and click run
    Then should display error through alert 
 @TS_12  
 Scenario: Moving to Validate "Binary Trees" page
  	Given user is on Traversals-Illustration page after navigating from textarea
  	When user click on Binary Trees 
		And user navigated to Binary Tress page
  	Then user click on Try Here button in binary tree page
   	
  @TS_13
  Scenario: Validating "Binary Trees" textarea in binary tree page
  	Given user is in  Binary Trees TryEditor textarea 
    When user send valid code and click run in binary tree
    Then code should get execute and display out 
    When user send invalid code and click run
    Then should display error through alert 
  @TS_14  
 Scenario: Moving to Validate "Types of Binary Trees" page
  	Given user is on Binary Trees page after navigating from textarea
  	When user click on Types of Binary Trees 
		And user navigated to Types of Binary Tress page
  	Then user click on Try Here button in types of binary tree page
   	
  @TS_15
  Scenario: Validating "Types of Binary Trees" textarea in types of binary tree page
  	Given user is in Types of binary Trees TryEditor textarea 
    When user send valid code and click run in types of binary tree
    Then code should get execute and display out 
    When user send invalid code and click run
    Then should display error through alert 
 @TS_16
 Scenario: Moving to Validate "Implimentation in Python" page
  	Given user is on Types of Binary Trees page after navigating from textarea
  	When user click on  Implimentation in Python
		And user navigated to Implimentation in Python page
  	Then user click on Try Here button in implimentation in python page
   	
  @TS_17
  Scenario: Validating "Implimentation in Python" textarea in implimentation in python page
  	Given user is in  implimentaion in python TryEditor textarea 
    When user send valid code and click run inimplimentation in python  
    Then code should get execute and display out 
    When user send invalid code and click run
    Then should display error through alert 
   @TS_18 
 Scenario: Moving to Validate "Binary Tree Traversals" page
  	Given user is on  Implimentaion in Python page after navigating from textarea
  	When user click on  Binary Tree Traversals
		And user navigated to Binary Tree Traversals page
  	Then user click on Try Here button in binary tree traversals page
   	
  @TS_19
  Scenario: Validating "Binary Tree Traversals" textarea in binary tree traversals page
  	Given user is in  binary tree traversals TryEditor textarea 
    When user send valid code and click run  in binary tree traversals
    Then code should get execute and display out 
    When user send invalid code and click run
    Then should display error through alert 
  @TS_20  
 Scenario: Moving to Validate "Implementation of Binary Trees" page
  	Given user is on Binary Tree Traversals page after navigating from textarea
  	When user click on  Implemenation of Binary Trees
		And user navigated to Implementation of Binary Trees page
  	Then user click on Try Here button in Implementation of Binary Trees page
   	
  @TS_21
  Scenario: Validating "Implementation of Binary Trees" textarea
  	Given user is in  Implimentation of binary trees TryEditor textarea 
    When user send valid code and click run in implementation of binary trees
    Then code should get execute and display out 
    When user send invalid code and click run
    Then should display error through alert 
 @TS_22   
 Scenario: Moving to Validate "Application of Binary Trees" page
  	Given user is on Implimenation of Binary Trees page after navigating form textarea
  	When user click on  Application of Binary Trees
		And user navigated to Application of Binary Trees page
  	Then user click on Try Here button in Application of Binary Trees page
   	
  @TS_23
  Scenario: Validating "Application of Binary Trees" textarea
  	Given user is in Application of Binary Trees TryEditor textarea 
    When user send valid code and click run in application of binary trees
    Then code should get execute and display out 
    When user send invalid code and click run
    Then should display error through alert 
  @TS_24  
 Scenario: Moving to Validate "Binary Search Trees" page
  	Given user is on  Application of Binary Trees page after navigating from textarea
  	When user click on  Binary Search Trees
		And user navigated to "Binary  Search Trees" page
  	Then user click on Try Here button in  Binary Search Trees
  
  @TS_25
  Scenario: Validating "Binary Search Trees" textarea
  	Given user is in Binary Search Trees TryEditor textarea 
    When user send valid code and click run  in binary search trees page
    Then code should get execute and display out 
    When user send invalid code and click run
    Then should display error through alert 
  @TS_26  
 Scenario: Moving to Validate "Implementation of BTS" page
  	Given user is on Binary Search Trees page after navigating form textarea
  	When user click on Implementation of BTS
		And user navigated to Implementation of BTS page
  	Then user click on Try Here button in Implementation of BTS page
   	
  @TS_27
  Scenario: Validating "Implementation of BTS" textarea
  	Given user is in TryEditor textarea  in BTS page
    When user send valid code and click run in BTS page 
    Then code should get execute and display out 
    When user send invalid code and click run
    Then should display error through alert 
  @TS_28  
 Scenario: Validating "Practice Question" page
 		Given user is on Implementation of BTS after navigating backs from textarea
 		When user click on practice questions page
 		Then user should navigate to practice questions page
 
  
  