package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Login 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://portaldev.silicus.com/");
		driver.manage().window().maximize();
		
		Thread.sleep(20000); 
		driver.findElement(By.xpath(".//*[@id='txtUserName']")).sendKeys("shivani.surana@silicus.com");
	}
}
