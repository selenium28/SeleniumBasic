package core;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownClass {
	static WebDriver driver;   // Class level

	public static void main(String[] args) throws InterruptedException {

		String url = "http://demo.guru99.com/test/newtours/register.php";  // local (method)

		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
//		Thread.sleep(3000);
//		teardown();
		
		WebElement countryDropdown = driver.findElement(By.name("country"));
		
		Select country = new Select(countryDropdown);
//		country.selectByIndex(3);  
//		country.selectByValue("ANDORRA");
		country.selectByVisibleText("INDIA");

	}

	public static void teardown() {
		driver.quit();
	}

}
