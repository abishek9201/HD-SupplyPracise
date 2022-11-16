package pages;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import actionsClass.BaseClass2;

public class Sample extends BaseClass {
	@Test(priority=1)
	public void first(){
		System.out.println("test1");
	
		driver.findElement(By.linkText("Tutorials")).click();
		
	}

}
