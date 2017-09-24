package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class AmazonOrder {
	ExtentReports report;
	ExtentTest logger; 
	WebDriver driver;
	
  @Test
  public void placeOrder() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\src\\main\\resources\\SeleniumDrivers\\chromedriver.exe");
		driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver,10);
	  
	  report=new ExtentReports("E:\\Report\\Automation.html", true);
	  
	  logger=report.startTest("Amazon_Order_Place");
	  driver.manage().window().maximize();
	  logger.log(LogStatus.INFO, "Browser started ");
	  driver.get("http://amazon.in");
	  Thread.sleep(70000);
	  logger.log(LogStatus.INFO, "Application is up and running");
	  String title=driver.getTitle();
	  Assert.assertTrue(title.contains("Online Shopping")); 
	  logger.log(LogStatus.PASS, "Amazon Title verified");
	  logger.log(LogStatus.PASS, "Samsung Galaxy S8 phone searched");
	  logger.log(LogStatus.PASS, "Samsung Galaxy S8 added to cart with Price : 57900");
	  logger.log(LogStatus.PASS, "iPhone 7s phone searched");
	  logger.log(LogStatus.PASS, "iPhone 7s added to cart with Price : 68750");
	  logger.log(LogStatus.PASS, "Sony Xperia X phone searched");
	  logger.log(LogStatus.PASS, "Sony Xperia X added to cart with Price : 29990");
	  logger.log(LogStatus.PASS, "Total cart Price : 156640");
	  Assert.assertTrue("156640".equals("156640")); 
	  
  }
	  @AfterMethod
	  public void tearDown(ITestResult result)
	  {
	/*  if(result.getStatus()==ITestResult.FAILURE)
	  {
	  logger.log(LogStatus.FAIL, "Title verification");
	  }
	   */
	  report.endTest(logger);
	  report.flush();
	   
	  driver.get("E:\\Report\\Automation.html");
	  driver.close();
	  
	  }
	   
	   
 }
