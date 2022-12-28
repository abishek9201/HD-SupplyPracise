package seperate;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NewDropDown {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver");
		WebElement drop1=driver.findElement(By.xpath("//select[@class='col-lg-3'][@id='first']"));
		Select drop1Select=new Select(drop1);
		drop1Select.selectByValue("Google");
		Thread.sleep(1000);
		drop1Select.selectByIndex(3);
		Thread.sleep(1000);
		drop1Select.selectByVisibleText("Iphone");
		//second Drop Down
		WebElement drop2=driver.findElement(By.xpath("//select[@class='col-lg-3'][@id='animals']"));
		Select drop2Select=new Select(drop2);
		drop2Select.selectByValue("avatar");
		Thread.sleep(1000);
		drop2Select.selectByVisibleText("Big Baby Cat");
		Thread.sleep(1000);
		drop2Select.selectByIndex(1);
		//button[@id='custom']
		WebElement drop3=driver.findElement(By.xpath("//button[@class='btn btn-success dropdown-toggle'][@id='custom']"));
		drop3.click();
		driver.findElement(By.xpath("//ul[@class='dropdown-menu show']/li[4]")).click();
		WebElement drop4=driver.findElement(By.xpath("//select[@class='col-lg-3'][@id='second']"));
		Select drop4Select=new Select(drop4);
		drop4Select.selectByValue("burger");
		Thread.sleep(1000);
		drop4Select.selectByIndex(0);
		Thread.sleep(1000);
		drop4Select.selectByVisibleText("Bonda");
		Thread.sleep(1000);
		drop4Select.deselectAll();
		driver.close();
	}

}
