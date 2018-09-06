package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class checked {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/ChromeDriver.exe");
	}
		public static void main(String args[])
		{
			WebDriver driver=new ChromeDriver();
			driver.get("file:///C:/Users/user/Desktop/chk.html");
			String xp="//input[@type='checkbox']";
			List<WebElement> allchk = driver.findElements(By.xpath(xp));
			int count=allchk.size();
			System.out.println(count);
			for(int i=0;i<count;i++)
			{
			WebElement cb = allchk.get(i);
			if(cb.isSelected())
			{
				System.out.println("already seleted:"+i);
			}
			else
			{
				System.out.println("not alrady seleted"+i);
				cb.click();
			}
			}
	
		}
	}


