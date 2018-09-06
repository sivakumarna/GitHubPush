package qsp;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class basetest {
	@BeforeSuite 
	public void init()
	{
		Reporter.log("welcome",true);
	}
	@AfterSuite
	public void end()
	{
		Reporter.log("send mail",true);
	}
	@BeforeTest
	public void insert()
	{
		Reporter.log("insert data",true);
	}
	@AfterTest
	public void delete()
	{
		 Reporter.log("delete data",true);
	}
	@BeforeClass
	public void openapp()
	{
		Reporter.log("openapp",true);
	}
	@AfterClass
	public void closeapp()
	{
		Reporter.log("close app",true);
	}
	@BeforeMethod
	public void login()
	{
		Reporter.log("login",true);
	}
	@AfterMethod
	public void logout()
	{
		Reporter.log("logout",true);
	}

}
