package fiveWebsites;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Instagram {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\Selinium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.instagram.com/");
		
		WebDriverWait wait4Username = new WebDriverWait(driver, Duration.ofSeconds(15));
		wait4Username.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[contains(aria-label,'username']")))
		.sendKeys("xyzabc");
		
		
//		Thread.sleep(5000);
//		//WebElement username = driver.findElement(By.xpath("//input[@name='username']"));
//		WebElement username = driver.findElement(By.xpath("//input[contains(aria-label,'username']"));
//		username.sendKeys("xyzabc");
		
		WebDriverWait wait4password = new WebDriverWait(driver,Duration.ofSeconds(15));
		wait4password.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='password']")))
		.sendKeys("zyx@123");
		
		
//		Thread.sleep(5000);
//		WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
//		password.sendKeys("zyx@123");
		
		
		Thread.sleep(5000);
		WebElement button = driver.findElement(By.xpath("//*[@id='loginForm']/div/div[3]"));
		button.click();
	
			
	}
}
