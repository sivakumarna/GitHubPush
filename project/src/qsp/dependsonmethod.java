package qsp;



import org.junit.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class dependsonmethod extends basetest {
	@Test
	public void createuser()
	{
		Reporter.log("createuser",true);
		Assert.fail();
	}
	@Test(dependsOnMethods="createuser")
	public void deleteuser()
	{
		Reporter.log("deleteuser",true);
	}
}

