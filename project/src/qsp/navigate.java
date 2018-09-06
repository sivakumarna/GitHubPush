package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;

public class navigate {
	public static void main(String[] args) throws InterruptedException,WebDriverException
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.get("file:///C:/Users/user/Desktop/demo1.html");
	    driver.findElement(By.tagName("a")).click();
	    Thread.sleep(1000);
	    driver.navigate().back();
	    driver.findElement(By.id("d1")).click();
	    Thread.sleep(1000);
	    driver.navigate().back();
	    driver.findElement(By.className("cl")).click();
	    Thread.sleep(1000);
	    driver.navigate().back();
	    driver.findElement(By.linkText("google")).click();
	    Thread.sleep(1000);
	    driver.navigate().back();
	    driver.findElement(By.partialLinkText("oo")).click();
	    driver.quit();
	    
	   
	
	}

}
