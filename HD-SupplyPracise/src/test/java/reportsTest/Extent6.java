package reportsTest;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Extent6 {

	public static void main(String[] args) throws IOException {
		ExtentReports extent=new ExtentReports();
		ExtentSparkReporter spark_all=new ExtentSparkReporter("Extent6All.html");
		ExtentSparkReporter spark_pass=new ExtentSparkReporter("Extent6Pass.html");
		ExtentSparkReporter spark_fail=new ExtentSparkReporter("Extent6fail.html");
		spark_all.filter().statusFilter().as(new Status[]{Status.FAIL,Status.PASS}).apply();
		spark_pass.filter().statusFilter().as(new Status[]{Status.PASS}).apply();
		spark_fail.filter().statusFilter().as(new Status[]{Status.FAIL}).apply();
		extent.attachReporter(spark_all,spark_pass,spark_fail);
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
		Desktop.getDesktop().browse(new File("extent6All.html").toURI());
		Desktop.getDesktop().browse(new File("extent6pass.html").toURI());
		Desktop.getDesktop().browse(new File("extent6fail.html").toURI());
		

	}

}
