package seperate;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CouroselHandling {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.noon.com/uae-en/");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		// js.executeScript("window.scrollBy(0,500);");
		js.executeScript("window.scrollTo(0,500);");
		js.executeScript("arguments[0].scrollIntoView();",
				driver.findElement(By.xpath("//p[text()='Reach out to us through any of these support channels']")));
		WebElement id = driver.findElement(By.xpath("//h3[@class='sc-crXcEl huSRPQ'][text()='Recommended for you']"));
		js.executeScript("arguments[0].scrollIntoView();", id);
		System.out.println(id.getText());
		List<WebElement> AllItems = driver.findElements(By.xpath("//div[@data-qa='product-name']"));
		loop: for (WebElement i : AllItems) {
			String match = i.getAttribute("title");
			if (match.equals("Rockstar Games Grand Theft Auto V - (Intl Version) - Action & Shooter - PS4/PS5 ")) {
				i.click();
				System.out.println("-----------------------------------------------");
				System.out.println(match + "Item Found");
				System.out.println("-----------------------------------------------");
				break loop;
			} else {
				try {
					System.out.println(i.getAttribute("title"));
					// driver.findElement(By.xpath("//div[@class='swiper-button-next
					// custom-navigation swiper-nav-1672650309445']")).click();
				} catch (Exception e) {
					System.out.println("not in th list");
				}
			}
		}

		driver.quit();

	}

}
