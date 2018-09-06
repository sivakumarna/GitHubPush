package qsp;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alertpopup {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/ChromeDriver.exe");
		
	}
	public static void main(String[]args)
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.irctc.co.in");
		driver.findElement(By.id("loginbutton")).click();
		Alert alert = driver.switchTo().alert();
		String msg = alert.getText();
		System.out.println(msg);
		alert.accept();
	}

}
