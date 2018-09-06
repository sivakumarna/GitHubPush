package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class action1 {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/ChromeDriver.exe");
	}

	public static void main(String[]args)
	{
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.istqb.in/");
		String xp = "//span[.=\'FOUNDATION\']";
		WebElement menu = driver.findElement(By.xpath(xp));
		Actions action=new Actions(driver);
		action.moveToElement(menu).perform();
		String xp1= "(//span[.='ENROLLMENT'])[1]";
		WebElement menu1 = driver.findElement(By.xpath(xp1));
		Actions action1 = new Actions(driver);
		action1.moveToElement(menu1).perform();
		
		
		
	}

}
