package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class fbradio {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/ChromeDriver.exe");
	}
	
public static void main(String args[])
{
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	WebElement radio=driver.findElement(By.name("sex"));
	radio.click();
	if(radio.isSelected())
	{
		System.out.println("pass :is selected");
	}
	else
	{
		System.out.println("fail:  is not selected");
	}
}

}
