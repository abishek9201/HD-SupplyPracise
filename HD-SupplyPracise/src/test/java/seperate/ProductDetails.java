package seperate;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ProductDetails {

	public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.navigate().to("https://www.flipkart.com/");
		driver.findElement(By.cssSelector("button[class='_2KpZ6l _2doB4z']")).click();
		driver.findElement(By.name("q")).sendKeys("Horror Story Book");
		Actions act =new Actions(driver);
		act.sendKeys(Keys.ENTER).build().perform();
		String Current=driver.getWindowHandle();
		WebElement Book=driver.findElement(By.xpath("//img[@alt='50 GREATEST HORROR STORIES']"));
		String bName=Book.getAttribute("alt");
		System.out.println(bName);
		File sf= driver.getScreenshotAs(OutputType.FILE);
		File df=new File("./Screenshot/allbookdetails.img");
		FileUtils.copyFile(sf, df);
		File file=new File("bookDetails.txt");
		try(FileWriter fw=new FileWriter(file,true);
				PrintWriter pw=new PrintWriter(fw);){
			pw.println(bName);
		}
		Book.click();
		Set<String>all=driver.getWindowHandles();
		for(String a:all) {
			if(!(a.equals(Current))) {
				driver.switchTo().window(a);
				File sf1= driver.getScreenshotAs(OutputType.FILE);
				File df1=new File("./Screenshot/bookdetails.img");
				FileUtils.copyFile(sf1, df1);
				String highlights=driver.findElement(By.cssSelector("div[class='_2418kt']")).getText();
				System.out.println(highlights);	
				try(FileWriter fw=new FileWriter(file,true);
						PrintWriter pw=new PrintWriter(fw);){
					pw.println(highlights);
				}
				
			}
			
		}
		driver.quit();
		

	}

}
