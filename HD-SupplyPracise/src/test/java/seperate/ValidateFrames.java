package seperate;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ValidateFrames {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
		driver.switchTo().frame("frm1");
		Select DD=new Select(driver.findElement(By.id("course")));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", DD);
		DD.selectByVisibleText("Dot Net");
		driver.switchTo().defaultContent();
		driver.switchTo().frame("frm3");
		driver.switchTo().frame("frm2");
		WebElement Name=driver.findElement(By.id("firstName"));
		js.executeScript("arguments[0].scrollIntoView();",Name);
		Name.sendKeys("Abishek");
		driver.switchTo().defaultContent();		
	}

}
