package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverBase {
	WebDriver driver;
	public void driverBase() {
		String url="https://www.google.co.in/";
		ChromeOptions chromeOptions = new ChromeOptions();
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver(chromeOptions);
		driver.get(url);
		driver.manage().window().maximize();

	}
	public DriverBase(WebDriver driver) {
		this.driver=driver;
	}
}
