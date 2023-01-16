package stepDefinations;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;


public  class ParametersSD{
	WebDriver driver;
	@Given("Naviagte to login page")
	public void naviagte_to_login_page() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.navigate().to("https://example.testproject.io/web/");
	   
	}

	@Given("Validate login page")
	public void validate_login_page() {
	    String title=driver.getTitle();
	    Assert.assertEquals(title, "gfdbd","Invalid Page");
	}

	@When("Enter {string} and {int}")
	public void enter_and(String string, String int1) {
	    driver.findElement(By.id("name")).sendKeys(string);
	    driver.findElement(By.id("password")).sendKeys(int1);
	}
	@When("Click on login button")
	public void Click_on_login_button() {
		driver.findElement(By.id("login")).click();
	}

	@Then("Validate user")
	public void validate_user() {
	   String val=driver.findElement(By.id("pageProfile")).getText();
	   Assert.assertEquals(val,"TestProject Example page","Invalid user Login");
	}
}



