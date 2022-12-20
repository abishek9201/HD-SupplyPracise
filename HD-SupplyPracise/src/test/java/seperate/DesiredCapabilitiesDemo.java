package seperate;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import okhttp3.internal.platform.Platform;

public class DesiredCapabilitiesDemo {

	public static void main(String args[]) {
		DesiredCapabilities Cap = new DesiredCapabilities();
		// Cap.acceptInsecureCerts();
		Cap.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
		// Cap.setAcceptInsecureCerts(true);
		Cap.setBrowserName("chrome");
		System.out.println(Cap.getBrowserName());
		System.out.println(Cap.getVersion());
		System.out.println(Cap.getPlatform());
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(Cap);
		driver.manage().window().maximize();
		driver.navigate().to("https://no-sct.badssl.com/");
		System.out.println(driver.getTitle());
		driver.close();
	}

}
