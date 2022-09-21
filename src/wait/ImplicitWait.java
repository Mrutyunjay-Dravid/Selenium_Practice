package wait;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ImplicitWait {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "D:\\Selinium\\geckodriver-v0.31.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://instagram.com");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement username = driver.findElement(By.xpath("//input[@name= 'username']"));
		username.sendKeys("harry");
		
		
		
		
		
		
	}
	
	

}
