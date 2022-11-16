package actionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Size extends BaseClass2{
	@Test
	public void Resize() {
		//https://jqueryui.com/resizable/
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[src='/resources/demos/resizable/default.html']")));
		Actions act=new Actions(driver);
		WebElement re=driver.findElement(By.xpath("//div[@class='ui-resizable-handle ui-resizable-se ui-icon ui-icon-gripsmall-diagonal-se']"));
		act.moveToElement(re)
		.dragAndDropBy(re, 100, 150).perform();
		
	}

}
