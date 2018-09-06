package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.asserts.SoftAssert;

public class testlogintestng {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	
	public static void main(String args[])
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		String atitle=driver.getTitle();
		String etitle="Facebook";
		SoftAssert s=new SoftAssert();
		s.assertEquals(atitle, etitle);
		driver.close();
		s.assertAll();
	}
}
