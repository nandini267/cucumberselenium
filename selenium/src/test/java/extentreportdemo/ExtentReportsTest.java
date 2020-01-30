package extentreportdemo;

import java.net.Inet4Address;
import java.text.SimpleDateFormat;
import java.util.Date;


import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.internal.TestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.Markup;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import freemarker.template.SimpleDate;

public class ExtentReportsTest {
	private static final boolean True = false;
	ExtentHtmlReporter htmlreporter;
	ExtentReports extent;
	ExtentTest logger;
	
	WebDriver driver;
	
	@BeforeTest
	public void startReport() throws Exception
	{
		System.out.println(System.getProperty("user.dir"));
		htmlreporter =new ExtentHtmlReporter(System.getProperty("user.dir") +"/extent-reports/"+ new SimpleDateFormat("hh-mm-ss-ms-dd-MM-yyyy").format(new Date())+".html");
		extent =new ExtentReports();
		
		extent.attachReporter(htmlreporter);
		extent.setSystemInfo("Host Name", "GFT NEXTGEN TESTING STREAM");
		extent.setSystemInfo("Environemnt", "Automation Testing-selenium");
		extent.setSystemInfo("User Name", "Nandu");
		
		htmlreporter.config().setDocumentTitle("Reports - Extents -GFT");
		htmlreporter.config().setReportName("Execution Report - Mercury Tours");
		htmlreporter.config().setTheme(Theme.STANDARD);
		
		Inet4Address inet=(Inet4Address) Inet4Address.getLocalHost();
		extent.setSystemInfo("System Host Address", ":"+inet.getHostAddress());
		extent.setSystemInfo("System Host Name", ":"+inet.getHostName());
		System.out.println("Host Address is"+inet.getHostAddress());
		System.out.println("Host Name is"+inet.getHostName());
	}
		
		@Test
		public void passTest()
		{
			logger=extent.createTest("PassTest");
			Assert.assertTrue(true);
			logger.log(Status.PASS, MarkupHelper.createLabel("Test Case Passed is passTest", ExtentColor.GREEN));
			
		}
		@Test
		public void failTest()
		{
			logger=extent.createTest("failTest");
			Assert.assertTrue(false);
		}
		@Test
		public void skipTest()
		{
			logger=extent.createTest("skipTest");
			throw new SkipException("Skipping - This is not ready for testing");
			
		}
		@AfterMethod
		public void getResult(ITestResult result)
		{
			if(result.getStatus()==TestResult.FAILURE)
			{
				logger.log(Status.FAIL, MarkupHelper.createLabel(result.getName()+"-Test case Failed",ExtentColor.RED));
				logger.log(Status.FAIL, MarkupHelper.createLabel(result.getThrowable()+"-Test case Failed",ExtentColor.RED));
				
			}
			else if(result.getStatus()==ITestResult.SKIP)
			{
				logger.log(Status.SKIP, MarkupHelper.createLabel(result.getName()+"-Test case Skipped",ExtentColor.ORANGE));
				
			}
				
		
		
		}
		@AfterTest
			public void endReport()
			{
				extent.flush();
			}
		}


