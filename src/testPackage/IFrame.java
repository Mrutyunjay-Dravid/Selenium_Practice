package testPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IFrame {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\\\Selinium\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_alert");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);

		//WebElement frame = driver.findElement(By.xpath("//iframe[@id= 'iframeResult']"));
		driver.switchTo().frame("iframeResult");
		Thread.sleep(2000);

		WebElement element = driver.findElement(By.xpath("//button[text()= 'Try it']"));
		
		element.click();
		
		driver.switchTo().alert().dismiss();
		
		driver.switchTo().parentFrame();
		WebElement menubutton = driver.findElement(By.xpath("//a[@id= 'menuButton']"));
		menubutton.click();
		
		
	}

}
