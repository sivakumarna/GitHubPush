package qsp;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class disabled {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/ChromeDriver.exe");
	}
	public static void main(String args[])
	{
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/user/Desktop/disabled.html");
		JavascriptExecutor j=(JavascriptExecutor)driver;
		String jscript="document.getElementById('t2').value='qsp'";
		j.executeScript(jscript);
		String jscript2="document.getElementById('t1').value='-'";
		j.executeScript(jscript2);
		
		
	}

}
