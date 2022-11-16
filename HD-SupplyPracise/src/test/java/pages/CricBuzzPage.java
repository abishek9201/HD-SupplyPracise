package pages;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class CricBuzzPage {
	WebDriver driver;
	//locators
	public By Mcricbuzz=By.xpath("//span[.='m.cricbuzz.com']");
	//public By Careers=By.xpath("//li[.='Careers']");
	public By Careers=By.cssSelector("li[class='cb-ftr-lst'] a[title='Careers']");
	public By Advertise=By.cssSelector("a[title='Advertise']");
	public By PrivacyPolicy=By.cssSelector("a[title='Privacy Policy']");
	public By Terms=By.cssSelector("a[title='Terms of Use']");
	public By TvAds=By.cssSelector("a[title='Cricbuzz TV Ads']");
	public By score=By.cssSelector("a[title='Live Cricket Score']");
	public By Schedule=By.cssSelector("a[title='Cricket Schedule']");
	public By Archives=By.cssSelector("a[title='Cricket Scorecard Archives']");
	public By News=By.xpath("//a[.='News']");
	public By Series=By.xpath("//a[.='Series']");
	public By Teams=By.xpath("//a[.='Teams']");
	public By Videos=By.xpath("//a[.='Videos']");
	public By Rankings=By.xpath("//a[.='Rankings']");
	public By Facebook=By.linkText("facebook");
	public By Twitter=By.linkText("twitter");
	public By Youtube=By.linkText("youtube");
	public By Pinterest=By.linkText("Pinterest");
	//constructor
	public CricBuzzPage(WebDriver driver) {
		this.driver=driver;
	}
	public String geturl() {
		return driver.getCurrentUrl();
	}
	public void clickElement(By ab) {
		driver.findElement(ab).click();
	}
	public void Back() {
	driver.navigate().back();	
	}
	public void url(String url) {
		driver.navigate().to(url);
	}
	public void scroll(int a,int b) {
		JavascriptExecutor js = (JavascriptExecutor) driver;  
		js.executeScript("window.scrollBy(a,b)", "");
		
	}
	public void validate(By element,String exceptedTitle ) {
		clickElement(element);
		String Title=geturl();
		System.out.println(Title);
		Assert.assertEquals(Title,exceptedTitle);
		Back();
		
	}
	public void ValidateSwitch(By ele,String compare) {
		String h1=driver.getWindowHandle();
		clickElement(ele);
		Set<String > h2=driver.getWindowHandles();
		for (String a:h2) {
		if (!(h1.equals(a))) {
			driver.switchTo().window(a);
			String Title=geturl();
			System.out.println(Title);
		}
		}
		String Title=geturl();
		System.out.println(Title);
		Assert.assertEquals(Title,compare);
		driver.close();
		driver.switchTo().window(h1);
	}
	
	

}
