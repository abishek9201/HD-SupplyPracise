package seperate;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ValidateSauce {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.MILLISECONDS);
		driver.navigate().to("https://www.saucedemo.com/");
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
//		driver.switchTo().alert().accept();
//		driver.switchTo().alert().dismiss();
		Select dropDown=new Select(driver.findElement(By.cssSelector("select[data-test='product_sort_container']")));
		dropDown.selectByVisibleText("Name (Z to A)");
		List<WebElement> namePath=driver.findElements(By.cssSelector("div[class=\"inventory_item_name\"]"));
		String arrName[]=new String[namePath.size()];
		for(int i=0;i<namePath.size();i++) {
			arrName[i]=namePath.get(i).getText();
		}
		boolean val=true;
		loop:
		for(int i=0;i<arrName.length;i++) {
			for(int j=i+1;j<arrName.length;j++) {
				int result=arrName[j].compareTo(arrName[i]);
				if((result>0)){
					//for descending order we need to get negative values if we get positive values then it is in ascending order
					val=false;
					break loop;
				}
			}
		}
		if(val) {
			System.out.println("items are sorted");
		}
		else {
			System.out.println("items are sorted");
		}
		driver.close();

	}

}
