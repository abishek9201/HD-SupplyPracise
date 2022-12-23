package seperate;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Xpaths {
	JavascriptExecutor js;
	WebDriver driver;

	@BeforeMethod
	public void beforeMethod() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		js = (JavascriptExecutor) driver;
		driver.manage().window().maximize();

	}

	@Test
	public void test1() throws InterruptedException {
		driver.navigate().to("https://www.gsmarena.com/vivo_v20-10435.php");
		// trying different xpaths using identifiers
		highlight(driver.findElement(By.xpath("//a[@id='switch-version']")));
		highlight(driver.findElement(By.xpath("//a[text()='GSMArena.com']")));
		highlight(driver.findElement(By.xpath("//a[text()='Features'][@href='glossary.php3?term=camera']")));
		Thread.sleep(2000);
	}

	@Test
	public void test2() throws InterruptedException {
		driver.navigate().to("https://www.gsmarena.com/vivo_v20-10435.php");
		// trying xpath operators
		highlight(driver.findElement(By.xpath("//th[@rowspan=15]")));
		highlight(driver.findElement(By.xpath("//th[@rowspan!=15]")));
		highlight(driver.findElement(By.xpath("//th[@rowspan>=15]")));
		highlight(driver.findElement(By.xpath("//th[@rowspan<=15]")));
		highlight(driver.findElement(By.xpath("//th[@rowspan>14]")));
		highlight(driver.findElement(By.xpath("//th[@rowspan<15]")));
		Thread.sleep(2000);
	}

	@Test
	public void test3() {
		driver.navigate().to("https://www.gsmarena.com/vivo_v20-10435.php");
		// trying xpath conditions
		highlight(driver.findElement(By.xpath("//a[text()='Features' and @href='glossary.php3?term=camera']")));
		highlight(driver.findElement(By.xpath("//a[text()='Features' or @href='glossary.php3?term=camera']")));
		highlight(driver.findElement(By.xpath("//a[not(text()='Features') and @href='glossary.php3?term=camera']")));
	}

	@Test
	public void test4() {
		driver.navigate().to("https://www.w3schools.com/html/html_tables.asp");
		// trying xpath index
		highlight(driver.findElement(By.xpath("//table[@id='customers']/tbody/tr/th[1]")));
		highlight(driver.findElement(By.xpath("(//table[@id='customers']/tbody/tr/td)[5]")));
		highlight(driver.findElement(By.xpath("(//table[@id='customers']/tbody/tr/td)[1]")));
	}

	@Test
	public void test5() {
		driver.navigate().to("https://www.gsmarena.com/vivo_v20-10435.php");
		// trying xpath functions
		highlight(driver.findElement(By.xpath("//li[text()='Anonymous']")));
		highlight(driver.findElement(By.xpath("//li[contains(text(),'Anony')]")));
		highlight(driver.findElement(By.xpath("( //div[contains(@class,'article-info-line')])[1]")));
		highlight(driver.findElement(By.xpath("//td[starts-with(text(),'Qualcomm SM7125')]")));
		highlight(driver.findElement(By.xpath("//div[starts-with(@class,'module reviews')]")));
		highlight(driver.findElement(By.xpath("(//table[@cellspacing='0']/tbody/tr)[last()]")));
		highlight(driver.findElement(By.xpath("(//table[@cellspacing='0']/tbody/tr)[position()=46]")));		
	}
	@Test
	public void test6() {
		driver.navigate().to("https://www.w3schools.com/html/html_tables.asp");
		//trying xpath axes
		highlight(driver.findElement(By.xpath("//th[text()='Country']/preceding-sibling::th[text()='Contact']")));
		highlight(driver.findElement(By.xpath("//th[text()='Contact']/following-sibling::th")));
		highlight(driver.findElement(By.xpath("//td[text()='Island Trading']/following-sibling::td[2]")));
		highlight(driver.findElement(By.xpath("//tbody/parent::table[@id='customers']")));
		highlight(driver.findElement(By.xpath("//table[@class='ws-table-all notranslate']/child::tbody/tr[3]/child::td[1]")));
		
	}

	public void highlight(WebElement element) {
		js.executeScript("arguments[0].style.background=\"yellow\"", element);
	}

	@AfterMethod
	public void afterMethod() {
		driver.close();
	}

}
