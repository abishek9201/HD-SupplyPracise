package seperate;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ValidateCalendar {

	public static void main(String[] args) throws ParseException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.hyrtutorials.com/p/calendar-practice.html");
		Actions act=new Actions(driver);
		act.sendKeys(Keys.PAGE_DOWN).build().perform();
		driver.findElement(By.id("first_date_picker")).click();
		String targetDate="13/04/2024";
		Calendar calendar = Calendar.getInstance();
		SimpleDateFormat targetDateFormat = new SimpleDateFormat("dd/MM/yyyy");
		targetDateFormat.setLenient(false);
		Date formattedTargetDate = targetDateFormat.parse(targetDate);
		calendar.setTime(formattedTargetDate);
		int targetMonth = calendar.get(Calendar.MONTH);
		int targetYear = calendar.get(Calendar.YEAR);
		int targetDay = calendar.get(Calendar.DAY_OF_MONTH);

		String currentDate = driver.findElement(By.className("ui-datepicker-title")).getText();
		calendar.setTime(new SimpleDateFormat("MMM yyyy").parse(currentDate));
		int currentMonth = calendar.get(Calendar.MONTH);
		int currentYear = calendar.get(Calendar.YEAR);
		while(currentMonth < targetMonth || currentYear < targetYear) {
			driver.findElement(By.className("ui-datepicker-next")).click();
			currentDate = driver.findElement(By.className("ui-datepicker-title")).getText();
			calendar.setTime(new SimpleDateFormat("MMM yyyy").parse(currentDate));
			currentMonth = calendar.get(Calendar.MONTH);
			currentYear = calendar.get(Calendar.YEAR);
		}

		while(currentMonth > targetMonth || currentYear > targetYear) {
			driver.findElement(By.className("ui-datepicker-prev")).click();
			currentDate = driver.findElement(By.className("ui-datepicker-title")).getText();
			calendar.setTime(new SimpleDateFormat("MMM yyyy").parse(currentDate));
			currentMonth = calendar.get(Calendar.MONTH);
			currentYear = calendar.get(Calendar.YEAR);
		}
		driver.findElement(By.xpath("//a[contains(text(),"+targetDay+")]")).click();
	}

}
