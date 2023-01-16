Feature: verify hyr page

  Scenario Outline: Verify Basic Controls
    Given Navigate to Url
    When Enter  firstname <firstName>
    And Enter lastname <lastName>
    And Click Gender
    And Click Language
    And Enter Gmail <mailId>
    And Enter password <password>
    Then Click Register

    Examples: 
      | firstName | lastName | mailId                 | password |
      | "Abishek" | 'K'      | "Abishek@gmail.com"    | "12345"  |
      | "Shiva"   | "Ganesh" | "sivaGanesh@gmail.com" | "678910" |
