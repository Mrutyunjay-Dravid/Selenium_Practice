package testPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class functions {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\Selinium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://www.facebook.com/");
		
		driver.findElement(By.xpath("//a[contains(text(), 'New Account')]")).click();
		Thread.sleep(2000);
		//WebElement CustomRadioButton = driver.findElement(By.xpath("//label[text()='Custom']/following-sibling::input"));
		//CustomRadioButton.click();
		WebElement FirstName = driver.findElement(By.xpath("//input[@name='firstname']"));
		
		
		
		//IsSelected
//		boolean result = CustomRadioButton.isDisplayed();
//		System.out.println(result);
		
		//isDisplayed
		//inEnabled
		//getText
		//getAttribute
		String attributeValue = FirstName.getAttribute("placeholder");
		System.out.println(attributeValue);
		
		//how to operate drop-down menus
		//select by index
		WebElement Day = driver.findElement(By.xpath("//select[@id='day']"));
		Select s = new Select(Day);
		s.selectByIndex(4);
		//select by value
		WebElement Month = driver.findElement(By.xpath("//select[@id='month']"));
		Select s2 = new Select(Month);
		s2.selectByVisibleText("Aug");
		//select by visible text
		WebElement Year = driver.findElement(By.xpath("//select[@id='year']"));
		Select s3 = new Select(Year);
		s3.selectByValue("1993");
		
		
		
		
		
		
	}

}
