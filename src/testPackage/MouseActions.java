package testPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseActions {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","D:\\Selinium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/#Accepted%20Elements");
		
		driver.manage().window().maximize();
		Actions act = new Actions(driver);
		
		//mouse hover
		Thread.sleep(2000);
		WebElement hub = driver.findElement(By.xpath("//*[@id='menu-item-2822']/a"));
		act.moveToElement(hub).perform();	
		
		//frame enter
		Thread.sleep(2000);
		WebElement frame = driver.findElement(By.xpath("//*[@id='post-2669']/div[2]/div/div/div[1]/p/iframe"));
		driver.switchTo().frame(frame); 
		
		//Drag an Drop
		Thread.sleep(2000);
		WebElement dragElement = driver.findElement(By.xpath("//*[@id='gallery']/li[2]/img"));
		WebElement dest = driver.findElement(By.xpath("//*[@id='trash']"));
		act.dragAndDrop(dragElement, dest).perform();			
		
		//Right click
		act.contextClick().perform();
		//driver.switchTo().parentFrame();
		
//		WebElement frame1 = driver.findElement(By.xpath("//*[@id='google_esf']"));
//		driver.switchTo().frame(frame1);
		
		
		//*[@id="menu-item-2822"]/a

		
		//*[@id="google_esf"]
		
		
		
		
	}

}
