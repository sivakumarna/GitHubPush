package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class actime {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/Chromedriver.exe");
	}
	public static void verfytitile(WebDriver driver,String etitle)
	{
			System.out.println("Excepted title: "+etitle);
			String atitle=driver.getTitle();
			System.out.println("Actual titile: "+atitle);
			
			if(atitle.equalsIgnoreCase(etitle))
			{
				System.out.println("pass: login page is displayed");
			}
			else
			{
				System.out.println("Fail:login page is not displayed ");
			}
	}
	
	public static void main(String args[])
	{
		WebDriver driver=new ChromeDriver();
		driver.get("http://localhost/login.do");
		VerifyTitle(driver,"actiTime-Login");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.xpath("//div[.='Login ']")).click();
		
		try
		{
			Thread.sleep(5000);
		}
		catch(Exception e)
		{
			
		}
	}

	private static void VerifyTitle(WebDriver driver, String string) {
		// TODO Auto-generated method stub
		VerifyTitle(driver,"actiTime - Enter Time-Track");
	}

	
	

}
