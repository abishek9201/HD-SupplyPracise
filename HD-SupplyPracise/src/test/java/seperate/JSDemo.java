package seperate;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JSDemo {
	WebDriver driver;
	JavascriptExecutor js;

	@BeforeMethod
	public void beforeMethod() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
		// finding the Elements
		js = (JavascriptExecutor) driver;

	}

	@Test
	public void highlight() throws InterruptedException {
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(1000);
		/*
		 * js.executeScript("document.getElementById('divUsername')");
		 * js.executeScript("document.getElementsByName('username')[0]"); js.
		 * executeScript("document.getElementsByClassName('oxd-text oxd-text--h5 orangehrm-login-title')[0]"
		 * );
		 */
		WebElement Text = (WebElement) js.executeScript(
				"return document.getElementsByClassName('oxd-text oxd-text--h5 orangehrm-login-title')[0]");
		System.out.println(Text.getText());
		// highlighting a text
		js.executeScript(
				"document.getElementsByClassName('oxd-text oxd-text--h5 orangehrm-login-title')[0].style.border='5px red solid';");
		js.executeScript(
				"document.getElementsByClassName('oxd-text oxd-text--h5 orangehrm-login-title')[0].style.background='yellow';");
		js.executeScript(
				"document.getElementsByClassName('oxd-text oxd-text--p orangehrm-login-forgot-header')[0].setAttribute('style','border:5px red solid;background:yellow');");
	}
	@Test
	public void sendText() throws InterruptedException {
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(1000);
		// sending Values to Text box
		// js.executeScript("document.getElementsByName('username')[0].value='Admin';");
		WebElement login = (WebElement) js.executeScript("return document.getElementsByName('username')[0]");
		login.sendKeys("Admin");
		// js.executeScript("document.querySelector(\"input[type='password']\").value='admin123';");
		WebElement pass = (WebElement) js.executeScript("return document.querySelector(\"input[type='password']\");");
		pass.sendKeys("admin123");
		// clicking element
		//js.executeAsyncScript("document.getElementsByClassName('oxd-button oxd-button--medium oxd-button--main orangehrm-login-button')[0].click();");
		driver.findElement(By.cssSelector("button[type='submit']")).click();
	}
	@Test
	public void scroll() {
		driver.navigate().to("https://economictimes.indiatimes.com/industry/banking/finance/banking/pay-your-bills-on-cred-through-the-bharat-bill-pay-system-and-get-rewarded/articleshow/96248406.cms");
		js.executeScript("window.scrollTo(0,500);");
		js.executeScript("window.scrollBy(0,500);");
		js.executeScript("document.querySelector(\"a[data-ga-onclick='Archive - href']\").scrollIntoView();");
		js.executeScript("document.querySelector(\"a[data-ga-onclick='Archive - href']\").setAttribute('style','border:5px red solid;background:yellow');");
	}
	@Test
	public void Zoom() throws InterruptedException {
		driver.navigate().to("https://www.thehansindia.com/andhra-pradesh/andhra-pradesh-elephant-electrocuted-to-death-in-chittoor-district-773635");
		Thread.sleep(500);
		js.executeScript("document.body.style.zoom=0.1;");
		Thread.sleep(500);
		js.executeScript("document.body.style.zoom=0;");
		Thread.sleep(500);
		js.executeScript("document.body.style.zoom=15;");
		Thread.sleep(500);
		js.executeScript("document.body.style.zoom=0;");	
	}

	@AfterMethod
	public void afterMethod() {
		driver.close();
	}
}
