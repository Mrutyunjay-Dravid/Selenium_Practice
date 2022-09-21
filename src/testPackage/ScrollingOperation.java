package testPackage;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollingOperation {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\\\Selinium\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://jqueryui.com/");
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
	
	}

}
