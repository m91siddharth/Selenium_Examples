package webdriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Tables {
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\src\\main\\resources\\SeleniumDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver,10);
		driver.get(System.getProperty("user.dir")+"\\src\\main\\java\\tables.html");
		Thread.sleep(2000);
		List <WebElement> col = driver.findElements(By.xpath("/html/body/table/tbody/tr"));
		System.out.println("No of rows are : " +col.size()); 
		//No.of rows 
		List <WebElement> rows = driver.findElements(By.xpath("/html/body/table/tbody/tr/td")); 
		System.out.println("No of cells are : " + rows.size());

		driver.findElement(By.xpath("/html/body/table/tbody/tr[2]/td[1]/a")).click();
		
		Thread.sleep(3000);
		
		System.out.println("Accessed table elements.");
		driver.close();
	}
}
