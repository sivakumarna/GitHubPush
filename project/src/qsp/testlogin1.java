package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testlogin1 {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/ChromeDriver.exe");
	}
public static void main(String args[])
{
	WebDriver driver=new ChromeDriver();
	driver.get("http://localhost/login.do");
	loginpage1 lp=new loginpage1(driver);
	lp.setUserName("abc");
	lp.setPassword("123");
	lp.ClickLogin();
	
	try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	lp.setUserName("admin");
	lp.setPassword("manager");
	lp.ClickLogin();
}
}
