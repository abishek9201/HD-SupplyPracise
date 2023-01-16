//package stepDefinations;
//
//import static org.testng.Assert.assertEquals;
//
//import java.util.concurrent.TimeUnit;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.Assert;
//
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//import io.github.bonigarcia.wdm.WebDriverManager;
//import pages.LoginPage;
//
//
//public  class ParametersSDPOM{
//	WebDriver driver;
//	LoginPage lp;
//	@Given("Naviagte to login page")
//	public void naviagte_to_login_page() {
//		WebDriverManager.chromedriver().setup();
//		driver=new ChromeDriver();
//		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//		driver.manage().window().maximize();
//		driver.navigate().to("https://example.testproject.io/web/");
//	   
//	}
//
//	@Given("Validate login page")
//	public void validate_login_page() {
//	    String title=driver.getTitle();
//	    Assert.assertEquals(title, "TestProject Demo","Invalid Page");
//	}
//
//	@When("Enter {string} and {string}")
//	public void enter_and(String string, String string2)  {
//		lp=new LoginPage(driver);
//		lp.enterUsername(string);
//		lp.enterPassword(string2);
//	}
//	@When("Click on login Bar")
//	public void Click_on_login_Bar() {
//		lp.clickLogin();
//	}
//
//	@Then("Validate user")
//	public void validate_user() throws InterruptedException {
//	   lp.clickLogout();
//	   Thread.sleep(1000);
//	   driver.quit();
//	}
//}
//
//
//
