package stepDefinations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class HookSD {
	WebDriver driver;
	@Before
	public void setupBrowser() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		System.out.println("browser setup Completed");
	}
	@After(order=3)
	public void tearDown1() {
		System.out.println("Tear down web Application");
		driver.quit();
	}
	@After(order=0)
	public void tearDown2() {
		System.out.println("Tear down 2");
		
	}
	
	@Given("Browser is opened")
	public void browser_is_opened() {
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}

	@Given("verify page")
	public void verify_page() {
	    System.out.println(driver.getTitle());
	}

	@When("Enter valid name and password")
	public void enter_valid_name_and_password() {
		driver.findElement(By.name("username")).sendKeys("Admin");
	    driver.findElement(By.name("password")).sendKeys("admin123");
	}

	@When("Click button")
	public void click_button() {
	    driver.findElement(By.cssSelector("button[type='submit']")).click();
	}

	@Then("Verify details")
	public void verify_details() {
	String value=driver.findElement(By.cssSelector("h6[class='oxd-text oxd-text--h6 oxd-topbar-header-breadcrumb-module']")).getText();
	   System.out.println(value);
	}
	@When("Enter Invalid name and password")
	public void enter_invalid_name_and_password() {
		driver.findElement(By.name("username")).sendKeys("Abishek");
	    driver.findElement(By.name("password")).sendKeys("12345");
	}
	@BeforeStep
	public void beforeSteps() {
		System.out.println("before step");
	}
	@AfterStep
	public void afterSteps() {
		System.out.println("after step");
	}
	

}
