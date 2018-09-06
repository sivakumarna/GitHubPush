package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sortinginse {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/ChromeDriver.exe");
	}
		public static void main(String args[])
		{
			WebDriver driver=new ChromeDriver();
			driver.get("file:///C:/Users/user/Desktop/chk.html");
			
			

}
}
