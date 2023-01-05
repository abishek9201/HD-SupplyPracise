package seperate;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Newjs {
	WebDriver driver;
	JavascriptExecutor js;
	@BeforeTest
	public void beforeTest() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.navigate().to("https://www.hyrtutorials.com/p/basic-controls.html");
		js=(JavascriptExecutor)driver;
		
	}
	@AfterTest
	public void afterTest() {
		//driver.quit();	
	}
	@Test(priority=1)
	public void scroll() {
		WebElement fname=driver.findElement(By.name("fName"));
		js.executeScript("arguments[0].scrollIntoView();",fname);
		js.executeScript("window.scrollTo(0,100);");
		js.executeScript("window.scrollBy(0,100);");
		
	}
	@Test
	public void Elements() {
		js.executeScript("document.getElementsByName('fName')[0].value='Abishek';");
		js.executeScript("document.getElementById('lastName').value=\"vardhan\";");
		
	}
	@Test
	public void Zoom() throws InterruptedException {
		js.executeScript("document.body.style.zoom=0.1;");
		Thread.sleep(500);
		js.executeScript("document.body.style.zoom=0;");
		Thread.sleep(500);
		js.executeScript("document.body.style.zoom=15;");
		Thread.sleep(500);
		js.executeScript("document.body.style.zoom=0;");
		
	}
	@Test
	public void getText() {
		String text=js.executeScript("return document.getElementById(\"navigateHome\").innerHTML").toString();
		System.out.println(text);
	}
}
