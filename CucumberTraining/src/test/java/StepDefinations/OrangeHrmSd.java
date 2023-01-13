package StepDefinations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class OrangeHrmSd {
	WebDriver driver;
	@Given("Navigate to Login page")
	public void navigate_to_login_page()  {
	    WebDriverManager.chromedriver().setup();
	    driver=new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.manage().window().maximize();
	    driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}

	@Given("Check page title")
	public void check_page_title() {
	   String title=driver.getTitle();
	   Assert.assertEquals(title,"OrangeHRM","Title mismatched");
	}

	@When("Enter id and password")
	public void enter_id_and_password() {
	   driver.findElement(By.name("username")).sendKeys("Admin");
	   driver.findElement(By.name("password")).sendKeys("admin123");
	}

	@Then("Click on login button")
	public void click_on_login_button() {
	    driver.findElement(By.xpath("//button[@class=\"oxd-button oxd-button--medium oxd-button--main orangehrm-login-button\"]")).click();
	    
	}


	@When("Enter id and In correct password")
	public void enter_id_and_in_correct_password() {
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin");
	}

	@Then("Error message should be displayed")
	public void error_message_should_be_displayed() {
	  WebElement errmsg= driver.findElement(By.xpath("//p[@class=\"oxd-text oxd-text--p oxd-alert-content-text\"]"));
	  System.out.println(errmsg.getText());
	  Assert.assertEquals(errmsg.getText(),"Invalid credentials");
	  driver.quit();
	} 
	
}
