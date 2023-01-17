Feature: Checking Background

  Background: 
    Given login page

  Scenario: verify valid data
    When Enter data
    Then button

  Scenario: verify Wrong data
    When Enter wrong data
    Then button
