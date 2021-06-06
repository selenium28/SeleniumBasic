package core;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumConcepts {  // Class body

	public static void main(String[] args) {   // Method body 
		// TODO Auto-generated method stub    // comments
		
		String currentTitle = "Facebook";
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("email")).sendKeys("ABCD123");
		driver.findElement(By.name("pass")).sendKeys("12345");
		
		String Exptitle = driver.getTitle();
		
		if(Exptitle.equals(currentTitle)) {
			System.out.println("Test Pass");
		}else
		{
			System.out.println("Test Failed");
		}
		
//		System.out.println("Expected Title:- " +Exptitle);
//		System.out.println("Current Title:- " +currentTitle);	
		driver.quit();
	}

}
