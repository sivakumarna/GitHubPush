package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathdemo {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String [] args)
	{
		WebDriver driver=new  ChromeDriver();
		driver.get("http://localhost/login.do");
		WebElement element=driver.findElement(By.tagName("img"));
		String tag=element.getTagName();
		if(tag.equals("img"))
		{
			 System.out.println("pass:it is an img");
		}
		else
		{
			System.out.println("Fail:it is not an img");
		}
	}
}
