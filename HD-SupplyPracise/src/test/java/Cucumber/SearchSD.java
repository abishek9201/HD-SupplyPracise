package Cucumber;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchSD {
	@Given("I have a Search Field on Amazon Page")
	public void i_have_a_search_field_on_amazon_page() {
		System.out.println("Step 1: I am on the Search Page");
	}

	@When("I Search for a Product with name {string}  and price {int}")
	public void i_search_for_a_product_with_name_and_price(String productName, Integer Price) {
		System.out.println("Step 2: Search the Product with name"+productName+" Price:"+Price);
	}

	@Then("Product with name {string} should be displayed")
	public void product_with_name_should_be_displayed(String productName) {
		System.out.println("Step 3: Product "+productName+" got Displayed");
		
	}
}
