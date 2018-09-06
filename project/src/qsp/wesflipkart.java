package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class wesflipkart {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/ChromeDriver.exe");
	}
		public static void main(String args[])
		{
			WebDriver driver =new ChromeDriver();
			driver.get(" https://www.flipkart.com/?affid=siteplug&affExtParam1=570adef109ec67ef39411a9ceec2768b");
			List<WebElement> alllinks = driver.findElements(By.tagName("a"));
			int count= alllinks.size();
			System.out.println(count);
			WebElement link = alllinks.get(10);
			String text = link.getText();
			System.out.println(text);
			
		}

}
