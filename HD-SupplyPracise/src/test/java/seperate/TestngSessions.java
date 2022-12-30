package seperate;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.SessionId;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestngSessions {
	@Test
	public void SessionOne() {
		// First session of WebDriver
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.techlistic.com/p/selenium-practice-form.html");
		driver.findElement(By.name("firstname")).sendKeys("session 1");
		driver.findElement(By.name("lastname")).sendKeys("driver 1");
		System.out.println("=================================");
		SessionId s = ((RemoteWebDriver) driver).getSessionId();
		System.out.println("Session Id is: " + s);
		System.out.println("=================================");

	}

	@Test
	public void SessionTwo() {
		// Second session of WebDriver
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.techlistic.com/p/selenium-practice-form.html");
		driver.findElement(By.name("firstname")).sendKeys("session 2");
		driver.findElement(By.name("lastname")).sendKeys("driver 2");
		System.out.println("=================================");
		SessionId s = ((RemoteWebDriver) driver).getSessionId();
		System.out.println("Session Id is: " + s);
		System.out.println("=================================");

	}

	@Test
	public void SessionThree() {
		// Third session of WebDriver
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.techlistic.com/p/selenium-practice-form.html");
		driver.findElement(By.name("firstname")).sendKeys("session 3");
		driver.findElement(By.name("lastname")).sendKeys("driver 3");
		System.out.println("=================================");
		SessionId s = ((RemoteWebDriver) driver).getSessionId();
		System.out.println("Session Id is: " + s);
		System.out.println("=================================");

	}
}
