Feature: MainPage

	@main
  Scenario: Test Successful GetStarted page Launch
   
    When The user should be in GetStarted page
    Then The user should landed on the page there should be a message "You are at the right place"
    
  @main  
   Scenario: Testing Successful Home page launch 
   
    When The user clicks the get started button
    Then The user should land in Home Page with "Register" and "Sign in" links
   
