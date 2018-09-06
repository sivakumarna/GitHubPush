package qsp;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class screenshot {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/ChromeDriver.exe");
	}
	public static void main(String[]args) throws InterruptedException
	{
		Date d=new Date();
		String s=d.toString().replaceAll(":", "_");
		System.out.println(s);
		WebDriver driver=new ChromeDriver();
		driver.get("http://localhost/login.do");
		TakesScreenshot t=(TakesScreenshot)driver;
		File srcFile=t.getScreenshotAs(OutputType.FILE);
		File dest =new File("./photo/" +s+ ".png");
		try {
			FileUtils.copyFile(srcFile, dest);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.close();
 }
}
