package actionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Slide extends BaseClass2 {
	@Test
	public void newC() {
		//https://jqueryui.com/slider/
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[src='/resources/demos/slider/default.html']")));
		WebElement sl=driver.findElement(By.cssSelector("span[tabindex='0']"));
		Actions act=new Actions(driver);
		act.moveToElement(sl)
		.dragAndDropBy(sl, 500, 0).build().perform();
	}

}
