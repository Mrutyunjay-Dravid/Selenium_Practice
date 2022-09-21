package PomPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FacebookTestClass {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "D:\\Selinium\\geckodriver-v0.31.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.navigate().to("https://www.facebook.com");
		
		FacebookLogin login = new FacebookLogin(driver);
			login.sendemail();
			login.sendpass();
			login.clickLogin();
			
		
	}

}
