package GENERIC_Scripts;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class SingleReadDataGeneric {
	public  static String getdata(String Sheet,int row,int cell) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream("./POI/Hybridframes.xlsx");
		Workbook book = WorkbookFactory.create(fis);
		Sheet s = book.getSheet(Sheet);
		Row r = s.getRow(row);
		Cell c = r.getCell(cell);
		String v = c.toString();
		 
		return v;
		
		
		
	}

}