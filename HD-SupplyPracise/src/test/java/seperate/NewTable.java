package seperate;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NewTable {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.navigate().to("https://www.w3schools.com/howto/howto_js_sort_table.asp");
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView", driver.findElement(By.xpath("//button[.='Sort']")));
		//driver.findElement(By.xpath("//button[.='Sort']")).click();
		List<WebElement>trowpath1=driver.findElements(By.xpath("//table[@id='myTable']/tbody/tr/td[1]"));
		String trowval1 []=new String[trowpath1.size()];
		for(int i=0;i<trowpath1.size();i++) {
			trowval1[i]=trowpath1.get(i).getText();
		}
		driver.findElement(By.xpath("//button[.='Sort']")).click();
		List<WebElement>trowpath2=driver.findElements(By.xpath("//table[@id='myTable']/tbody/tr/td[1]"));
		String trowval2 []=new String[trowpath1.size()];
		for(int i=0;i<trowpath2.size();i++) {
			trowval2[i]=trowpath2.get(i).getText();
		}
		
		for(String z:trowval1) {
			System.out.println(z);
		}
		System.out.println("--------------------------------");
		for(String z:trowval2) {
			System.out.println(z);
		}
		boolean sortFunctionality = true;
		outer: 
		for(int i=0;i < trowval2.length;i++) {
			for( int j=i+1;j<i;j++) {
				int res=trowval2[j].compareTo(trowval2[i]);
				if(!(res>0)){
					//System.out.println("The Table is not sorted "+trowval2[j]+":::"+trowval2[i]);
					sortFunctionality=false;
					break outer;
					
				}
				else {
					//System.out.println("The Table is sorted "+trowval2[j]+":::"+trowval2[i]);
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
