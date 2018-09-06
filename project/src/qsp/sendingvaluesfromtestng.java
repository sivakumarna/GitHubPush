package qsp;

import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class sendingvaluesfromtestng {
	@Parameters({"city","area"})
	@Test
	public void test(String s,String s1)
	{
		Reporter.log(s+s1,true);
	}

}
