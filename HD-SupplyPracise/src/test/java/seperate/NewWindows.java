package seperate;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NewWindows {
	WebDriver driver;
	JavascriptExecutor js;

	@BeforeMethod
	public void beforeMethod() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		js = (JavascriptExecutor) driver;
		driver.navigate().to("https://www.hyrtutorials.com/p/window-handles-practice.html");
	}

	@AfterMethod
	public void afterMethod() {
		driver.close();
	}

	@Test
	public void singleWindow() {
		js.executeScript("arguments[0].scrollIntoView();", driver.findElement(By.id("newWindowBtn")));
		driver.findElement(By.id("newWindowBtn")).click();
		String parentWindow = driver.getWindowHandle();
		Set<String> childWindow = driver.getWindowHandles();
		for (String id : childWindow) {
			if (!(id.equals(parentWindow))) {
				driver.manage().window().maximize();
				driver.switchTo().window(id);
				driver.close();
			}
		}
		driver.switchTo().window(parentWindow);
		js.executeScript("arguments[0].scrollIntoView();", driver.findElement(By.id("name")));
		driver.findElement(By.id("name")).sendKeys("singleWindow");

	}

	@Test
	public void singleTab() {
		js.executeScript("arguments[0].scrollIntoView();", driver.findElement(By.id("newTabBtn")));
		String parentWindow = driver.getWindowHandle();
		driver.findElement(By.id("newTabBtn")).click();
		Set<String> childWindow = driver.getWindowHandles();
		for (String id : childWindow) {
			if (!(id.equals(parentWindow))) {
				driver.manage().window().maximize();
				driver.switchTo().window(id);
				driver.close();
			}
		}
		driver.switchTo().window(parentWindow);
		js.executeScript("arguments[0].scrollIntoView();", driver.findElement(By.id("name")));
		driver.findElement(By.id("name")).sendKeys("singleTab");

	}
	@Test
	public void multipleWindows() {
		js.executeScript("arguments[0].scrollIntoView();",driver.findElement(By.id("newWindowsBtn")));
		String ParentWindow=driver.getWindowHandle();
		driver.findElement(By.id("newWindowsBtn")).click();
		Set<String>childWindows=driver.getWindowHandles();
		for (String id : childWindows) {
			if(!(id.equals(ParentWindow))) {
				driver.switchTo().window(id);
				driver.manage().window().maximize();
				driver.close();
			}	
		}
		driver.switchTo().window(ParentWindow);
		js.executeScript("arguments[0].scrollIntoView();", driver.findElement(By.id("name")));
		driver.findElement(By.id("name")).sendKeys("multipleWindows");
	}
	@Test
	public void multipleTabs() {
		js.executeScript("arguments[0].scrollIntoView();",driver.findElement(By.id("newTabsBtn")));
		String ParentWindow=driver.getWindowHandle();
		driver.findElement(By.id("newTabsBtn")).click();
		Set<String>childWindows=driver.getWindowHandles();
		String target="CDwindow-09062BD3A255FEB219035E7B07D7EC5D";
		for (String id : childWindows) {
			System.out.println(id);
			if(id.equals(target)) {
				driver.switchTo().window(id);
				driver.close();
			}	
		}
		driver.switchTo().window(ParentWindow);
		js.executeScript("arguments[0].scrollIntoView();", driver.findElement(By.id("name")));
		driver.findElement(By.id("name")).sendKeys("multipleTabs");	
	}
	@Test
	public void multipleWindowsTabs() throws InterruptedException {
		js.executeScript("arguments[0].scrollIntoView();",driver.findElement(By.xpath("//h2[@class='title'][text()='Recent Tutorials']")));
		Actions act=new Actions(driver);
		//act.sendKeys(Keys.PAGE_DOWN);
		//js.executeScript("arguments[0].scrollIntoView();",driver.findElement(By.id("newTabsWindowsBtn")));
		String ParentWindow=driver.getWindowHandle();
		driver.findElement(By.id("newTabsWindowsBtn")).click();
		Set<String>childWindows=driver.getWindowHandles();
		for (String id : childWindows) {
			System.out.println(id);
			if(!(id.equals(ParentWindow))) {
				driver.switchTo().window(id);
				Thread.sleep(1000);
				driver.close();
			}	
		}
		driver.switchTo().window(ParentWindow);
		js.executeScript("arguments[0].scrollIntoView();", driver.findElement(By.id("name")));
		driver.findElement(By.id("name")).sendKeys("multiple Windows&Tabs");	
	}
	
}
