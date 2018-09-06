package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webelements {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/ChromeDriver.exe");
	}
	public static void main(String args[])
	{
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/user/Desktop/sample.html");
		List<WebElement> fe = driver.findElements(By.tagName("a"));
		int count=fe.size();
		System.out.println(count);
		WebElement link = fe.get(1);
		System.out.println(link.getText());
		link.click();
		
	}

}
