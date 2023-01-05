package seperate;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class JSExecutor {
	WebDriver driver;
	JavascriptExecutor js;
	@BeforeTest
	public void beforeTest() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		js=(JavascriptExecutor)driver;
		
	}
	@AfterTest
	public void afterTest() {
		driver.quit();	
	}
	@Test(priority=1)
	public void highlightElement() {
		WebElement loginHead=driver.findElement(By.xpath("//h5[@class='oxd-text oxd-text--h5 orangehrm-login-title'][text()='Login']"));
		js.executeScript("arguments[0].style.background=\"yellow\";",loginHead);
		js.executeScript("document.getElementsByClassName('oxd-sheet oxd-sheet--rounded oxd-sheet--gutters oxd-sheet--gray-lighten-2 orangehrm-demo-credentials')[0].style.border=\"2px red solid\";");
		js.executeScript("document.getElementsByClassName('orangehrm-login-branding')[0].setAttribute('style','border:2px red solid;background:yellow');");
	}
	@Test(priority=2)
	public void sendText() {
		WebElement login=driver.findElement(By.name("username"));
		js.executeScript("arguments[0].value='Admin';",login);
		WebElement pass=driver.findElement(By.name("password"));
		js.executeScript("arguments[0].value='admin123';",pass);
		
	}
	@Test(priority=3)
	public void Click() {
		js.executeScript("document.querySelector(\"button[type='submit']\").click();");
		
	}


}
