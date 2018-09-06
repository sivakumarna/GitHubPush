package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class license {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/ChromeDriver.exe");
	}

	public static void main(String [] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.co.in/");
		WebElement element=driver.findElement(By.id("hplogo"));
		String tag=element.getTagName();
		if(tag.equals("img"))
		{
			System.out.println("pass:it a img");
		}
		else
		{
			System.out.println("fail:its not a img");
		}
	}
}
