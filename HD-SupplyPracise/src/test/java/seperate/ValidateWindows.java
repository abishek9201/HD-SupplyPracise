package seperate;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ValidateWindows {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		JavascriptExecutor js=(JavascriptExecutor)driver;
//----------------------Single Window-------------------------
//		WebElement w1=driver.findElement(By.id("newWindowBtn"));
//		js.executeScript("arguments[0].scrollIntoView()",w1);
//		String Parent=driver.getWindowHandle();
//		w1.click();
//		Set<String> childs=driver.getWindowHandles();
//		for(String a:childs) {
//			if(!(a.equals(Parent))) {
//			driver.switchTo().window(a);
//			driver.manage().window().maximize();
//			js.executeScript("arguments[0].scrollIntoView()",driver.findElement(By.id("firstName")));
//			driver.findElement(By.id("firstName")).sendKeys("window1");
//			driver.close();
//			}
//		}
//		driver.switchTo().window(Parent);
//		driver.findElement(By.id("name")).sendKeys("Abishek");
//		driver.quit();
//----------------------NewTab-------------------------------
//		WebElement w2=driver.findElement(By.id("newTabBtn"));
//		js.executeScript("arguments[0].scrollIntoView()",w2);
//		String Parent=driver.getWindowHandle();
//		w2.click();
//		Set<String> childs=driver.getWindowHandles();
//		for(String a:childs) {
//			if(!(a.equals(Parent))) {
//			driver.switchTo().window(a);
//			js.executeScript("arguments[0].scrollIntoView()",driver.findElement(By.id("alertBox")));
//			Thread.sleep(1000);
//			driver.findElement(By.id("alertBox")).click();
//			driver.switchTo().alert().accept();
//			driver.close();
//			}
//		}
//		driver.switchTo().window(Parent);
//		driver.findElement(By.id("name")).sendKeys("Abishek");
//		driver.quit();
//----------------------NewWindowsBtn------------------------
//		WebElement w3=driver.findElement(By.id("newWindowsBtn"));
//		js.executeScript("arguments[0].scrollIntoView()",w3);
//		String Parent=driver.getWindowHandle();
//		w3.click();
//		Set<String> childs=driver.getWindowHandles();
//		for(String b:childs) {
//			if(!(b.equals(Parent))) {
//			driver.switchTo().window(b);
//			String Title=driver.getTitle();
//			if(Title.equals("XPath Practice - H Y R Tutorials")) {
//			driver.manage().window().maximize();
//			driver.findElement(By.xpath("//input[@name='name'][@maxlength='10']")).sendKeys("multiplewindows");
//			driver.close();
//			}
//			}
//		}
//		driver.switchTo().window(Parent);
//		driver.findElement(By.id("name")).sendKeys("Abishek");
//		driver.quit();
//----------------------newTabsBtn--------------------------
//		WebElement w4=driver.findElement(By.id("newTabsBtn"));
//		js.executeScript("arguments[0].scrollIntoView()",w4);
//		String Parent=driver.getWindowHandle();
//		w4.click();
//		Set<String> childs=driver.getWindowHandles();
//		System.out.println("-----All Title-----");
//		for(String b:childs) {
//			if(!(b.equals(Parent))) {
//			driver.switchTo().window(b);
//			String Title=driver.getTitle();
//			System.out.println(Title);
//			if(Title.equals("Basic Controls - H Y R Tutorials")) {
//			driver.manage().window().maximize();
//			driver.findElement(By.id("firstName")).sendKeys("multipleTabs");
//			System.out.println("Swifted to---- ");
//			System.out.println(driver.getTitle());
//			driver.close();
//			}
//			}
//		}
//		driver.switchTo().window(Parent);
//		driver.findElement(By.id("name")).sendKeys("Abishek");
//		System.out.println("Swifted to Parent ---");
//		System.out.println(driver.getTitle());
//		driver.quit();
//----------------------newTabsWindowsBtn--------------------
		WebElement w5=driver.findElement(By.id("newTabsWindowsBtn"));
		js.executeScript("arguments[0].scrollIntoView()",w5);
		String Parent=driver.getWindowHandle();
		Actions act =new Actions(driver);
		act.sendKeys(Keys.PAGE_DOWN).perform();
		Thread.sleep(1000);
		w5.click();
		Set<String> childs=driver.getWindowHandles();
		System.out.println("-----All Title-----");
		for(String z:childs) {
			if(!(z.equals(Parent))) {
				driver.switchTo().window(z);
				String names=driver.getTitle();
				System.out.println(names);
			}
		}
		for(String b:childs) {
			if(!(b.equals(Parent))) {
			driver.switchTo().window(b);
			String Title=driver.getTitle();
			if(Title.equals("Contact Me - H Y R Tutorials")) {
			driver.manage().window().maximize();
			System.out.println("Swifted to---- ");
			System.out.println(driver.getTitle());
			System.out.println(driver.getCurrentUrl());
			driver.close();
			}
			}
		}
		driver.switchTo().window(Parent);
		driver.findElement(By.id("name")).sendKeys("Abishek");
		System.out.println("Swifted to Parent---");
		System.out.println(driver.getTitle());
		driver.quit();
		
		
	}

}
