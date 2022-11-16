package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import actionsClass.BaseClass2;

public class ValidateLinksCricbuzz extends BaseClass2 {
	
	
	WebDriver driver;
	//CricBuzzPage cbp=new CricBuzzPage(driver);
	//DriverBase dp=new DriverBase(driver);
	
//	@BeforeTest
//	public void brforetest() {
//	
//	}
	@Test
	public void testOne() {
		
		System.out.println("test1");
		driver.findElement(By.name("q")).sendKeys("HI");
		driver.findElement(By.cssSelector("input[value='Google Search']")).click();
	}
//	@AfterTest
//	public void aftertest() {
//		
//		System.out.println("Done");
//		System.out.println(driver);
//		driver.close();
//	}

}
