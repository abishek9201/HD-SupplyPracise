package seperate;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
public class WebTable {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://seleniumpractise.blogspot.com/2021/08/");
		//Finding the columns in the table 
		List<WebElement>headings=driver.findElements(By.xpath("//table[@id='customers']//th"));
		System.out.println("Total "+headings.size()+" Columns in the table ");
		for(WebElement a:headings) {
			System.out.println(a.getText());
		}
		System.out.println();
		// Finding the company names in the table
		List<WebElement> company = driver.findElements(By.xpath("//table[@id='customers']//tr//td[2]"));
		System.out.println("Total " + company.size() + " Companies in the table ");
		for (WebElement a : company) {
			System.out.println(a.getText());
		}
		//Total no of rows
		List<WebElement>rows=driver.findElements(By.xpath("//table[@id='customers']//tr"));
		System.out.println("\n"+"Tables has "+rows.size()+" rows");
		//Checking the data is present or not 
		List<WebElement>alldata=driver.findElements(By.xpath("//table[@id='customers']//tr//td"));
		boolean status=true;
		for (WebElement we : alldata) {
			String val=we.getText();
			System.out.println(val);
			if(val.contains("Java")) {
				status=false;
				break;
			}
		}
		if(!status) {
			System.out.println("Table has the value ");
		}
		else {
			System.out.println("Table doesnt have the value");
		}
		driver.findElement(By.xpath("//td[text()='Java']//preceding-sibling::td//input")).click();
		WebElement city=driver.findElement(By.xpath("//td[text()='Ola']//following-sibling::td[2]"));
		System.out.println(city.getText());
		driver.findElement(By.xpath("//td[text()='Ola']//following-sibling::td[a]")).click();
		driver.close();

	}

}
