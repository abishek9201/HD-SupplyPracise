Feature: Google Search Funtionality

	Scenario: Validate Search functionality with valid data
		Given google is open
		When Text is entered
		And click on search
		Then Title check