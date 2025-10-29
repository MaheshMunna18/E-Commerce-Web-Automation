Feature: Home Page Verification

  
  Scenario: User lands on Home Page and verifies key elements
    Given the user launches the browser and navigates to the Home Page
    Then the logo should be visible
    And the navigation bar should be present
    And the Register and Login link should be displayed
