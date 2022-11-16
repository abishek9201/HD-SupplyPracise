package pages;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


public class CricBuzzTest {
	WebDriver driver;
	CricBuzzPage cbp;
	@BeforeTest
	public void beforetest() {
		  WebDriverManager.chromedriver().setup();
		  driver=new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		  cbp=new CricBuzzPage(driver);
		  cbp.url("https://www.cricbuzz.com/");
	}
	@Test(priority=1,enabled=false)
	public void validateMcricbuzz() {
		cbp.clickElement(cbp.Mcricbuzz);
		String Title=cbp.geturl();
		System.out.println(Title);
		Assert.assertEquals(Title,"https://m.cricbuzz.com/");
		cbp.Back();
	}	
	@Test(priority=2,enabled=false)
	public void validateCareers() throws InterruptedException {
		String Title1=cbp.geturl();
		System.out.println(Title1);
		cbp.clickElement(cbp.Careers);
		Thread.sleep(3000);
		String Title=cbp.geturl();
		System.out.println(Title);
		Assert.assertEquals(Title,"https://www.cricbuzz.com/careers");
		cbp.Back();
	}
	@Test(priority=3,enabled=false)
	public void validateAdvertise() {
		cbp.clickElement(cbp.Advertise);
		String Title=cbp.geturl();
		System.out.println(Title);
		Assert.assertEquals(Title,"https://www.cricbuzz.com/info/advertise");
		cbp.Back();
	}
	@Test(priority=4,enabled=false)
	public void validatePrivacyPolicy() {
		cbp.clickElement(cbp.PrivacyPolicy);
		String Title=cbp.geturl();
		System.out.println(Title);
		Assert.assertEquals(Title,"https://www.cricbuzz.com/info/privacy");
		cbp.Back();
	}
	@Test(priority=5,enabled=false)
	public void validateTerms() {
		cbp.clickElement(cbp.Terms);
		String Title=cbp.geturl();
		System.out.println(Title);
		Assert.assertEquals(Title,"https://www.cricbuzz.com/info/termsofuse");
		cbp.Back();
	}
	@Test(priority=6,enabled=false)
	public void validateTvAds() {
		cbp.clickElement(cbp.TvAds);
		String Title=cbp.geturl();
		System.out.println(Title);
		Assert.assertEquals(Title,"https://www.cricbuzz.com/product-blog/cricbuzz-mobile-apps-tv-ad-cricket-ka-keeda");
		cbp.Back();
	}
	@Test(priority=7,enabled=false)
	public void validateScore() {
		cbp.clickElement(cbp.score);
		String Title=cbp.geturl();
		System.out.println(Title);
		Assert.assertEquals(Title,"https://www.cricbuzz.com/cricket-match/live-scores");
		//cbp.Back();
	}
	@Test(priority=8,enabled=false)
	public void validateSchedule() {
		cbp.clickElement(cbp.Schedule);
		String Title=cbp.geturl();
		System.out.println(Title);
		Assert.assertEquals(Title,"https://www.cricbuzz.com/cricket-schedule/upcoming-series/international");
		//cbp.Back();
	}
	@Test(priority=9,enabled=false)
	public void validateArchive() {
		cbp.clickElement(cbp.Archives);
		String Title=cbp.geturl();
		System.out.println(Title);
		Assert.assertEquals(Title,"https://www.cricbuzz.com/cricket-scorecard-archives");
		//cbp.Back();
	}
	@Test(priority=10,enabled=false)
	public void validateNews() {
		cbp.clickElement(cbp.News);
		String Title=cbp.geturl();
		System.out.println(Title);
		Assert.assertEquals(Title,"https://www.cricbuzz.com/cricket-news");
		//cbp.Back();
	}
	@Test(priority=11,enabled=false)
	public void validateSeries() {
		cbp.clickElement(cbp.Series);
		String Title=cbp.geturl();
		System.out.println(Title);
		Assert.assertEquals(Title,"https://www.cricbuzz.com/cricket-schedule/series");
		//cbp.Back();
	}
	@Test(priority=12,enabled=false)
	public void validateTeams() {
		cbp.clickElement(cbp.Teams);
		String Title=cbp.geturl();
		System.out.println(Title);
		Assert.assertEquals(Title,"https://www.cricbuzz.com/cricket-team");
		//cbp.Back();
	}
	@Test(priority=13,enabled=false)
	public void validateVideos() {
		cbp.clickElement(cbp.Videos);
		String Title=cbp.geturl();
		System.out.println(Title);
		Assert.assertEquals(Title,"https://www.cricbuzz.com/cricket-videos");
		//cbp.Back();
	}
	@Test(priority=14,enabled=false)
	public void ValidateFacebook() {
		String h1=driver.getWindowHandle();
		cbp.clickElement(cbp.Facebook);
		Set<String > h2=driver.getWindowHandles();
		for (String a:h2) {
		if (!(h1.equals(a))) {
			driver.switchTo().window(a);
			String Title=cbp.geturl();
			System.out.println(Title);
		}
		}
		String Title=cbp.geturl();
		System.out.println(Title);
		Assert.assertEquals(Title,"https://www.facebook.com/cricbuzz");	
		driver.close();
		driver.switchTo().window(h1);
	}
	
