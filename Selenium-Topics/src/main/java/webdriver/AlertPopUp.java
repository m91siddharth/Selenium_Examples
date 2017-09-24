package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertPopUp {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\src\\main\\resources\\SeleniumDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver,10);
		driver.get(System.getProperty("user.dir")+"\\src\\main\\java\\popup.html");
		Thread.sleep(2000);
		WebElement webElement = driver.findElement(By.xpath(""));
		driver.switchTo().alert().accept();
		
		driver.switchTo().frame(webElement);
		String webElementStr = null;
		// using frame tag in html
		driver.switchTo().window(webElementStr);
		
		//driver.switchTo().alert().dismiss();
		System.out.println("clicked on pop up button.");
		driver.close();
	}

}
