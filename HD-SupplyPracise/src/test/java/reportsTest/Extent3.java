package reportsTest;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Extent3 {

	public static void main(String[] args) throws IOException {
		ExtentReports extent=new ExtentReports();
		ExtentSparkReporter spark=new ExtentSparkReporter("Extent3.html");
		extent.attachReporter(spark);
		extent.createTest("Test 1","Test Desc")
		.assignAuthor("Abi")
		.assignCategory("Smoke")
		.assignDevice("Chrome 99")
		.pass("This test is passed");
		extent.createTest("Test 2","Test Desc")
		.assignAuthor("Abi")
		.assignCategory("Sanity")
		.assignDevice("Chrome 99")
		.fail("This test is failed");
		extent.createTest("Test 3","Test Desc")
		.assignAuthor("Amma")
		.assignCategory("Sanity")
		.assignDevice("Chrome 99")
		.pass("This test is passed");
		extent.createTest("Test 4","Test Desc")
		.assignAuthor(new String[]{"AA","BB","CC"})
		.assignCategory(new String[]{"Sanity","Smoke"})
		.assignDevice("Chrome 99")
		.pass("This test is passed");
		extent.flush();
		Desktop.getDesktop().browse(new File("extent3.html").toURI());
		
		
		
	}

}
