package core;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class PraticeClass {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[@title='Log in to your customer account']")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("email_create")).sendKeys("devdubale.aress@gmail.com");
		driver.findElement(By.id("SubmitCreate")).click();
		Thread.sleep(5000);
		try {
			driver.findElement(By.xpath("//input[@id='customer_firstname']//preceding::input[1]")).click();
		} catch (Exception e) {
			System.out.println("Radio button is not clicked");
		}
		
		driver.findElement(By.id("customer_firstname")).sendKeys("12345");


	}

}
