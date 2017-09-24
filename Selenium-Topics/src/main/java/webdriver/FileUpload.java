package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FileUpload {
public static void main(String[] args) throws InterruptedException{
	System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\src\\main\\resources\\SeleniumDrivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	WebDriverWait wait = new WebDriverWait(driver,10);
	driver.get(System.getProperty("user.dir")+"\\src\\main\\java\\upload.html");
	Thread.sleep(2000);
	driver.findElement(By.id("upld")).sendKeys(System.getProperty("user.dir")+"\\src\\main\\java\\upload.html");
	Thread.sleep(7000);
	System.out.println("File uploaded.");
	driver.close();
}
}
