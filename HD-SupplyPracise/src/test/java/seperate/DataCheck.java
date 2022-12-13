package seperate;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataCheck {
	WebDriver driver;
	@BeforeMethod
	public void beforeMethod() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
	}
	@AfterMethod
	public void AfterMenthod() {
		driver.close();
	}

	@Test(dataProvider="data123",dataProviderClass =ExcelDataRetrival.class) 
	public void name(String a,String b) throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.findElement(By.name("username")).sendKeys(a);
		driver.findElement(By.name("password")).sendKeys(b);
		driver.findElement(By.xpath("//button[.=' Login ']")).click();
		Thread.sleep(1000);
		String value=driver.findElement(By.xpath("//h6[.='Dashboard']")).getText();
		Assert.assertEquals(value,"Dashboard");
	}
}
