package qsp;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class aul {
		public static int getrow(String sheet,String path)
		{
			int rc=0;
			try {
				Workbook wb=WorkbookFactory.create(new FileInputStream(path));
				rc=wb.getSheet(sheet).getLastRowNum();
			} catch (EncryptedDocumentException | InvalidFormatException | IOException e) {
			}
			return rc;
			
		}
		public static String getcell(String sheet,String path,int r,int c)
		{
			String s=" ";
			try {
				Workbook wb=WorkbookFactory.create(new FileInputStream(path));
				s = wb.getSheet(sheet).getRow(r).getCell(c).toString();
			} catch (EncryptedDocumentException | InvalidFormatException | IOException e) {
			}
			return s;
			
		}
}
