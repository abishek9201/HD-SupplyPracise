package seperate;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ValidateDate {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.hyrtutorials.com/p/calendar-practice.html");
		driver.findElement(By.cssSelector("img[title='Calendar-icon']")).click();
		String MonthYear="October 2023";
		String date="13";
		while(true) {
		WebElement title=driver.findElement(By.xpath("//div[@class='ui-datepicker-title']"));
		String Value=title.getText();
		if(Value.equals(MonthYear)) {
			break;
		}
		else {
			driver.findElement(By.cssSelector("a[title='Next']")).click();
		}
		}
		driver.findElement(By.xpath("//a[contains(text(),"+date+")]")).click();

	}

}
