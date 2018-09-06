package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class alllinksfb {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		
	}
	public static void main(String args[])
	{
		int visible=0;
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.findElement(By.id("email")).sendKeys("9703231820");
		driver.findElement(By.name("pass")).sendKeys("Nasiva@20");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		List<WebElement> alllinks=driver.findElements(By.xpath("//a"));
		for(int i=0;i<=alllinks.size();i++)
		{
			WebElement link=alllinks.get(i);
			if(link.isDisplayed())
			{
				String text=link.getText();
				System.out.println(text);
				visible++;
			}
			System.out.println(visible);
			driver.close();
		}
}
}
