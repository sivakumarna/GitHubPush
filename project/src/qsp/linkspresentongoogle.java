package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class linkspresentongoogle {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/ChromeDriver.exe");
	}
		public static void main(String args[])
		{
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.google.co.in/");
			List<WebElement> allele = driver.findElements(By.tagName("a"));
			int count=allele.size();
			System.out.println(count);
			
		}
}
