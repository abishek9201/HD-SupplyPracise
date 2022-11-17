package seperate;

import static org.testng.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;

import org.testng.annotations.Test;


public class UploadFile extends BaseClass3 {
	@Test
	public void smallPdf() {
		driver.get("https://smallpdf.com/pdf-to-word");
		WebElement Upload=driver.findElement(By.cssSelector("input[type=\"file\"]"));
		Upload.sendKeys("C:\\Users\\kaset\\Downloads\\Locating Techniques.pdf");
	}
	@Test
	public void jqueryUpload() {
		driver.get("https://blueimp.github.io/jQuery-File-Upload/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement Upload=driver.findElement(By.cssSelector("input[type=\"file\"]"));
		Upload.sendKeys("C:\\Users\\kaset\\Downloads\\Screenshot 2022-07-29 100658.png");
		driver.findElement(By.xpath("//span[.='Start upload']")).click();
		boolean display=driver.findElement(By.xpath("//button[@data-type=\"DELETE\"]")).isDisplayed();
		assertTrue(display);
	}

	

}
