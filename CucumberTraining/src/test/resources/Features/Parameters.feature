Feature: Login Parameters

  Scenario Outline: Checking the login
    Given Naviagte to login page
    And Validate login page
    When Enter <Username> and <Password>
    And Click on login button
    Then Validate user

    Examples: 
      | Username    | Password |
      | "Abishek"   | "12345"  |
      | "Ganesh"    | "12345"  |
      | "Chaitanya" | "12345"  |
