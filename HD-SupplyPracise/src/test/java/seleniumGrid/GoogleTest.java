package seleniumGrid;

import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class GoogleTest {
	@Test
	public void testChrome() throws MalformedURLException {
		DesiredCapabilities caps=new DesiredCapabilities();
		caps.setBrowserName("chrome");
		WebDriver driver=new RemoteWebDriver(new URL("http://192.168.1.7:4444"),caps);
		driver.get("https://www.selenium.dev/downloads/");
		System.out.println(driver.getTitle());
		driver.close();
		
		
	}

}
