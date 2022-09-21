package testPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPath {

	
	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","D:\\Selinium\\chromedriver_win32\\chromedriver.exe" );
	
	WebDriver driver = new ChromeDriver();
	
	driver.navigate().to("https://www.facebook.com/");
	
	//XPath by attribute
	WebElement username = driver.findElement(By.xpath("//input[@name = 'email']"));
	username.sendKeys("mrutyunjaydravid44@gmail.com");
	WebElement password = driver.findElement(By.xpath("//input[@name = 'pass']"));
	password.sendKeys("@512MJLori");
	 
	Thread.sleep(2000);
	//XPath by text function
//	WebElement Login = driver.findElement(By.xpath("//button[text() = 'Log In']"));
//	Login.click();
	
	//XPath by contains
//	WebElement reels = driver.findElement(By.xpath("//span[contains(text(), 'Reels')]"));
//	reels.click();
	
	
	//XPath by index
	
	//Absolute XPath
//	WebElement search = driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[2]/div[2]/div/div/div/div/div/label/input"));
//	search.click();

	//Relative XPath
	
	//driver.get("https://www.facebook.com/");
	
	//keywords in XPath
	//OR OPERATOR
	WebElement Login = driver.findElement(By.xpath("//button[text() = 'Log In']|//button[@name='login']"));
	Login.click();
	
	//AND OPERATOR
	//WebElement Login = driver.findElement(By.xpath("//button[text() = 'Log In' and @name='login']"));
	//Login.click();
	
}
}
