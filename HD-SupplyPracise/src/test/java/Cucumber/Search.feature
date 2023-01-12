Feature: Amazon Search

	Scenario: Search a Product                                                   
  Given I have a Search Field on Amazon Page                                
  When I Search for a Product with name "Apple MacBook Pro"  and price 10000 
  Then Product with name "Apple MacBook Pro" should be displayed 