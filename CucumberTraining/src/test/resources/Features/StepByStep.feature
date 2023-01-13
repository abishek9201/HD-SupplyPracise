Feature: To Check Automation Step by Step Website

  Scenario: Validate Google search button working fine
    Given Browser is open
    And User is on google search page
    When User enters text in search box
    And click enter
    Then user navigated to search result
