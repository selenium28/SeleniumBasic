package core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShoppingClass {
	static WebDriver driver;

	public static void main(String[] args) {
		String url = "http://automationpractice.com/index.php";  // local (method)

		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();

		driver.switchTo().frame(0);
		
	}

}
