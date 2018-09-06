package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class invallied {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/ChromeDriver.exe");
	}
public static void main(String args[])
{
	WebDriver driver=new ChromeDriver();
	driver.get("http://localhost/login.do");
	driver.findElement(By.id("username")).sendKeys("abc");
	driver.findElement(By.name("pwd")).sendKeys("abc");
	driver.findElement(By.xpath("//div[.='Login ']")).click();
	try
	{
	String xp="//span[contains(.,'invalid')]";
	WebElement error=driver.findElement(By.xpath(xp));
	if(error.isDisplayed())
	{
		System.out.println("pass:error is displayed");
	}
	else
	{
		System.out.println("fail:error is not displayed");
	}
	}
	catch(Exception e)
	{
		System.out.println("fail: error msg is not displayed");
	}
}
}
