package seperate;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.*;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CoandDc {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		 //DesiredCapabilities dc=new DesiredCapabilities();
		 //dc.setAcceptInsecureCerts(true);
		 //dc.setBrowserName("firefox");
		ChromeOptions co = new ChromeOptions();
		//co.addArguments("--headless");
		co.addArguments("--start-maximized");
		co.addArguments("--window-size=1920,1080");
		//co.setHeadless(true);
		//co.addArguments("--incognito");
		
		// co.addArguments("disable-infobars");
		// co.addArguments("disable-notifications");
		// co.addArguments("disable-geolocation");
		/* disable search bar in chrome driver */
		 co.addArguments("--app=http://www.google.com");
		/* Adding extensions to chrome driver using chrome options */
		// co.addExtensions(new
		// File("C:\\Users\\kaset\\Downloads\\extension_2_7_1_0.crx"));
		// co.merge(dc);

		WebDriver driver = new ChromeDriver(co);
		// driver.navigate().to("https://no-sct.badssl.com/");
		// driver.navigate().to("http://demo.guru99.com/");
		driver.navigate().to("http://www.google.com");
	}

}
