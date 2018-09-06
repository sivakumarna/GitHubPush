package qsp;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class testng2 extends basetest{
	@Test
	public void CreateProduct()
	{
		Reporter.log("create product",true);
	}
    @Test
    public void DeleteProduct()
    {
    	Reporter.log("Delete product",true);
    }
}
