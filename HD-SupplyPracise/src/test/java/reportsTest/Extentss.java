package reportsTest;

import static org.testng.Assert.fail;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Extentss {
	static WebDriver driver;

	public static void main(String[] args) throws IOException {
		ExtentReports extent=new ExtentReports();
		ExtentSparkReporter spark=new ExtentSparkReporter("extentss.html");
		extent.attachReporter(spark);
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.navigate().to("https://www.primevideo.com/?ref_=dvm_pds_amz_in_as_s_g_brand1&ext_vrnc=hi%7Cc_386559716763_m_lgAX6a65-dc_s_");
		String path=captureScreenshot("amazon.png");
		String Base64Code=captureScreenshot();
		extent.createTest("ss 1","This is first ss")
		.addScreenCaptureFromPath(path);
		Throwable t=new Throwable("new exception");
		extent.createTest("ss 2","Amazon Home")
		.fail(t,MediaEntityBuilder.createScreenCaptureFromPath(path).build());
		extent.createTest("ss 3","Amazon Home")
		.fail(t,MediaEntityBuilder.createScreenCaptureFromBase64String(Base64Code).build());
		extent.flush();
		driver.quit();
		Desktop.getDesktop().browse(new File("extentss.html").toURI());

	}
	public static String captureScreenshot(String fileName) {
		TakesScreenshot takesScreenshot=(TakesScreenshot)driver;
		File SourceFile=takesScreenshot.getScreenshotAs(OutputType.FILE);
		File DestFile=new File("./Screenshot/"+fileName);
		try {
			FileUtils.copyFile(SourceFile, DestFile);
		}catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("ScreenShot Captured");
		return DestFile.getAbsolutePath();	
	}
	public static String captureScreenshot( ) {
		TakesScreenshot takesScreenshot=(TakesScreenshot)driver;
		String Base64Code=takesScreenshot.getScreenshotAs(OutputType.BASE64);
		
		System.out.println("ScreenShot Captured");
		return Base64Code;	
	}

}
