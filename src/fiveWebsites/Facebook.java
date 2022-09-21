package fiveWebsites;

import java.io.File;
import java.io.IOException;
import java.sql.Time;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;
import java.util.*;

public class Facebook{
	
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver","D:\\Selinium\\chromedriver_win32\\chromedriver.exe" );
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		/*WebElement username = driver.findElement(By.xpath("//input[@name = 'email']"));
		username.sendKeys("mrutyunjaydravid44@gmail.com");
		
		WebElement password = driver.findElement(By.xpath("//input[@name = 'pass']"));
		password.sendKeys("mangalamalve");
		
		WebElement button = driver.findElement(By.xpath("//button[@name='login']"));
		button.click();
		*/
		
		driver.findElement(By.xpath("//a[contains(text(), 'New Account')]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Harry");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Potter");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("griffindor@gmail.com");
		driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']")).sendKeys("griffindor@gmail.com");

		
		driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("cursedchild");
		driver.findElement(By.xpath("//label[text()='Male']")).click();
		
		Thread.sleep(2000);
		
		//how to operate drop-down menus
				//select by index
				WebElement Day = driver.findElement(By.xpath("//select[@id='day']"));
				Select s = new Select(Day);
				s.selectByIndex(4);
				//select by value
				WebElement Month = driver.findElement(By.xpath("//select[@id='month']"));
				Select s2 = new Select(Month);
				s2.selectByValue("8");
				//select by visible text
				WebElement Year = driver.findElement(By.xpath("//select[@id='year']"));
				Select s3 = new Select(Year);
				s3.selectByVisibleText("1993");
				ss(driver);						//calling ss method
				
				Thread.sleep(2000);
				
				s.selectByIndex(11);
				s2.selectByValue("11");
				s3.selectByVisibleText("1993");
				ss(driver);						//calling ss metho
				
				
	}
			//ScreenShot method	
			public static void ss(WebDriver driver) throws IOException 
			{
				DateTimeFormatter time = DateTimeFormatter.ofPattern("yyyy.MM.dd_HH.mm.ss");
				LocalDateTime now = LocalDateTime.now(); 
				String dtf = (time.format(now));
				
				File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				File destination = new File("D:\\Selinium\\Practice SS\\Test"+dtf+".jpg");
				FileHandler.copy(source, destination);
				
			}

}
