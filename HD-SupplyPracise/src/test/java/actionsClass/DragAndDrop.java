package actionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;


public class DragAndDrop extends BaseClass2{
	@Test
	public void Drag() {
	Actions act=new Actions(driver);
	WebElement ource=driver.findElement(By.id("draggable"));
	WebElement Target=driver.findElement(By.id("droppable"));
	act.clickAndHold(ource)
	.moveToElement(Target)
	.release().perform();
	}
	@Test
	public void revert() throws InterruptedException {
		//https://demoqa.com/droppable
		driver.findElement(By.id("droppableExample-tab-preventPropogation")).click();
		WebElement d1=driver.findElement(By.id("dragBox"));
		WebElement d2=driver.findElement(By.id("notGreedyInnerDropBox"));	
		Actions act=new Actions(driver);
//		act.clickAndHold(d1)
//		.moveToElement(d2)
//		.release()
//		.perform();
		act.dragAndDrop(d1, d2);
	}
	

}
