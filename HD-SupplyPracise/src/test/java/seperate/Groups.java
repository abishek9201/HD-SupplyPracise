package seperate;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Groups {
	
	@Test(groups={"states"})
	public void s1() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("Andhra Pradesh");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		System.out.println("states");
		System.out.println(driver.getTitle());
		driver.quit();
	}
	@Test(groups={"states"})
	public void s2() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("Telangana");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		System.out.println("states");
		System.out.println(driver.getTitle());
		driver.quit();
	}
	@Test(groups={"states","city"},dependsOnGroups="town",alwaysRun=true)
	public void s3() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("Tamilnadu");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		System.out.println("states");
		System.out.println(driver.getTitle());
		driver.navigate().back();
		Thread.sleep(1000);
		driver.findElement(By.name("q")).sendKeys("chennai");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		System.out.println("states and city");
		System.out.println(driver.getTitle());
		driver.quit();
	}
	@Test(groups={"city"},dependsOnGroups="town",alwaysRun=true)
	public void c1() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("hyderbad");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		System.out.println(" city");
		System.out.println(driver.getTitle());
		driver.quit();
	}
	@Test(groups={"city"},dependsOnGroups="town",alwaysRun=true)
	public void c2() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("vizak");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		System.out.println(" city");
		System.out.println(driver.getTitle());
		driver.quit();
	}
	@Test(groups={"city","states"},dependsOnGroups="town",alwaysRun=true)
	public void c3() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("delhi");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		System.out.println("states and city");
		System.out.println(driver.getTitle());
		driver.quit();
	}
	@Test(groups= {"town"})
	public void t1() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("tirupathi");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		System.out.println("towns");
		System.out.println(driver.getTitle());
		driver.quit();
		
	}
	@Test(groups= {"town"})
	public void t2() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("ananthapur");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		System.out.println("towns");
		System.out.println(driver.getTitle());
		driver.quit();
		
	}
	@Test(groups= {"town"},alwaysRun=true)
	public void t3() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.google.com/");
		driver.findElement(By.name("")).sendKeys("kadapa");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		System.out.println("towns");
		System.out.println(driver.getTitle());
		driver.quit();
		
	}
	
	
}