	@Test(priority=15,enabled=false)
	public void ValidateYoutube() {
		String h1=driver.getWindowHandle();
		cbp.clickElement(cbp.Youtube);
		Set<String > h2=driver.getWindowHandles();
		for (String a:h2) {
		if (!(h1.equals(a))) {
			driver.switchTo().window(a);
			String Title=cbp.geturl();
			System.out.println(Title);
			
		}
		}
		String Title=cbp.geturl();
		System.out.println(Title);
		Assert.assertEquals(Title,"https://www.youtube.com/channel/UCSRQXk5yErn4e14vN76upOw");	
		driver.close();
		driver.switchTo().window(h1);
	}
	
	@Test(priority=16,enabled=false)
	public void ValidateTwitter() {
		String h1=driver.getWindowHandle();
		cbp.clickElement(cbp.Twitter);
		Set<String > h2=driver.getWindowHandles();
		for (String a:h2) {
		if (!(h1.equals(a))) {
			driver.switchTo().window(a);
			String Title=cbp.geturl();
			System.out.println(Title);
		}
		}
		String Title=cbp.geturl();
		System.out.println(Title);
		Assert.assertEquals(Title,"https://twitter.com/cricbuzz");	
		driver.close();
		driver.switchTo().window(h1);
	}
	
	@Test(priority=17,enabled=false)
	public void ValidatePintrest() {
		String h1=driver.getWindowHandle();
		cbp.clickElement(cbp.Pinterest);
		Set<String > h2=driver.getWindowHandles();
		for (String a:h2) {
		if (!(h1.equals(a))) {
			driver.switchTo().window(a);
			String Title=cbp.geturl();
			System.out.println(Title);
		}
		}
		String Title=cbp.geturl();
		System.out.println(Title);
		Assert.assertEquals(Title,"https://in.pinterest.com/cricbuzz/");
		driver.close();
		driver.switchTo().window(h1);
	}
	@Test(priority=18,dataProvider="testLinks")
	public void validateAll(By Element,String com){
		cbp.validate(Element, com);
	}
	@DataProvider(name="testLinks")
	public Object[][] TestLinks(){
		Object[][] data=new Object[13][2];
		data[0][0]=cbp.Mcricbuzz;
		data[0][1]="https://m.cricbuzz.com/";
		data[1][0]=cbp.Careers;
		data[1][1]="https://www.cricbuzz.com/careers";	
		data[2][0]=cbp.Advertise;
		data[2][1]="https://www.cricbuzz.com/info/advertise";
		data[3][0]=cbp.PrivacyPolicy;
		data[3][1]="https://www.cricbuzz.com/info/privacy";
		data[4][0]=cbp.Terms;
		data[4][1]="https://www.cricbuzz.com/info/termsofuse";
		data[5][0]=cbp.TvAds;
		data[5][1]="https://www.cricbuzz.com/product-blog/cricbuzz-mobile-apps-tv-ad-cricket-ka-keeda";
		data[6][0]=cbp.score;
		data[6][1]="https://www.cricbuzz.com/cricket-match/live-scores";
		data[7][0]=cbp.Schedule;
		data[7][1]="https://www.cricbuzz.com/cricket-schedule/upcoming-series/international";
		data[8][0]=cbp.Archives;
		data[8][1]="https://www.cricbuzz.com/cricket-scorecard-archives";
		data[9][0]=cbp.News;
		data[9][1]="https://www.cricbuzz.com/cricket-news";
		data[10][0]=cbp.Series;
		data[10][1]="https://www.cricbuzz.com/cricket-schedule/series";
		data[11][0]=cbp.Teams;
		data[11][1]="https://www.cricbuzz.com/cricket-team";
		data[12][0]=cbp.Videos;
		data[12][1]="https://www.cricbuzz.com/cricket-videos";
		

		return data;	
		
	}
	@DataProvider(name="switchLinks")
	public Object[][] socialMedia(){
		Object[][] data=new Object[4][2];
		data[0][0]=cbp.Facebook;
		data[0][1]="https://www.facebook.com/cricbuzz";
		data[1][0]=cbp.Twitter;
		data[1][1]="https://twitter.com/cricbuzz";	
		data[2][0]=cbp.Youtube;
		data[2][1]="https://www.youtube.com/channel/UCSRQXk5yErn4e14vN76upOw";
		data[3][0]=cbp.Pinterest;
		data[3][1]="https://in.pinterest.com/cricbuzz/";
		
		return data;
		
	}
	@Test(dataProvider="switchLinks")
	public void SocialHandles(By ab,String bc) {
		cbp.ValidateSwitch(ab,bc);
	}
	@AfterTest
	public void aftertest() {
		driver.close();
		System.out.println("Done....");
	}
	
}
