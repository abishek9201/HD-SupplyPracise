package reportsTest;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Extent2 {

	public static void main(String[] args) throws IOException {
		ExtentReports extent=new ExtentReports();
		ExtentSparkReporter spark=new ExtentSparkReporter("extent2.html");
		extent.attachReporter(spark);
		extent.createTest("Test 2.1")
		.log(Status.FAIL, "fail")
		.log(Status.SKIP, "SKIP")
		.log(Status.WARNING, "WARNING")
		.log(Status.PASS, "PASS")
		.log(Status.INFO, "INFO");
		try {
			int i=5/0;
		}
		catch(Exception e) {
			extent.createTest("exception 1")
			.fail(e);
		}
		Throwable t=new Throwable("Customexception");
		extent.createTest("exception 2")
		.fail(t);
		extent.createTest("exception 3")
		.fail(t);
		extent.createTest("Highlighting test")
		.info("<b>This is normal<b>")
		.info(MarkupHelper.createLabel("this text will be highlighted",ExtentColor.RED));
		
		extent.flush();
		Desktop.getDesktop().browse(new File("extent2.html").toURI());
	
		
	}

}
