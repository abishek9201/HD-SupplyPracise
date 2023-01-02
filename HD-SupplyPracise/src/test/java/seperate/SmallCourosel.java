package seperate;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SmallCourosel {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.jiomart.com/?gclid=EAIaIQobChMIu6ChuOGo_AIVR5VLBR22ggJuEAAYASAAEgKbmfD_BwE");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0,950);");
		List<WebElement> all = driver.findElements(By.xpath("//div[@id='sec_2249']//span[@class='clsgetname']"));
		System.out.println(all.size());
		loop: for (int i = 1; i < all.size(); i++) {
			String m = all.get(i).getText();
			if (m.equals("Pepsodent Germicheck Advance Anti-Germ Formula Toothpaste 150 g (Pack of 2)")) {
				System.out.println("-----------------------------------------------");
				System.out.println(m + "-----  Item Found  ");
				System.out.println("-----------------------------------------------");
				break loop;
			} else {
				System.out.println(m);
				String val = driver.findElement(By.xpath("//div[@class='swiper-button-next swipe_next_sec_2249']"))
						.getAttribute("aria-disabled");
				if (val.equals("false")) {
					WebElement next = driver
							.findElement(By.xpath("//div[@class='swiper-button-next swipe_next_sec_2249']"));
					next.click();
				} else {
					continue;
				}

			}
		}
		driver.quit();
	}

}
