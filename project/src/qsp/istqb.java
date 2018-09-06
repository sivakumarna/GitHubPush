package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class istqb {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	
	public static void main(String args[])
	{
		WebDriver driver=new ChromeDriver();
		driver.get("http://istqb.in/");
		String xp=" //a[text()='FOUNDATION']";
		WebElement menu=driver.findElement(By.xpath(xp));
		Actions action=new Actions(driver);
		action.moveToElement(menu).perform();
		String xp2="//a[contains(text(),'ONLINE ENROLLMENT')]";
		driver.findElement(By.xpath(xp2)).click(); 
		
		
	}

}
