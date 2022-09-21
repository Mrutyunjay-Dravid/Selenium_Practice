package fiveWebsites;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Netflix {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\Selinium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.netflix.com/in/");
		Thread.sleep(5000);

		WebElement login = driver.findElement(By.xpath("//a[text()= 'Sign In']"));
		login.click();
		
		WebElement username = driver.findElement(By.xpath("//input[@name= 'userLoginId']"));
		username.sendKeys("mrutyunjaydravid44@gmail.com");
		
		WebElement password = driver.findElement(By.xpath("//input[@name= 'password']"));
		password.sendKeys("mangalamalve");
		
		WebElement loginbutton = driver.findElement(By.xpath("//button[text()= 'Sign In']"));
		loginbutton.click();

	}
}
