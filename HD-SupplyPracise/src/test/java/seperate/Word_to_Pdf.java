package seperate;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Word_to_Pdf {
WebDriver driver;
	
	@BeforeTest
	public void beforeTest() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(90,TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	@AfterTest
	public void AfterTest() {
		driver.close();
	}
	@Test
	public void usingSendKeys() throws InterruptedException {
		driver.navigate().to("https://www.sodapdf.com/pdf-to-word/");
		driver.findElement(By.cssSelector("input[id='choose-file']")).sendKeys("C:\\Users\\kaset\\Downloads\\sample.pdf");
		//Thread.sleep(3000);
		//String value=driver.findElement(By.cssSelector("h1[class='title']")).getText();
		//Assert.assertEquals("Your file is ready!",value);
		String value=driver.findElement(By.xpath("//span[.='Rate this tool']")).getText();
		Assert.assertEquals("Rate this tool",value);
	}
	@Test
	public void usingRoboClass() throws AWTException {
		driver.navigate().to("https://www.sodapdf.com/pdf-to-word/");
		driver.findElement(By.cssSelector("label[aria-label='Choose file']")).click();
		Robot rb=new Robot();
		rb.delay(2000);
		StringSelection ss=new StringSelection("C:\\Users\\kaset\\Downloads\\sample.pdf");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		//Ctrl+v press
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);
		//ctrl+v release
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);
		//press enter 
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		String value=driver.findElement(By.xpath("//span[.='Rate this tool']")).getText();
		Assert.assertEquals("Rate this tool",value);
	}
	

}
