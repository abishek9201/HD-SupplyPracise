package LoginFeature;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class StepDefination {
	WebDriver driver;
	@Given("Login page is open")
	
	
	public void login_page_is_open() {
		System.setProperty("webdriver.chrome.driver", "D:\\Lti\\Software\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.echotrak.com/Login.aspx?ReturnUrl=%2f");
	}
	@When("username is entered")
	public void username_is_entered() {
	    driver.findElement(By.id("txtCustomerID")).sendKeys("user1");
	}
	@When("Login button is clicked")
	public void login_button_is_clicked() {
	    driver.findElement(By.id("Butsub")).click();
	}
	@Then("error should be displayed enter password")
	public void error_should_be_displayed_enter_password() {
	    String s=driver.findElement(By.id("lblMsg")).getText();
	    Assert.assertEquals(s,"Enter Password");
	}
	



}
