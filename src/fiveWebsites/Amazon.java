package fiveWebsites;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Amazon {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\Selinium\\chromedriver_win32\\chromedriver.exe" );
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in");
		
		Actions action = new Actions(driver);
		
		WebElement Account = driver.findElement(By.xpath("//*[@id=\"nav-link-accountList\"]/span"));
		action.moveToElement(Account).perform();
		
		
		WebElement acc = driver.findElement(By.xpath("//span[text()='Your Account']"));
		acc.click();		
		
		driver.navigate().back();
		WebElement search = driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]"));
		search.sendKeys("spiderman");

		WebElement startsearch = driver.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]"));
		startsearch.click();
		
		
		
		
}
}
