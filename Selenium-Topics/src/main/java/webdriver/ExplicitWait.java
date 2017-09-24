package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "F:\\work\\SeleniumDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver,10);
		driver.get("http://newtours.demoaut.com/");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("CONTACT")));
		System.out.println("clicked on contact link.");
		driver.close();
	}

}
