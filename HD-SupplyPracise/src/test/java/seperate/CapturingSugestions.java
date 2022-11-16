package seperate;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CapturingSugestions {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		WebDriverWait wait=new WebDriverWait(driver, 20);
		driver.get("https://www.google.co.in/");
		driver.findElement(By.name("q")).sendKeys("selenium");
//		Set <String>ab=driver.getWindowHandles();
//		for(String abc:ab) {
//			System.out.println(ab);
//		}
//		Thread.sleep(3000);
		wait.until(d->d.findElement(By.cssSelector("li[class='sbct']")).isDisplayed());
		List<WebElement>suggestions=driver.findElements(By.cssSelector("li[class='sbct']"));
	for(WebElement a:suggestions) {
		System.out.println(a.getText());
	}
	driver.findElement(By.xpath("//span[.='selenium testing']")).click();
	driver.close();

	}

}
