package seperate;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NewThrows {

	public static void main(String[] args) throws NoAlertPresentException {
	
		try {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.google.co.in/");
		driver.findElement(By.name("q")).sendKeys("oneplus mobile");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		driver.switchTo().alert();
		
		
		}
		catch (NoSuchElementException NSE) {
			System.out.println(NSE.getLocalizedMessage());
		}
		catch(NoAlertPresentException NA) {
			System.out.println(NA.getLocalizedMessage());
		}
		finally {
			throw new NoSuchElementException();
		}
		
	}

}
