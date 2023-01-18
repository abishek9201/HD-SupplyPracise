package backgroundSteps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BackgroundSD {
	WebDriver driver;
	@Before
	public void openBrowser() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		System.out.println("browser setup Completed");
	}
	@After
	public void closeBrowser() {
		System.out.println("Tear down web Application");
		driver.quit();
	}
	@Given("login page")
	public void login_page() {
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}

	@When("Enter data")
	public void enter_data() {
		driver.findElement(By.name("username")).sendKeys("Admin");
	    driver.findElement(By.name("password")).sendKeys("admin123");
	}

	@Then("button")
	public void button() {
		driver.findElement(By.cssSelector("button[type='submit']")).click();
	}

	@When("Enter wrong data")
	public void enter_wrong_data() {
		driver.findElement(By.name("username")).sendKeys("Abishek");
	    driver.findElement(By.name("password")).sendKeys("12345");
	}

}
