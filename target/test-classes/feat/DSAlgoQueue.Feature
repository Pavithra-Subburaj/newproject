@queue
Feature: Queue page validation

  Background: 
    Given The user is in home page after successful login

  @queue
  Scenario: Queue page validation using Get Started button
    When The user clicks the Getting Started button in Queue Panel
    Then The user should be directed to Queue Page

  @queue
  Scenario Outline: Queue page validation link land in correct page
    Given The user is in the Queue page after logged in
    When The user clicks <link name> Link
    Then The user should be directed to  <link name> page

    Examples: 
      | link name                                |
      | "Implementation of Queue in Python"      |
      | "Implementation using collections.deque" |
      | "Implementation using array"             |
      | "Queue Operations"                       |

  @queue
  Scenario Outline: Queue page validation link land in correct page
    Given The user is in the Queue page after logged in
    When The user clicks <link name> Link
    And The user clicks "Practice Questions" Link
    Then The Practice question page should be displayed

    Examples: 
      | link name                                |
      | "Implementation of Queue in Python"      |
      | "Implementation using collections.deque" |
      | "Implementation using array"             |
      | "Queue Operations"                       |

  @queue
  Scenario Outline: Try here button validation
    Given The user is in the Queue page after logged in
    And The user clicks <link name> Link
    When The user clicks  Try here button
    Then The user is redirect to tryEditor page

    Examples: 
      | link name                                |
      | "Implementation of Queue in Python"      |
      | "Implementation using collections.deque" |
      | "Implementation using array"             |
      | "Queue Operations"                       |

  Scenario Outline: Operations in stack Try Editor validation----Implementation of Queue in Python
    Given The user is in the Queue page after logged in
    And The user clicks "Implementation of Queue in Python" Link
    When The user clicks  Try here button
    When The user enter valid python code print sheetname "<SheetName>" and rownumber <RowNumber>
    And The user clicks run button valid scenario
    Then User is able to see the output in console sheetname "<SheetName>" and rownumber <RowNumber>

    Examples: 
      |SheetName | RowNumber  |
      | Python    |         0 |           
      | Python    |         1 |           
      | Python    |         2 |           

      Scenario Outline: Operations in stack Try Editor validation----Implementation using collections.deque
    Given The user is in the Queue page after logged in
    And The user clicks "Implementation using collections.deque" Link
    When The user clicks  Try here button
    When The user enter valid python code print sheetname "<SheetName>" and rownumber <RowNumber>
    And The user clicks run button valid scenario
    Then User is able to see the output in console sheetname "<SheetName>" and rownumber <RowNumber>

    Examples: 
      |SheetName | RowNumber  |
      | Python    |         0 |           
      | Python    |         1 |           
      | Python    |         2 |   
      
        Scenario Outline: Operations in stack Try Editor validation----Implementation using array
    Given The user is in the Queue page after logged in
    And The user clicks "Implementation using array" Link
    When The user clicks  Try here button
    When The user enter valid python code print sheetname "<SheetName>" and rownumber <RowNumber>
    And The user clicks run button valid scenario
    Then User is able to see the output in console sheetname "<SheetName>" and rownumber <RowNumber>

    Examples: 
      |SheetName | RowNumber  |
      | Python    |         0 |           
      | Python    |         1 |           
      | Python    |         2 |   
      
        Scenario Outline: Operations in stack Try Editor validation----Queue Operations
    Given The user is in the Queue page after logged in
    And The user clicks "Queue Operations" Link
    When The user clicks  Try here button
    When The user enter valid python code print sheetname "<SheetName>" and rownumber <RowNumber>
    And The user clicks run button valid scenario
    Then User is able to see the output in console sheetname "<SheetName>" and rownumber <RowNumber>

    Examples: 
      |SheetName | RowNumber  |
      | Python    |         0 |           
      | Python    |         1 |           
      | Python    |         2 |     
      
      
      
      
      