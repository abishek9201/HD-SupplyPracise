package seperate;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ValidatePassword {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.navigate().to("https://accounts.google.com/signup/v2/webcreateaccount?flowName=GlifWebSignIn&flowEntry=SignUp");
		driver.findElement(By.id("firstName")).sendKeys("Tarak");
		driver.findElement(By.id("lastName")).sendKeys("N");
		driver.findElement(By.id("username")).sendKeys("abitarakn250");
		driver.findElement(By.name("Passwd")).sendKeys("12345678");
		driver.findElement(By.name("ConfirmPasswd")).sendKeys("12345678");
		driver.findElement(By.xpath("//span[.='Next']")).click();
		try{
		WebElement error=driver.findElement(By.xpath("//div[@class='OyEIQ uSvLId']//div[2]"));
		String msg=error.getText();
		System.out.print(msg);
		}
		catch(Exception e) {
			WebElement error2=driver.findElement(By.xpath("//div[@jsname='B34EJ'] [@xpath='1']"));
			String msg2=error2.getText();
			System.out.print(msg2);
		}
		finally{
			System.out.println("Done");
		}
		
		driver.close();
		
		

	}

}
