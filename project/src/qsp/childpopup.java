package qsp;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class childpopup {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/ChromeDriver.exe");
	}
	public static void main(String args[])
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com");
		Set<String> allwh=driver.getWindowHandles();
		System.out.println(allwh);
		for(String wh:allwh)
		{
			System.out.println(wh);
			driver.switchTo().window(wh);
			String t=driver.getTitle();
			System.out.println(t);
			driver.close();
		}
		
	}

}
