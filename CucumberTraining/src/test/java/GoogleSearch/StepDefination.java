package GoogleSearch;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



public class StepDefination {
	WebDriver driver;
	@Given("google is open")
	public void google_is_open() {
		System.setProperty("webdriver.chrome.driver", "D:\\Lti\\Software\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
		
	}
	@When("Text is entered")
	public void text_is_entered() {
	    driver.findElement(By.name("q")).sendKeys("Testing");
	}
	@When("click on search")
	public void click_on_search() {
	    driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	}
	@Then("Title check")
	public void title_check() {
	   String s= driver.getTitle();
	   Assert.assertEquals(s,"Testing - Google Search");
	   driver.close();
	}



}
