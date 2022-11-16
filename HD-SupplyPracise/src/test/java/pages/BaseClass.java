package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	WebDriver driver;
	
	@BeforeClass
	public void startApplication()
	{
		
		Reporter.log("=====Browser Session Started=====", true);
		WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.qafox.com/selenium/selenium-practice/");
		
		Reporter.log("=====Application Started=====", true);
	}
	@AfterClass
	public void closeApplication()
	{
		driver.quit();
		Reporter.log("=====Browser Session End=====", true);
		
	}
}
