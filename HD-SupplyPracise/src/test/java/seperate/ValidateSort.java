package seperate;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ValidateSort {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://magento.softwaretestingboard.com/");
		driver.findElement(By.id("search")).sendKeys("jacket");
		Actions act=new Actions(driver);
		act.sendKeys(Keys.ENTER).perform();
		Select dropdown=new Select(driver.findElement(By.id("sorter")));
		dropdown.selectByVisibleText("Price");
		Thread.sleep(1000);
		List<WebElement>pricePaths=driver.findElements(By.cssSelector("span[id^='product-price']"));
		String newArr[]=new String[pricePaths.size()];
		Double newArrD[]=new Double[pricePaths.size()];
		for(int i=0;i<pricePaths.size();i++) {
			newArr[i]=pricePaths.get(i).getText().replace("$","");	
		}
		for(int i=0;i<newArr.length;i++) {
			newArrD[i]=Double.valueOf((newArr[i]));
		}
		boolean loop=true;
		for(int i=0;i<newArrD.length;i++) {
			for(int j=i+1;j<newArrD.length;j++) {
				if((newArrD[j]<=newArrD[i])) {
					//System.out.println(newArrD[j]+"<"+newArrD[i]);
				}
				else {
					System.out.println(newArrD[j]+">"+newArrD[i]);
					loop=false;
				}
				
			}
		}
		if(loop) {
			System.out.println("Items are sorted");
		}
		else {
			System.out.println("Items are not sorted");
		}

	
		driver.close();
		

	}

}
