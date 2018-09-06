package qsp;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class genericscreenshot {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public void getphoto(WebDriver driver,String folder,String testname)
	{
		String datetime=new Date().toString().replaceAll(":", "_");
		TakesScreenshot T=(TakesScreenshot)driver;
		File src=T.getScreenshotAs(OutputType.FILE);
		String des=folder+testname+datetime+".png";
		System.out.println(des);
		try {
			FileUtils.copyFile(src, new File(des));
		} catch (IOException e)  {
		}
		
	}

}
