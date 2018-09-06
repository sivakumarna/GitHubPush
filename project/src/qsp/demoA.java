package qsp;

import org.openqa.selenium.chrome.ChromeDriver;

public class demoA {
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	    ChromeDriver driver=new ChromeDriver();
	    driver.get("file:///C:/Users/user/Desktop/demo.html");
	    String title = driver.getTitle();
	    System.out.println(title);
	    String src = driver.getPageSource();
	    System.out.println(src);
	    String cu = driver.getCurrentUrl();
	    System.out.println(cu);
	    driver.close();
	
	}
}
