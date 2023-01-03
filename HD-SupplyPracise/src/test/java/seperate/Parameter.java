package seperate;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Parameter {
	WebDriver driver;
	@Parameters("browserName")
	@BeforeTest
	public void setBrowser(String browserName) {
		switch (browserName.toLowerCase()) {
		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			break;
		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
			break;
		case "edge":
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
			break;

		default:
			System.err.println("please set the browser");
			break;
		}
		driver.manage().window().maximize();

	}
	@Parameters("url")
	@Test
	public void setUrl(String url) {
		driver.navigate().to(url);
	}
	@Parameters("search")
	@Test
	public void input(String search) {
		driver.findElement(By.name("q")).sendKeys(search);
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	}
	@Test(enabled=false)
	public void disable() {
		System.out.println("I am disabled");
	}
	@AfterTest
	public void afterTest() {
		driver.quit();
	}
}
