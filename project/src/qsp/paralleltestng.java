package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class paralleltestng {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver");
		System.setProperty("driver.gecko.driver","./driver/geckodriver.exe");
	}
	@Parameters({"browser"})
	@Test
	public void test(String browser)
	{
		Reporter.log("Browser:"+browser,true);
		WebDriver driver;
		if(browser.equals("chrome"))
		{
			driver=new ChromeDriver();
		}
		else
		{
			driver=new FirefoxDriver();
		}
		driver.get("http://localhost/login.do");
		for(int i=1;i<=100;i++)
		{
			driver.findElement(By.id("username")).sendKeys("admin");
			driver.findElement(By.id("username")).clear();
		}
	}
	
	

}
