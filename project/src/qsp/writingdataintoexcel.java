package qsp;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

public class writingdataintoexcel {
	@Test
	public void dataintoexcel() throws EncryptedDocumentException, InvalidFormatException, FileNotFoundException, IOException
	{
		String path="./data/book1.xlsx";
		String path2="./data/book2.xlsx";
		Workbook wb=WorkbookFactory.create(new FileInputStream(path));
		wb.getSheet("Sheet2").getRow(0).getCell(0).setCellValue("jsp");
		wb.getSheet("Sheet2").getRow(0).createCell(1).setCellValue("qsp");
		wb.getSheet("Sheet2").createRow(1).createCell(0 ).setCellValue("jsp");
		wb.write(new FileOutputStream(path2));
	}

}
