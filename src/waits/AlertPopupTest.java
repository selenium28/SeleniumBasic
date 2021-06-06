package waits;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopupTest {

	public static void main(String[] args) {
		String url = "http://demo.guru99.com/test/delete_customer.php";

		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();    
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.findElement(By.name("cusid")).sendKeys("12345");
		driver.findElement(By.name("submit")).click();
		
		Alert alert = driver.switchTo().alert();
		String alertmsg = driver.switchTo().alert().getText();
		System.out.println("alert popup msg "  +alertmsg);
//		alert.accept();
		alert.dismiss();
		

	}

}
