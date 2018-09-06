package qsp;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class screenshot1 {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String args[])
	{
		Date d=new Date();
		String s=d.toString().replace(":", "_");
		System.out.println(s);
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		TakesScreenshot t=(TakesScreenshot)driver;
		File srcfile=t.getScreenshotAs(OutputType.FILE);
		File dest =new File("./photo/"+s+".png");
		try {
			FileUtils.copyFile(srcfile, dest);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.close();
		
	}

}
