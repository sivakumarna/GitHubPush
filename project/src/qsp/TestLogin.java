package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestLogin {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/ChromeDriver.exe");
	}
	public static void main(String[]args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.get("http://localhost/login.do");
		loginpage l=new loginpage(driver);
		l.setUserName("abc");
		l.setPassword("asd");
		l.clicklogin();
		Thread.sleep(1000);
		l.setUserName("admin");
		l.setPassword("manager");
		l.clicklogin();
	}

}
