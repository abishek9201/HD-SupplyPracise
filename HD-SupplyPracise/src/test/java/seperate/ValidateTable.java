package seperate;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
public class ValidateTable {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.w3schools.com/howto/howto_js_sort_table.asp");
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView", driver.findElement(By.xpath("//button[.='Sort']")));
		driver.findElement(By.xpath("//button[.='Sort']")).click();
		List<WebElement>trowpath=driver.findElements(By.xpath("//table[@id='myTable']/tbody/tr/td[1]"));
		String trowval []=new String[trowpath.size()];
		for(int i=0;i<trowpath.size();i++) {
			trowval[i]=trowpath.get(i).getText();
		}
		for(String z:trowval) {
			System.out.println(z);
		}
		boolean sortFunctionality = true;
		outer:
		for(int a=0;a<trowval.length;a++) {
		for(int b=a+1;b<trowval.length;b++) {
				int res=trowval[b].compareTo(trowval[a]);
				if(!(res>0)){
					//for ascending order we need to get positive values if we get negative values then it is in descending order
					System.out.println("The Table is not sorted "+trowval[a]+":::"+trowval[b]);
					sortFunctionality=false;
					break outer;	
				}
				else {
					System.out.println("The Table is sorted "+trowval[a]+":::"+trowval[b]);
				}
			}
		}
		if(sortFunctionality)
		{
			System.out.println("SORT Functionality is working");
		}
		else
		{
			System.out.println("SORT Functionality is not working");
		}
		driver.close();

	}

}
