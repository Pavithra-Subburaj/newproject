Feature: Stack page validation

 @test
  Scenario: Stack page validation using Get Started button
    Given The user is in home page with successful login
    When The user clicks the Getting Started button in Stack Panel
    Then The user should be directed to "Stack" Page
@test
  Scenario: Stack page validation using stack dropdown option
    Given The user is in home page with successful login
    When The user clicks Stack option in the dropdown
    Then The user should be directed to "Stack" Page
@test
  Scenario: Operations in stack link validation
    Given The user clicks Stack option in the dropdown
    When The user clicks Operations in stack link
    Then The user should be directed to operations in stack page "Operations in Stack"
@test
  Scenario: Operations in stack Try here button validation
    Given The user clicks Stack option in the dropdown
    And The user clicks Operations in stack link
    When The user clicks on Try here button
    Then The user redirect to tryEditor page
@test
  Scenario Outline: Operations in stack Try Editor validation
    Given The user clicks Stack option in the dropdown
    And The user clicks Operations in stack link
    And The user clicks on Try here button
    When The user enter valid python code to print in excel sheetname "<SheetName>" and rownumber <RowNumber>
    And The user clicks run button scenario 
    Then User is able to see the output sheetname "<SheetName>" and rownumber <RowNumber>
     Examples: 
      | SheetName | RowNumber |
      | Python    |         0 |
      | Python    |         1 |
      | Python    |         2 |
    

@test
  Scenario: Implementation link validation
    Given The user clicks Stack option in the dropdown
    When The user clicks Implementation link
    Then The user should be directed to implementation page "Implementation"
@test
  Scenario: Implementation Try here button validation
    Given The user clicks Stack option in the dropdown
    And The user clicks Implementation link
    When The user clicks on Try here button
    Then The user redirect to tryEditor page
@test
  Scenario: Implementation Try Editor validation
    Given The user clicks Stack option in the dropdown
    And The user clicks Implementation link
    And The user clicks on Try here button
    When The user enter valid python code to print in excel sheetname "<SheetName>" and rownumber <RowNumber>
    And The user clicks run button scenario 
    Then User is able to see the output sheetname "<SheetName>" and rownumber <RowNumber>

     Examples: 
      | SheetName | RowNumber |
      | Python    |         0 |
      | Python    |         1 |
      | Python    |         2 |

@test
  Scenario: Applications link validation
    Given The user clicks Stack option in the dropdown
    When The user clicks Applications link
    Then The user should be directed to Applications page "Applications"
@test
  Scenario: Applications Try here button validation
    Given The user clicks Stack option in the dropdown
    And The user clicks Applications link
    When The user clicks on Try here button
    Then The user redirect to tryEditor page
@test
  Scenario: Applications Try Editor validat
    Given The user clicks Stack option in the dropdown
    And The user clicks Applications link
    And The user clicks on Try here button
     When The user enter valid python code to print in excel sheetname "<SheetName>" and rownumber <RowNumber>
    And The user clicks run button scenario 
    Then User is able to see the output sheetname "<SheetName>" and rownumber <RowNumber>
     Examples: 
      | SheetName | RowNumber |
      | Python    |         0 |
      | Python    |         1 |
      | Python    |         2 |
      
@test
  Scenario: Practice Questions link validation
    Given The user clicks Stack option in the dropdown
    And The user clicks Applications link
    When The user clicks Practice Questions link
    Then The user should redirect to Practice Questions page
