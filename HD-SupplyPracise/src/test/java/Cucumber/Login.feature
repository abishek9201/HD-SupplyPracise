Feature: Login functionality

	Scenario: validate Login without entering password
		Given Login page is open
		When username is entered
		And Login button is clicked
		Then error should be displayed enter password

