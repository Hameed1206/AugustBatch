package test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import base.BaseClass;
import pages.Facebook;
import pages.HomePage;
import pages.IphoneClass;

public class TestExecution1 extends BaseClass{

	ExtentSparkReporter crtreport;
	ExtentReports extent;
	ExtentTest test;
	public TestExecution1() {
		
		crtreport = new ExtentSparkReporter("C:\\Users\\91936\\eclipse-workspace\\TestNextGen\\Reports\\FirstReport.html");
		crtreport.config().setDocumentTitle("Facebook");
		extent = new ExtentReports();
		extent.attachReporter(crtreport);
		
	}
	@DataProvider (name = "amazon")
	public Object[] getData() throws IOException {
		Object[] testData = TestData.testData();
		return testData;
	}
	//@Parameters({"username", "password"})
	//@Test(dataProvider = "amazon")
	public void testMobile(String s1, String s2) throws InterruptedException {
	     Facebook f = new Facebook(driver);
	     f.getUser(s1, s2);
	}
	//@Test(dataProvider = "amazon")
	public void testMobile1(String s1, String s2) throws InterruptedException {
		
	     Facebook f = new Facebook(driver);
	     f.getUser(s1, s2);
	}

	@Test
	public void test() throws InterruptedException, IOException {
		TestExecution1 t = new TestExecution1();
		test = extent.createTest("SignUp");
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		Thread.sleep(2000);
		String title = driver.getTitle();
		System.out.println(title);
		test.addScreenCaptureFromPath(captureScreenshot(), title);
		test.log(Status.PASS, title);
		extent.flush();
	}
	@Test
	public void test1() throws InterruptedException, IOException {
		TestExecution1 t = new TestExecution1();
		test = extent.createTest("SignUp");
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		Thread.sleep(2000);
		String title = driver.getTitle();
		System.out.println(title);
		test.addScreenCaptureFromPath(captureScreenshot(), title);
		test.log(Status.PASS, title);
		extent.flush();
	}
}
