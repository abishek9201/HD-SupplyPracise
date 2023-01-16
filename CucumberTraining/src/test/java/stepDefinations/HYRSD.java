package stepDefinations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import pages.HyrPage;

public class HYRSD {
	WebDriver driver;
	HyrPage hyr;
	@Given("Navigate to Url")
	public void navigate_to_url() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		hyr=new HyrPage(driver);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.navigate().to("https://www.hyrtutorials.com/p/basic-controls.html");
		hyr.scroll();    
	}

	@When("Enter  firstname {string}")
	public void enter_firstname(String string) {
	    hyr.enterFirstname(string);
	}

	@When("Enter lastname {string}")
	public void enter_lastname(String string) {
	    hyr.enterLastname(string);
	}

	@When("Enter Gmail {string}")
	public void enter_gmail(String string) {
	   hyr.enterEmail(string);
	}

	@When("Enter password {string}")
	public void enter_password(String string) {
	    hyr.enterPassword(string);
	}

	@When("Click Gender")
	public void click_gender() {
	    hyr.selectGender();
	}

	@When("Click Language")
	public void click_language() {
	    hyr.selectEnglish();
	}

	@Then("Click Register")
	public void click_register() throws InterruptedException {
		hyr.scroll();
		Thread.sleep(1000);
	    hyr.Register();
	    driver.quit();
	}
}
