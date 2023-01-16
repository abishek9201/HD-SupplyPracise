Feature: Google Search Funtionality
	@SmokeTest
	Scenario: Validate Search functionality with valid data
		Given google is open
		When Text is entered
		And click on search
		Then Title check