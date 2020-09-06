package objectdepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RediffLogin {
	
	WebDriver driver;
	
	public RediffLogin(WebDriver driver) {
		this.driver=driver;
	}

	
	
		
		By userName=By.xpath("//*[@id='login1']");
		By password=By.name("passwd");
		By go=By.name("proceed");
		By home=By.linkText("rediff.com");
		
		
		public WebElement Email() {
			
			return driver.findElement(userName);
		}
		
		public WebElement pass() {
			return driver.findElement(password);
		}
		
		public WebElement click() {
			return driver.findElement(go);
		}
	
		public WebElement home() {
			return driver.findElement(home);
		}
}
