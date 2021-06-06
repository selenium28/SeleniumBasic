package core;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathExamples {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);

		WebElement userName =  driver.findElement(By.xpath("//input[@name='email']"));
		userName.sendKeys("ACD");
		
		WebElement password = driver.findElement(By.xpath("//input[@name='pass']"));
		password.sendKeys("12345");
		
		Thread.sleep(3000);
		WebElement loginButton = driver.findElement(By.xpath("//button[@name='login']"));
		loginButton.click();

		WebElement forgottenPassword = driver.findElement(By.linkText("Forgotten password?"));
		forgottenPassword.click();

		//		 NoSuchelementException - not found, wrong xpath.

	}

}
