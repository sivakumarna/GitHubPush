package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class frame {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/ChromeDriver.exe");
	}
	public static void main(String args[])
	{
		WebDriver driver=new ChromeDriver();
		driver.get("file:///D:/page2.html");
		driver.switchTo().frame(0);
		driver.findElement(By.id("t1")).sendKeys("a");
		driver.switchTo().defaultContent();
		driver.findElement(By.id("t2")).sendKeys("a");
		driver.switchTo().frame("f1");
		driver.findElement(By.id("t1")).sendKeys("b");
		driver.switchTo().defaultContent();
		driver.findElement(By.id("t2")).sendKeys("b");
		driver.switchTo().frame("n1");
		driver.findElement(By.id("t1")).sendKeys("c");
		driver.switchTo().defaultContent();
		driver.findElement(By.id("t2")).sendKeys("c");
		WebElement e=driver.findElement(By.className("c1"));
		driver.switchTo().frame(e);
		driver.findElement(By.id("t1")).sendKeys("d");
		driver.switchTo().defaultContent();
		driver.findElement(By.id("t2")).sendKeys("d");
		
	}

}
