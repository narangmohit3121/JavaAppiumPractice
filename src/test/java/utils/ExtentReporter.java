package utils;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReporter {
	ExtentReports report;
	@BeforeSuite
	public void reportSetup() {
		ExtentSparkReporter  reporter = new ExtentSparkReporter ("extent.html");
		report = new ExtentReports();
		report.attachReporter(reporter);
		//ExtentTest test = report.createTest("testOne");
	}
	
	@AfterSuite
	public void reportTearDown() {
		report.flush();
	}
}
