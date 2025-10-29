Feature: User Login Functionality

  @Smoketest
  Scenario Outline: User logs in with valid credentials
    Given the user launches the browser and navigates to the Home Page
    Then the Login link should be visible on the Home Page
    When the user clicks on the Login link and navigates to the Login Page
    Then the Login Page should be displayed with the Sign In section
    When the user enters email as "<email>" and password as "<password>"
    And clicks on the Login button
    Then user verifies Logout link and user email should be visible on the Home Page

    Examples: 
      | email              | password |
      | mikegill@email.com | Test@123 |
