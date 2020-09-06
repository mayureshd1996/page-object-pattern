package Testcase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import objectdepository.RediffHome;
import objectdepository.RediffLogin;

public class LoginPage {

	@Test
	
		public void Login()
		{
		System. setProperty("webdriver.chrome.driver", "G:\\selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		RediffLogin rd =new RediffLogin(driver);
		
		rd.Email().sendKeys("mayuresh");
			
		rd.pass().sendKeys("1234");
		
		rd.click().click();
		rd.home().click();
		
		
		RediffHome ho=new RediffHome(driver);
		
		ho.search().sendKeys("cars new");
		ho.click().click();
		}

	

}
