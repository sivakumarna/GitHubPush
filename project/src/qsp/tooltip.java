package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class tooltip {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/ChromeDriver.exe");
	}
	
	public static void main(String args[])
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://localhost/login.do");
		WebElement chkbox = driver.findElement(By.name("remember"));
		System.out.println(chkbox.getAttribute("title"));
	}

}
