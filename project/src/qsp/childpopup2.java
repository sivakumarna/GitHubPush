package qsp;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class childpopup2 {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/ChromeDriver.exe");
	}
public static void main(String args[])
{
	WebDriver driver=new ChromeDriver();
	String parent=driver.getWindowHandle();
	driver.get("http://localhost/login.do");
	driver.findElement(By.linkText("View License")).click();
	Set <String> allwh=driver.getWindowHandles();
	for(String wh:allwh)
	{
		driver.switchTo().window(wh);
	}
	String xp="//h2[.='5. Support']";
	WebElement e=driver.findElement(By.xpath(xp));
	int y=e.getLocation().getY();
	JavascriptExecutor j=(JavascriptExecutor)driver;
	j.executeScript("window.scrollBy(0,"+y+")");
	try {
		Thread.sleep(5000);
	} catch (InterruptedException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
	driver.close();
	try {
		Thread.sleep(5000);
	} catch (InterruptedException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
	driver.switchTo().window(parent);
	driver.close();
}
}
