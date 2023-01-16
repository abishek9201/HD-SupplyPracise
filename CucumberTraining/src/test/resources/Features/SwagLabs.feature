Feature: Testing SwagLabs

  Scenario Outline: Validate login page
    Given Go to login page
    When enter id <userID> and Enter code <passcode>
    Then Verify user

    Examples: 
      | userID          | passcode       |
      | "standard_user" | "secret_sauce" |
      | "Abishek"       | "12345"        |
