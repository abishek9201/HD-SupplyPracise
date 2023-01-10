package reportsTest;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Extent5 {

	public static void main(String[] args) throws IOException {
		ExtentReports extent=new ExtentReports();
		ExtentSparkReporter spark=new ExtentSparkReporter("Extent5.html");
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		//spark.loadJSONConfig(new File("C:\\Users\\kaset\\git\\HD-SupplyPracise\\HD-SupplyPracise\\src\\test\\resources\\extent-reports-config.json"));
		extent.setSystemInfo("os", System.getProperty("os.name"));
		extent.setSystemInfo("java version", System.getProperty("java.version"));
		extent.setSystemInfo("URl","https://www.google.co.in/");
		extent.setSystemInfo("USER NAME", "Abishek");
		extent.setSystemInfo("USER PASSWORD", "123456789");
		extent.setSystemInfo("Browser Name", "Chrome");
		
		spark.config().setTheme(Theme.DARK);
		spark.config().setDocumentTitle("Doc Title");
		spark.config().setReportName("Report Name");
		spark.config().setTimeStampFormat("dd-MM-YYYY hh:mm:ss");
		spark.config().setJs("document.getElementsByClassName('logo')[0].style.display='none';");
		extent.attachReporter(spark);
		extent.createTest("Test 1","Test Desc")
		.assignAuthor("Abi")
		.assignCategory("Smoke")
		.assignDevice("Chrome 99")
		.pass("This test is passed");
	
		extent.createTest("Test 2","Test Desc")
		.assignAuthor(new String[]{"AA","BB","CC"})
		.assignCategory(new String[]{"Sanity","Smoke"})
		.assignDevice("Chrome 99")
		.pass("This test is passed");
		extent.flush();
		driver.quit();
		Desktop.getDesktop().browse(new File("extent5.html").toURI());

	}

}
