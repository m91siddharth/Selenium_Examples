package webdriver;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageScroll {
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "F:\\work\\SeleniumDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.webex.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		((JavascriptExecutor) driver).executeScript("window.scrollBy(500,0)");
		Thread.sleep(4000);
		System.out.println("Page Scrolled !");
		driver.close();
	}
}
