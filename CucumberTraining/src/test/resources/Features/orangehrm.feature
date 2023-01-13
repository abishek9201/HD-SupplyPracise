Feature: Checking login in Orange Hrm Page

  Scenario: Validate login with valid Credentials
    Given Navigate to Login page
    And Check page title
    When Enter id and password 
    Then Click on login button
    
  Scenario: Validate login with Invalid Credentials
    Given Navigate to Login page 
    And Check page title
    When Enter id and In correct password
    And Click on login button
    Then Error message should be displayed
