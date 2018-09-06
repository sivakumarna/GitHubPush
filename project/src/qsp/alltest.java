package qsp;

import org.testng.Reporter;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class alltest {
	@BeforeSuite(alwaysRun=true)
	public void login()
	{
		Reporter.log("login",true);
	}
	@AfterSuite(alwaysRun=true)
	public void logout()
	{
		Reporter.log("logout",true);
	}
	@Test(groups={"user","smoke"})
	public void CreateUser()
	{
		Reporter.log("createuser",true);
	}
	@Test(groups= {"user"},enabled=false)
	public void deleteuser()
	{
		Reporter.log("deleteuser",true );
	}
	@Test(groups= {"product","smoke"})
	public void edituser()
	{
		Reporter.log("edituser",true);
	}
	@Test(groups= {"product"})
	public void hideproduct()
	{
		Reporter.log("hidedate",true);
	}
	@Test(groups= {"report","smoke"})
	public void getReport()
	{
		Reporter.log("getreport",true);
	}
}
