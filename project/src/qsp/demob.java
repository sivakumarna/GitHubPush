package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class demob {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/ChromeDriver.exe");
	}
	public static void main(String[]args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.get("http://localhost/login.do");
		WebElement username=driver.findElement(By.id("username"));
		username.sendKeys("admin");
		Thread.sleep(2000);
		username.sendKeys(Keys.CONTROL+"c");
		WebElement pwd=driver.findElement(By.name("pwd"));
		pwd.sendKeys(Keys.CONTROL+"v");
		
		
 }
}
	
