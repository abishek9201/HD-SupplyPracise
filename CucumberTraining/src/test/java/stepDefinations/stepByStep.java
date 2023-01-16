package stepDefinations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class stepByStep {
WebDriver driver;
	@Given("Browser is open")
	public void browser_is_open() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	    driver.navigate().to("https://www.google.com/");
	}

	@Given("User is on google search page")
	public void user_is_on_google_search_page() {
	  String title=  driver.getTitle();
	  System.out.println(title);
	  Assert.assertEquals(title, "Google","Title mismatched");
	}

	@When("User enters text in search box")
	public void user_enters_text_in_search_box() {
	    driver.findElement(By.name("q")).sendKeys("Automation step by step");
	}

	@When("click enter")
	public void click_enter() {
		 driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	}

	@Then("user navigated to search result")
	public void user_navigated_to_search_result() {
	    String auto=driver.getTitle();
	    System.out.println(auto);
		Assert.assertEquals(auto, "Automation step by step - Google Search","Page Title mismatched");
		driver.close();
	}


}
