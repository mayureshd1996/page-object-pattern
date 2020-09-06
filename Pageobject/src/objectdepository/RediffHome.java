package objectdepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RediffHome {
	
WebDriver driver;
	
	public RediffHome(WebDriver driver) {
		this.driver=driver;
	}
	
	By search=By.id("srchword");
	By click=By.className("newsrchbtn");
	
	
	
	public WebElement  search()
	{
		return driver.findElement(search);
	}
	public WebElement  click()
	{
		return driver.findElement(click);
	}

}
