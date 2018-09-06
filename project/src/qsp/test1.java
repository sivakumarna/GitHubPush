package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Parameters;

public class test1 {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.diver", "./driver/geckodriver.exe");
	}
	@Parameters({"browser"})
	
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
		for(int i=0;i<100;i++)
		{
			driver.findElement(By.id("username")).sendKeys("admin");
			driver.findElement(By.id("username")).clear();
		}
		
	}
	
	
}
