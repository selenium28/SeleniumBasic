package waits;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitClass {

	public static void main(String[] args) {
		//1. Implicit Wait
		//2. Explicit Wait
		//3. Fluent Wait
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		//ImplicitWait - is also called global wait.
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//Explicit Wait - 1st way
		WebDriverWait wait = new WebDriverWait(driver, 20);
		WebElement username = wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//input[@name='pass']"))));
		username.sendKeys("1233");
		//2nd way
		WebElement pass = driver.findElement(By.xpath("//input[@name='pass']"));
		wait.until(ExpectedConditions.visibilityOf(pass));
		pass.sendKeys("1233");
		
		String title = "facebook login";
		
		wait.until(ExpectedConditions.titleContains(title));
		wait.until(ExpectedConditions.titleIs("Facebook login"));
		
		
		driver.findElement(By.id("pass")).sendKeys("1234567");
		WebElement button = driver.findElement(By.name("login"));
		wait.until(ExpectedConditions.elementToBeClickable(button));
		
		//3.Fluent Wait
		Wait<WebDriver> wait1 = new FluentWait<WebDriver>(driver)
				.withTimeout(30, TimeUnit.SECONDS)
				.pollingEvery(5, TimeUnit.SECONDS)
				.ignoring(NoSuchElementException.class);
		
	
	}

}
