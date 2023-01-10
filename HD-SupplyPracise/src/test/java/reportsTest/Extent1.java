package reportsTest;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Extent1 {

	public static void main(String[] args) throws IOException {
		ExtentReports extent=new ExtentReports();
		ExtentSparkReporter spark=new ExtentSparkReporter("extent1.html");
		extent.attachReporter(spark);
		ExtentTest test1=extent.createTest("Test1");
		test1.pass("Test case is passed");
		ExtentTest test2=extent.createTest("Test2");
		test2.log(Status.FAIL,"Test case 2 is failed");
		extent.createTest("Test3").log(Status.FAIL,"Test case 2 is failed");
		extent.flush();
		Desktop.getDesktop().browse(new File ("extent1.html").toURI());
		

	}

}
