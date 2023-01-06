package reportsTest;

import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

public class Listeners extends TestListenerAdapter{
	public void onTestStart(ITestResult tr) {
		System.out.println("Test started");
	}
	public void onTestSuccess(ITestResult tr) {
		System.out.println("Test Sucessful");
	}
	public void onTestSkipped(ITestResult tr) {
		System.out.println("Test Skipped");
	}
	public void onTestFailure(ITestResult tr) {
		System.out.println("Test Failure");
	}

}
