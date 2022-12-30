package seperate;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NewTry {
	public static void main(String[] args) {
		try {
			WebDriverManager.chromedriver().setup();
			ChromeOptions options = new ChromeOptions();
			//options.addArguments("--start-maximized");
			WebDriver driver = new ChromeDriver(options);
			driver.get("https://www.google.co.in/");
			driver.findElement(By.name("q")).sendKeys("oneplus mobile");
			driver.findElement(By.className("L0Z3Pu")).click();
			driver.close();
		} catch (Exception e) {
			System.out.println(e.getLocalizedMessage());
		}
		
	}

}
