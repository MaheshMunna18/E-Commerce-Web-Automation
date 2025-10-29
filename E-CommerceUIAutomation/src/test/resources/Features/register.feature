Feature: User Registration Flow

  
  Scenario Outline: User registers successfully with valid details
    Given the user launches the browser and navigates to the Home Page
    Then the Register link should be visible on the Home Page
    When the user clicks on the Register link
    Then the Register Page should be displayed
    When the user selects gender as "<gender>"
    And the user enters first name "<firstName>"
    And the user enters last name "<lastName>"
    And the user enters email "<email>"
    And the user enters password "<password>"
    And the user enters confirm password "<confirmPassword>"
    And the user clicks the Register button
    Then the registration should be completed successfully

    Examples: 
      | gender | firstName | lastName | email              | password | confirmPassword |
      | male   | Robert    | Brown    | robert@example.com | Rob@456  | Rob@456         |
