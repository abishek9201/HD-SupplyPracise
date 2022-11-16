package actionsClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MouseOver extends BaseClass2{
	//https://www.hyrtutorials.com/#
		@Test(priority=1)
		public void happy(){
		Actions act=new Actions(driver);
		WebElement ytCourses=driver.findElement(By.xpath("//a[.='YouTube Courses']"));
		WebElement english=driver.findElement(By.xpath("//a[.='English']"));
		WebElement javaCore=driver.findElement(By.xpath("//a[.='Core Java']"));
		
		act.moveToElement(ytCourses)
		.moveToElement(english)
		.moveToElement(javaCore).click().perform();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		}
		
		@Test(priority=2)
		public void doubleClick() {
			Actions act=new Actions(driver);
			WebElement english=driver.findElement(By.xpath("//a[.='English']"));
			act.moveToElement(english).doubleClick().perform();
			
		}
	}


