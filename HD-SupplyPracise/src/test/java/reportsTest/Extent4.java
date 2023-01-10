package reportsTest;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class Extent4 {

	public static void main(String[] args) throws IOException {
		ExtentReports extent=new ExtentReports();
		ExtentSparkReporter spark=new ExtentSparkReporter("Extent4.html");
		spark.loadJSONConfig(new File("C:\\Users\\kaset\\git\\HD-SupplyPracise\\HD-SupplyPracise\\src\\test\\resources\\extent-reports-config.json"));
		/*spark.config().setTheme(Theme.DARK);
		spark.config().setDocumentTitle("Doc Title");
		spark.config().setReportName("Report Name");
		spark.config().setTimeStampFormat("dd-MM-YYYY hh:mm:ss");
		spark.config().setJs("document.getElementsByClassName('logo')[0].style.display='none';");*/
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
		Desktop.getDesktop().browse(new File("extent4.html").toURI());

	}

}
