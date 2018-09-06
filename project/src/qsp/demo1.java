package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo1 {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
public static void verifytitle(WebDriver driver,String etitle)
{
	System.out.println("Expectedtitle:"+etitle);
	String atitle=driver.getTitle();
	System.out.println("Actualtitle:"+atitle);
	if(atitle.equals(etitle))
	{
		System.out.println("Pass:login page displayed");
	}
	else
	{
		System.out.println("Fail :login page not displayed");
	}
}
	public static void main(String [] args)
	{
		WebDriver driver=new  ChromeDriver();
		driver.get("http://localhost/login.do");
		String atitle=driver.getTitle();
		System.out.println(atitle);
		
	}
}
