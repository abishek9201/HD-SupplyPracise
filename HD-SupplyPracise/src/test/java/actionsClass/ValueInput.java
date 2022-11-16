package actionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ValueInput {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.hyrtutorials.com/p/basic-controls.html");
		Actions act=new Actions(driver);
		act.sendKeys(Keys.PAGE_DOWN).build().perform();
		WebElement LastName=driver.findElement(By.name("lName"));
		//login.sendKeys("Admin");
		JavascriptExecutor js=(JavascriptExecutor)driver;
		Thread.sleep(3000);
		js.executeScript ("document.getElementById('firstName').value='Selenium'");
		Thread.sleep(3000);
		js.executeScript("arguments[0].value='Abishek'", LastName);
		Thread.sleep(3000);
		js.executeScript("document.getElementsByName('email')[0].value='Abi@gmail.com'");
		Thread.sleep(3000);
		driver.close();
	}

}
