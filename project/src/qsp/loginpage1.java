package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginpage1 {
	@FindBy(id="username")
	private WebElement untb;
	
	@FindBy(name="pwd")
	private WebElement pwtd;
	
	@FindBy(xpath="//div[.='Login ']")
	private WebElement LoginBTN;

	public loginpage1(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void setUserName(String un)
	{
		untb.sendKeys(un);
	}
	
	public void setPassword(String pwd)
	{
		pwtd.sendKeys(pwd);
	}
	
	public void ClickLogin()
	{
		LoginBTN.click();
	}
} 