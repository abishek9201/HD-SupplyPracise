package seleniumGrid;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class GoogleTest2 {
	@Test
	public void testFox() throws MalformedURLException {
		DesiredCapabilities caps=new DesiredCapabilities();
		caps.setBrowserName("firefox");
		WebDriver driver=new RemoteWebDriver(new URL("http://192.168.1.7:4444"),caps);
		driver.get("https://www.google.com/");
		System.out.println(driver.getTitle());
		driver.findElement(By.name("q")).sendKeys("hi");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		System.out.println(driver.getTitle());
		driver.close();
		
	}

}
