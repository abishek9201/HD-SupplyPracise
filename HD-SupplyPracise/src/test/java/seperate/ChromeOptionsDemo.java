package seperate;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ChromeOptionsDemo {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options=new ChromeOptions();
		//options.addArguments("--incognito");
		//options.addArguments("--headless");
		//options.addArguments("--disable-extensions");
		options.addArguments("--start-maximized");
		//ChromeOptions v=options.addArguments("--version");
		//System.out.println(v);
		//options.addArguments("test-type");
		//options.addArguments("--disable-infobars");
		//options.addArguments("--disable-popup-blocking");
		//options.addArguments("--make-defaultbrowser");
		//options.addArguments("--disable-gpu");
		//options.addExtensions(new File("C:\\Users\\kaset\\Downloads\\extension_2_7_1_0.crx"));
		//options.addArguments("--app=https://www.google.com/");
		WebDriver driver=new ChromeDriver(options);
		driver.navigate().to("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("selenium");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		System.out.println(driver.findElement(By.xpath("//h3[.='Selenium']")).getText());
		//driver.navigate().to("https://demo.guru99.com/test/delete_customer.php");
		//driver.findElement(By.name("submit")).click();
		
		

	}

}
