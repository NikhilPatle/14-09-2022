package TESTNG_Practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class sample2 
{

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
	
		FileInputStream aaa= new FileInputStream("E:\\selenium jar file\\poi-bin-5.2.2\\Selenium excel sheet.xlsx");
		
		Sheet bbb = WorkbookFactory.create(aaa).getSheet("Sheet1");
		
		int row = bbb.getLastRowNum();
		int column = bbb.getRow(0).getLastCellNum()-1;
		
		for(int i=0 ; i<row ; i++)
		{
			String roww = bbb.getRow(0).getCell(i).getStringCellValue();
			System.out.println(roww+ " ");
		}
	
		
		
	}
}
