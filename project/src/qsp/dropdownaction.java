package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class dropdownaction {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/ChromeDriver.exe");
	}
	public static void main(String args[])
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.actitime.com/");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String xp="//a[.='Features']";
		WebElement menu=driver.findElement(By.xpath(xp));
		Actions actions=new Actions(driver);
		actions.moveToElement(menu).perform();
		String xp2="//a[.='Simple Time Tracking']";
		driver.findElement(By.xpath(xp2)).click();
		
		
	}

}
