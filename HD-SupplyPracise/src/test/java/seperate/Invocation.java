package seperate;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Invocation {
	WebDriver driver;
	@BeforeTest
	public void beforeTest() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
	}
	@Test(invocationCount=3,invocationTimeOut=20000)
	public void getData() throws InterruptedException {
		driver.navigate().to("https://randomuser.me/");
		Thread.sleep(1000);
		String name=driver.findElement(By.xpath("//li[@data-title='Hi, My name is']")).getAttribute("data-value");
		System.out.println(name);
		Thread.sleep(1000);
		String mail=driver.findElement(By.xpath("//li[@data-title='My email address is']")).getAttribute("data-value");
		System.out.println(mail);
		Thread.sleep(1000);
		String phone=driver.findElement(By.xpath("//li[@data-title='My phone number is']")).getAttribute("data-value");
		System.out.println(phone);
		System.out.println("-----------------------------------------");
		
	}
	public void afterMethod() {
		driver.quit();
	}
}
