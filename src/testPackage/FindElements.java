package testPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElements {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\\\Selinium\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_alert");
		
		driver.manage().window().maximize();
		Thread.sleep(2000);

		List<WebElement> ElementsList = driver.findElements(By.tagName("a"));
		
		int size= ElementsList.size();
		System.out.println(size);
		
		for(WebElement list : ElementsList ) {
			System.out.println(list.getText());
			}
	
	}

}
