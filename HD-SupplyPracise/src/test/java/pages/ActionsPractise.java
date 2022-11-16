package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import actionsClass.BaseClass2;

public class ActionsPractise extends BaseClass {

	@Test(priority=1)
	public void Newaction()
	{
		Actions act=new Actions(driver);
		WebElement oneClick=driver.findElement(By.cssSelector("a[href='http://compendiumdev.co.uk/selenium/basic_web_page.html']"));
		act.moveToElement(oneClick).click();
//		driver.close();
//		driver.switchTo().defaultContent();
		WebElement twoClicks=driver.findElement(By.cssSelector("a[href='http://newtours.demoaut.com']"));
		act.moveToElement(twoClicks).click().click().perform();
		WebElement threeClicks=driver.findElement(By.cssSelector("a[href='https://only-testing-blog.blogspot.in/2014/01/textbox.html']"));
		act.moveToElement(threeClicks).click().doubleClick().perform();
		
	}
}
