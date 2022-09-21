package PomPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FacebookLogin {
	
	
		@FindBy (xpath = "//input[@id='email']")
		private WebElement email;
		
		@FindBy (xpath = "//input[@id='pass']")
		private WebElement pass;
		
		@FindBy (xpath = "//button[@name='login']")
		private WebElement loginButton;
		
		 
		
		public FacebookLogin(WebDriver driver) {
			PageFactory.initElements(driver, this);
		}
			
		public void sendemail() {
			email.sendKeys("harry@hogwards.com");
			
		}
		
		public void sendpass() {
			pass.sendKeys("griffindor");
			
		}
		
		public void clickLogin() {
			loginButton.click();
		}
		
		public void backward() {
			
		}

	}



