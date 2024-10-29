Feature: Home page validation

  @Home_sucesslogin
  Scenario: Home page & Stack page validation using Get Started button
    Given The user enters home page
    When The user selects the Getting Started button in Stack Panel
    Then The user will be directed to "Stack" Page

  @Home_sucesslogin
  Scenario: Home page & Stack page validation using dropdown option
    Given The user enters home page
    When The user selects Stack option in the dropdown
    Then The user will be directed to "Stack" Page

  @Home_sucesslogin
  Scenario: Home page & Data Structure page validation using Get Started button
    Given The user enters home page
    When The user selects Getting Started button in Data Structures-Introduction panel
    Then The user will be directed to "Data Structures-Introduction" Page

  @Home_sucesslogin
  Scenario: Home page & Array page validation using Get Started button
    Given The user enters home page
    When The user selects the Getting Started button in Array Panel
    Then The user will be directed to "Array" Page

  @Home_sucesslogin
  Scenario: Home page & Array page validation using dropdown option
    Given The user enters home page
    When The user selects Array option in the dropdown
    Then The user will be directed to "Array" Page

  @Home_sucesslogin
  Scenario: Home page & Linked List page validation using Get Started button
    Given The user enters home page
    When The user selects the Getting Started button in Linked List Panel
    Then The user will be directed to "Linked List" Page

  @Home_sucesslogin
  Scenario: Home page & Linked List page validation using dropdown option
    Given The user enters home page
    When The user selects Linked List option in the dropdown
    Then The user will be directed to "Linked List" Page

  @Home_sucesslogin
  Scenario: Home page & Graph page validation using Get Started button
    Given The user enters home page
    When The user selects the Getting Started button in Graph Panel
    Then The user will be directed to "Graph" Page

  @Home_sucesslogin
  Scenario: Home page & Graph page validation using dropdown option
    Given The user enters home page
    When The user selects Graph option in the dropdown
    Then The user will be directed to "Graph" Page

  @Home_sucesslogin
  Scenario: Home page & Tree page validation using Get Started button
    Given The user enters home page
    When The user selects the Getting Started button in Tree Panel
    Then The user will be directed to "Tree" Page

  @Home_sucesslogin
  Scenario: Home page & Tree page validation using dropdown option
    Given The user enters home page
    When The user selects Tree option in the dropdown
    Then The user will be directed to "Tree" Page

  @Home_sucesslogin
  Scenario: Home page & Queue page validation using Get Started button
    Given The user enters home page
    When The user selects the Getting Started button in Queue Panel
    Then The user will be directed to "Queue" Page

  @Home_sucesslogin
  Scenario: Home page & Queue page validation using dropdown option
    Given The user enters home page
    When The user selects Queue option in the dropdown
    Then The user will be directed to "Queue" Page

  @Home_unsucesslogin
  Scenario: Home page & Queue page validation using Get Started button without login
    Given The user enters home page
    When The user selects the Getting Started button in Queue Panel
    Then The user will be get popup to login

  @Home_unsucesslogin
  Scenario: Home page & Queue page validation using dropdown option without login
    Given The user enters home page
    When The user selects Queue option in the dropdown
    Then The user will be get popup to login

  @Home_unsucesslogin
  Scenario: Home page & Data Structures-Introduction page validation using Get Started button without login
    Given The user enters home page
    When The user selects Getting Started button in Data Structures-Introduction panel
    Then The user will be get popup to login

  @Home_unsucesslogin
  Scenario: Home page & Array page validation using Get Started button without login
    Given The user enters home page
    When The user selects the Getting Started button in Array Panel
    Then The user will be get popup to login

  @Home_unsucesslogin
  Scenario: Home page & Array page validation using dropdown option without login
    Given The user enters home page
    When The user selects Array option in the dropdown
    Then The user will be get popup to login

  @Home_unsucesslogin
  Scenario: Home page & Linked List page validation using Get Started button without login
    Given The user enters home page
    When The user selects the Getting Started button in Linked List Panel
    Then The user will be get popup to login

  @Home_unsucesslogin
  Scenario: Home page & Linked List page validation using dropdown option without login
    Given The user enters home page
    When The user selects Linked List option in the dropdown
    Then The user will be get popup to login

  @Home_unsucesslogin
  Scenario: Home page & Tree page validation using Get Started button without login
    Given The user enters home page
    When The user selects the Getting Started button in Tree Panel
    Then The user will be get popup to login

  @Home_unsucesslogin
  Scenario: Home page & Tree page validation using dropdown option without login
    Given The user enters home page
    When The user selects Tree option in the dropdown
    Then The user will be get popup to login

  @Home_unsucesslogin
  Scenario: Home page & Stack page validation using Get Started button without login
    Given The user enters home page
    When The user selects the Getting Started button in Stack Panel
    Then The user will be get popup to login

  @Home_unsucesslogin
  Scenario: Home page & Stack page validation using dropdown option without login
    Given The user enters home page
    When The user selects Stack option in the dropdown
    Then The user will be get popup to login

  @Home_unsucesslogin
  Scenario: Home page & Graph page validation using Get Started button without login
    Given The user enters home page
    When The user selects the Getting Started button in Graph Panel
    Then The user will be get popup to login

  @Home_unsucesslogin
  Scenario: Home page & Graph validation using dropdown option without login
    Given The user enters home page
    When The user selects Graph option in the dropdown
    Then The user will be get popup to login

  @Home_sucesslogin
  Scenario: Home page Data structure drop down validation with login
    Given The user enters home page
    When The user clicks Data structure drop down at top
    Then The user will get six options

  @Home_unsucesslogin
  Scenario: Home page Data structure drop down validation without login
    Given The user enters home page
    When The user clicks Data structure drop down at top
    Then The user will get six options

  @Home_unsucesslogin
  Scenario: Home page Sign in link validation
    Given The user enters home page
    When The user clicks Sign in link
    Then The user will be directed to login page

  @Home_unsucesslogin
  Scenario: Home page Register link validation
    Given The user enters home page
    When The user clicks Register in link
    Then The user will be directed to register page

  @Home_sucesslogin
  Scenario: Home page Sign out link validation
    Given The user enters home page
    When The user clicks Sign out link
    Then The user will be get popup logged out
