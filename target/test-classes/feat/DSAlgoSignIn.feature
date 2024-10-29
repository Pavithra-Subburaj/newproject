Feature: Signin validation

@validCredentials
  Scenario Outline: login with valid credential
    Given User is on signin page url 
    When User enters valid username "<username>" into username field
    And User enters valid password "<password>" into password field
    And User clicks on Login button
    Then The user should successfully land in Data Structure Home Page 
 
 
    Examples: 
      | username | password  |
      | ninja4   | Tiger123@ |
   
