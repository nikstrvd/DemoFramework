package com.wellnessy.reports;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.util.Objects;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.wellnessy.constant.FrameworkConstants;

public final class ExtentReport {

	
	private ExtentReport()
	{
		
	}
	private static ExtentReports extent;
	public static ExtentTest test;
	
	public static void initReports() throws Exception
	{
		if(Objects.isNull(extent))
		{
		extent = new ExtentReports();
		ExtentSparkReporter spark = new ExtentSparkReporter(FrameworkConstants.getExtentReportFilePath());	
		extent.attachReporter(spark);
		spark.config().setTheme(Theme.DARK);
		spark.config().setDocumentTitle("CXInsight");
		spark.config().setReportName("CXInsight Automation Testing");
		extent.setSystemInfo("Executed on OS: ", System.getProperty("os.name"));
		extent.setSystemInfo("Executed by User: ", System.getProperty("user.name"));
		}
	}
	
	public static void flushReports() throws Exception
	{
		if(Objects.nonNull(extent))
		{
		extent.flush();
		}
		ExtentManager.unload();
		Desktop.getDesktop().browse(new File(FrameworkConstants.getExtentReportFilePath()).toURI());
	}
	
	public static void createTest(String testcasename)
	{
		ExtentTest test = extent.createTest(testcasename);
		ExtentManager.setExtenetTest(test);
	}
}
