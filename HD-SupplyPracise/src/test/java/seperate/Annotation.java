package seperate;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class Annotation {
	WebDriver driver;

	@Test(priority=2)
	public void firstMethod() {
		driver.navigate().to("https://www.google.com/");
		System.out.println(driver.getTitle());
		System.out.println("In Method 1");
	}
	@Test(priority=1,dataProvider="testdata",dependsOnMethods="firstMethod")
	public void testLogin(String name,String password) {
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(name);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		String val=driver.findElement(By.xpath("//p[@class='oxd-text oxd-text--p'][text()='Quick Launch']")).getText();
		System.out.println(val);
		System.out.println("In Method 2");
	}

	@BeforeMethod
	public void beforeMethod() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		System.out.println("Before Method");
	}

	@AfterMethod
	public void afterMethod() {
		driver.quit();
		System.out.println("After Method");
	}

	@BeforeClass
	public void beforeClass() {
		System.out.println("Class started");
	}

	@AfterClass
	public void afterClass() {
		System.out.println("Class Endeded");
	}

	@BeforeTest
	public void beforeTest() {
		System.out.println("Test Started");
	}

	@AfterTest
	public void afterTest() {
		System.out.println("Test Endeded");
	}

	@BeforeSuite
	public void beforeSuite() {
		System.out.println("Suite Started");
	}

	@AfterSuite
	public void afterSuite() {
		System.out.println("Suite Endeded");
	}
	@DataProvider(name="testdata")
	public Object[][] TestData(){
	Object [][] sampledata=new Object[3][2];
	sampledata[0][0]="Admin";
	sampledata[0][1]="admin123";
	sampledata[1][0]="admin";
	sampledata[1][1]="admin123";
	sampledata[2][0]="Admin";
	sampledata[2][1]="admin";
	return sampledata;
	}
	
	

}
