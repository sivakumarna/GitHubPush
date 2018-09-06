package qsp;


import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

public class readingdatafromexcel {
	@Test
	public void readexceldate() throws EncryptedDocumentException, InvalidFormatException, IOException
	{
		Workbook wb=WorkbookFactory.create(new FileInputStream("./Data/book1.xlsx"));
		for(int i=0;i<=2;i++)
		{
			for(int j=0;j<=1;j++)
			{
				String v=wb.getSheet("Sheet1").getRow(i).getCell(j).toString();
				System.out.println(v+" ");
			}
			System.out.println();
				
		}

}
}
