package wait;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {
public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "D:\\Selinium\\geckodriver-v0.31.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");
		
		WebElement alert = driver.findElement(By.xpath("//button[@id='alert']"));
		alert.click();
		
		//Explicit wait for alert
		WebDriverWait wait4alert = new WebDriverWait(driver,Duration.ofSeconds(10)); 
		wait4alert.until(ExpectedConditions.alertIsPresent()).dismiss();
		
		
		//Explicit wait for text to get displayed
		WebElement site = driver.findElement(By.xpath("//button[text()='Change Text to Selenium Webdriver']"));
		site.click();
		WebDriverWait wait4site = new WebDriverWait(driver,Duration.ofSeconds(15));
		wait4site.until(ExpectedConditions.textToBe(By.xpath("//h2[@id='h2']"), "site"));
		WebElement siteOutput = driver.findElement(By.xpath("//h2[@id='h2']"));
		System.out.println(siteOutput.getText());
		
		//Explicit wait for button to get displayed
		WebElement button = driver.findElement(By.xpath("//button[@id='display-other-button']"));
		button.click();
		
		//WebElement hiddenbutton = driver.findElement(By.xpath("//button[@id='hidden']"));
		
		WebElement button2 = driver.findElement(By.xpath("//button[@id='enable-button']"));
		button2.click();
		
		

		

		
	}

}
