package seperate;
import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ValidateBags {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.navigate().to("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		driver.findElement(By.name("q")).sendKeys("bag");
		driver.findElement(( By.cssSelector("a[href*=\"bags+men+college+bags\"]"))).click();
		System.out.println(driver.findElement(By.name("q")).getAttribute("value"));
		String men=driver.findElement(By.name("q")).getAttribute("value");
		Assert.assertEquals("bags men college bags",men);
		System.out.println();
		WebElement cdd=driver.findElement(By.xpath("//div[.='Relevance']"));
		String cs=cdd.getCssValue("color");
		String hexColor=Color.fromString(cs).asHex();
		System.out.println(hexColor);
		Assert.assertEquals("#2874f0", hexColor);
		driver.close();
	}

}
