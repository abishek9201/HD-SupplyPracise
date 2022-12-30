package seperate;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.SessionId;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SessionsHandling {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		//Session 1
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		System.out.println(driver.getTitle());
		SessionId s = ((RemoteWebDriver) driver).getSessionId();
	    System.out.println("Session Id is: " + s);
	    //Session 2
	    WebDriver driver2=new ChromeDriver();
	    driver2.get("https://www.google.com/");
		System.out.println(driver2.getTitle());
		SessionId s2 = ((RemoteWebDriver) driver2).getSessionId();
	    System.out.println("Session Id is: " + s2);

	}

}
