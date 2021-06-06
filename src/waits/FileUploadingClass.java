package waits;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadingClass {

	public static void main(String[] args) {
		String url = "http://demo.guru99.com/test/upload/";
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
//		WebElement filechoose = driver.findElement(By.id("uploadfile_0"));
//		filechoose.sendKeys("C:\\Users\\devid\\OneDrive\\Documents\\FileUpload.txt");
//		
//		WebElement checkbox= driver.findElement(By.id("terms"));
//		checkbox.click();
//		
//		driver.findElement(By.id("submitbutton")).click();
		
		String title = driver.getTitle();
		System.out.println(title);
		
		String currenturl = driver.getCurrentUrl();
		System.out.println("Current url "+currenturl);

	}

}
