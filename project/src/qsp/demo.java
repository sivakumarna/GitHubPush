package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
}
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/user/Desktop/demo1.html");
	    driver.findElement(By.cssSelector("a#d1")).click();
	    Thread.sleep(1000);
	    driver.navigate().back();
	    driver.findElement(By.cssSelector("a[name='n1']")).click();
	    Thread.sleep(1000);
	    driver.navigate().back();
	    driver.findElement(By.cssSelector("a[name='c1']")).click();
	    Thread.sleep(1000);
	    driver.navigate().back();
	    driver.findElement(By.cssSelector("a.cl")).click();
	    driver.navigate().back();
	    driver.close();
	}

}
