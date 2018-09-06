package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class loginpage {

		@FindBy(id="username")
		private WebElement untb;
		@FindBy(name="pwd")
		private WebElement pwd;
		@FindBy(xpath="//div[.='Login ']")
		private WebElement loginbtn;
		
		public loginpage(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}
		
		public void setUserName(String un)
		{
			untb.sendKeys(un);
		}
		
		public void setPassword(String pw)
		{
			pwd.sendKeys(pw);
		}
		
		public void clicklogin()
		{
			loginbtn.click();
		}
		
		
		}

