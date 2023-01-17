Feature: Checking hooks in cucumber

  Scenario: Checking login with valid credentials
    Given Browser is opened
    And verify page
    When Enter valid name and password
    And Click button
    Then Verify details

  Scenario: Checking login with Invalid credentials
    Given Browser is opened
    And verify page
    When Enter Invalid name and password
    And Click button
    Then Verify details
