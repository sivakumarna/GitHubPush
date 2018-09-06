package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class licence {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/ChromeDriver.exe");
	}
	public static void main(String args[])
	{
		WebDriver driver =new ChromeDriver();
		driver.get("http://localhost/login.do");
		WebElement element=driver.findElement(By.id("licenseLink"));
		String tag=element.getTagName();
		if(tag.equals("a"))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
	}

}
