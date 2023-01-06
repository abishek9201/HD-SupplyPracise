package reportsTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GenerateExtentReport {
	ExtentReports extent=new ExtentReports();
	ExtentSparkReporter spark=new ExtentSparkReporter("target/spark.html");
	WebDriver driver;
	@BeforeTest
	public void beforeTest() {
		spark.config().setTheme(Theme.DARK);
		spark.config().setReportName("My Report");
		extent.attachReporter(spark);
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.navigate().to("https://practicetestautomation.com/practice-test-login/");
	}
	@AfterTest
	public void teardown() {
		extent.flush();
		driver.quit();
	}
	@Test
	public void StudentLogin() {
		ExtentTest test=extent.createTest("verify student login").assignAuthor("Abishek").assignCategory("functional test cases").assignDevice("windows");
		driver.findElement(By.name("username")).sendKeys("student");
		driver.findElement(By.name("password")).sendKeys("Password123");
		driver.findElement(By.id("submit")).click();
		test.info("I am verifing student login");
		String name=driver.getTitle();
		test.info("student login as : "+name);
		//Assert.assertEquals("Logged In Successfully | Practice Test Automation", name);
		if(name.equals("Logged In Successfully | Practice Test Automation")) {
			test.pass("student login verified : page title "+name);
		}
		else {
			test.fail("student login failed :page title"+name);
		}
	}
	

}
