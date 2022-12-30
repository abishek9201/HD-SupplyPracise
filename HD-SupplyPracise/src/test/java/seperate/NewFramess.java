package seperate;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NewFramess {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://ui.vision/demo/webtest/frames/");
		WebElement frame1=driver.findElement(By.cssSelector("frame[src='frame_1.html']"));
		driver.switchTo().frame(frame1);
		driver.findElement(By.xpath("//input[@name='mytext1']")).sendKeys("In frame 1");
		driver.switchTo().defaultContent();
		WebElement frame2=driver.findElement(By.cssSelector("frame[src='frame_2.html']"));
		driver.switchTo().frame(frame2);
		driver.findElement(By.xpath("//input[@name='mytext2']")).sendKeys("In frame 2");
		driver.switchTo().defaultContent();
		WebElement frame3=driver.findElement(By.cssSelector("frame[src='frame_3.html']"));
		driver.switchTo().frame(frame3);
		driver.findElement(By.xpath("//input[@name='mytext3']")).sendKeys("In frame 3");
		WebElement iframe=driver.findElement(By.xpath("//iframe[@src='https://docs.google.com/forms/d/1yfUq-GO9BEssafd6TvHhf0D6QLDVG3q5InwNE2FFFFQ/viewform?embedded=true']"));
		driver.switchTo().frame(iframe);
		driver.findElement(By.xpath("//span[text()='Hi, I am the UI.Vision IDE']")).click();
		driver.findElement(By.xpath("//span[text()='Web Testing']")).click();
		driver.switchTo().defaultContent();
		WebElement frame4=driver.findElement(By.cssSelector("frame[src='frame_4.html']"));
		driver.switchTo().frame(frame4);
		driver.findElement(By.xpath("//input[@name='mytext4']")).sendKeys("In frame 4");
		driver.switchTo().defaultContent();
		WebElement frame5=driver.findElement(By.cssSelector("frame[src='frame_5.html']"));
		driver.switchTo().frame(frame5);
		driver.findElement(By.xpath("//input[@name='mytext5']")).sendKeys("In frame 5");
		//driver.quit();
		
		

	}

}
