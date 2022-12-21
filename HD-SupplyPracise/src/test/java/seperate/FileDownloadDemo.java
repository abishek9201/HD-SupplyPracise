package seperate;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.*;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileDownloadDemo {
	WebDriver driver;
	@BeforeMethod
	public void beforeMethod() {
		WebDriverManager.chromedriver().setup();
		ChromeOptions op=new ChromeOptions();
		op.addArguments("--disable-popup-blocking");
		op.addArguments("--start-maximized");
		driver =new ChromeDriver(op);	
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	}
	@AfterMethod
	public void AfterMethod() throws InterruptedException {
		Thread.sleep(2000);
		driver.close();
	}
	
	@Test
	public void downloadTextFile() {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		driver.navigate().to("https://demo.automationtesting.in/FileDownload.html");
		driver.findElement(By.xpath("//a[@class='btn btn-primary'][text()='Download']")).click();
		driver.findElement(By.id("textbox")).sendKeys("I am text File");
		js.executeScript("arguments[0].scrollIntoView();",driver.findElement(By.id("createTxt")));
		driver.findElement(By.id("createTxt")).click();
		js.executeScript("arguments[0].scrollIntoView();",driver.findElement(By.cssSelector("a[download='info.txt']")));
		driver.findElement(By.cssSelector("a[download='info.txt']")).click();
		
	}
	@Test
	public void downloadPdfFile() {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		driver.navigate().to("https://demo.automationtesting.in/FileDownload.html");
		js.executeScript("arguments[0].scrollIntoView()",driver.findElement(By.id("pdfbox")) );
		driver.findElement(By.id("pdfbox")).sendKeys("I am text File");
		js.executeScript("arguments[0].scrollIntoView();",driver.findElement(By.id("createPdf")));
		driver.findElement(By.id("createPdf")).click();
		js.executeScript("arguments[0].scrollIntoView();",driver.findElement(By.cssSelector("a[download='info.txt']")));
		driver.findElement(By.cssSelector("a[download='info.pdf']")).click();
	}
	@Test
	public void downloadImage() throws Exception {
		driver.navigate().to("https://en.wikipedia.org/wiki/Royal_Enfield_(India)");
		WebElement logo=driver.findElement(By.xpath("//img[@class='thumbimage'][@data-file-width='1280']"));
		String logoSRC = logo.getAttribute("src");
	     
	     URL imageURL = new URL(logoSRC);
	     BufferedImage saveImage = ImageIO.read(imageURL);
	     
	     ImageIO.write(saveImage, "png", new File("C:/Users/kaset/Downloads/bullet.png"));
	     
	}
	@Test
	public void directPdf() throws Exception {
		driver.navigate().to("https://www.africau.edu/images/default/sample.pdf");
		Robot robo=new Robot();
		robo.keyPress(KeyEvent.VK_CONTROL);
		Thread.sleep(2000);
		robo.keyPress(KeyEvent.VK_S);
		Thread.sleep(2000);
		robo.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(2000);
		robo.keyRelease(KeyEvent.VK_S);
		Thread.sleep(2000);
		robo.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(2000);
		robo.keyRelease(KeyEvent.VK_TAB);
		Thread.sleep(2000);
		robo.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(2000);
		robo.keyRelease(KeyEvent.VK_TAB);
		Thread.sleep(2000);
		robo.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(2000);
		robo.keyRelease(KeyEvent.VK_TAB);
		Thread.sleep(2000);
		robo.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		robo.keyRelease(KeyEvent.VK_ENTER);
	
		
	}
}
