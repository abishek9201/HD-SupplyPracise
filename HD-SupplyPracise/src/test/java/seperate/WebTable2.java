package seperate;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTable2 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");
		//checking the columns of a table
		JavascriptExecutor js=(JavascriptExecutor)driver;
		List<WebElement>columns=driver.findElements(By.xpath("//table[@id='customers']//th"));
		js.executeScript("arguments[0].scrollToVisibleText",columns);
		Assert.assertEquals(columns.size(),3,"columns are not matching");
		System.out.println(columns.size());
		for (WebElement we : columns) {
			System.out.println(we.getText());
		}
		System.out.println();
		//checking the columns of the table 
		List<WebElement>rows=driver.findElements(By.xpath("//table[@id='customers']//tr"));
		js.executeScript("arguments[0].scrollToVisibleText",rows);
		Assert.assertEquals(rows.size(),7,"Rows are not matching");
		System.out.println(rows.size());
		for (WebElement we1 : rows) {
			System.out.println(we1.getText());
		}
		System.out.println();
		//Checking the country names
		List<WebElement>country=driver.findElements(By.xpath("//table[@id='customers']//tr//td[3]"));
		js.executeScript("arguments[0].scrollToVisibleText",country);
		Assert.assertEquals(country.size(),6,"countries are not matching");
		System.out.println(country.size());
		for (WebElement we2 : country) {
			System.out.println(we2.getText());
		}
		System.out.println();
		//Checking the country names
		List<WebElement> contact = driver.findElements(By.xpath("//table[@id='customers']//tr//td[2]"));
		js.executeScript("arguments[0].scrollToVisibleText", contact);
		Assert.assertEquals(contact.size(), 6, "contact are not matching");
		System.out.println(contact.size());
		for (WebElement we3 : contact) {
			System.out.println(we3.getText());
		}
		System.out.println();
		//Checking the company names
		List<WebElement> company = driver.findElements(By.xpath("//table[@id='customers']//tr//td[1]"));
		js.executeScript("arguments[0].scrollToVisibleText", company);
		Assert.assertEquals(company.size(), 6, "contact are not matching");
		System.out.println(company.size());
		for (WebElement we4 : company) {
			System.out.println(we4.getText());
		}
		//finding the preceding sibling text
		System.out.println("\n"+driver.findElement(By.xpath("//td[text()='Mecca']//preceding-sibling::th")).getText());
		//finding the following sibling text
		System.out.println("\n"+driver.findElement(By.xpath("//td[text()='UAE']//following-sibling::td[2]")).getText());
		driver.close();

	}

}
