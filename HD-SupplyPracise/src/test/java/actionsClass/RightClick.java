package actionsClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class RightClick extends BaseClass2{
	@Test(priority=1)
	public void hello() throws InterruptedException {
		//https://swisnl.github.io/jQuery-contextMenu/demo.html
		driver.manage().timeouts().implicitlyWait(3000,TimeUnit.MILLISECONDS);
		Actions act =new Actions(driver);
		//WebElement right=driver.findElement(By.xpath("//span[contains(text(),'right click me')]"));
		WebElement right=driver.findElement(By.xpath("//span[.='right click me']"));
		WebElement quit=driver.findElement(By.xpath("//li[.='Quit']"));
		Thread.sleep(3000);
		act.moveToElement(right).contextClick().build().perform();
		Thread.sleep(3000);
		act.moveToElement(quit).click().perform();
		String msg=driver.switchTo().alert().getText();
		driver.switchTo().alert().accept();
		
		System.out.println(msg);
		
		
	}

}
