package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class fb {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/ChromeDriver.exe");
	}
	public static void main(String[]args)
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		WebElement email=driver.findElement(By.id("email"));
		WebElement pass=driver.findElement(By.id("pass"));
		int x=email.getLocation().getX();
		int y=email.getLocation().getY();
		int x1=pass.getLocation().getX();
		int y1=pass.getLocation().getY();
		System.out.println(x);
		System.out.println(y);
		System.out.println(x1);
		System.out.println(y1);
		
	}
}
