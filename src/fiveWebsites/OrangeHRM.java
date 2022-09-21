package fiveWebsites;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class OrangeHRM {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Selinium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		//Actions action = new Actions(driver);
		Thread.sleep(2000);
		WebElement username = driver.findElement(By.xpath("//input[@name='username']"));
		username.sendKeys("Admin");
		Thread.sleep(2000);

		WebElement pass = driver.findElement(By.xpath("//input[@name='password']"));
		pass.sendKeys("admin123");
		Thread.sleep(2000);

		WebElement button = driver.findElement(By.xpath("//button[text()=' Login ']"));
		button.click();
	}
	
}
