package qsp;


import org.openqa.selenium.By;

import org.openqa.selenium.chrome.ChromeDriver;

public class actionclass {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/ChromeDriver.exe");
	}
	
	public static void main(String args[])
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://localhost/login.do");
		driver.findElement(By.linkText("actiTIME Inc."));
		
	}	

}
