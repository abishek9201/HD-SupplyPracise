package stepDefinations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import pagefactory.SwagLabsPF;

public class SwagSD {
	WebDriver driver;
	SwagLabsPF SL;
	@Given("Go to login page")
	public void go_to_login_page() {
		WebDriverManager.chromedriver().setup();
	    driver=new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.manage().window().maximize();
	    driver.navigate().to("https://www.saucedemo.com/");
	}

	@When("enter id {string} and Enter code {string}")
	public void enter_id_and_enter_code(String username, String password) {
		SL = new SwagLabsPF(driver);
		SL.sendId(username);
		SL.sendCode(password);
	    
	}

	@Then("Verify user")
	public void verify_user() {
		SL.clickLogin();
		Assert.assertEquals(SL.verify(), "PRODUCTS");
		driver.quit();
	    
	}

}
