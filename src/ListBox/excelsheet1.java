package ListBox;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class excelsheet1 
{

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		
		FileInputStream aa  = new FileInputStream("E:\\selenium jar file\\poi-bin-5.2.2\\Selenium excel sheet.xlsx");
		
		Sheet BB = WorkbookFactory.create(aa).getSheet("Sheet1");

		int CC = BB.getRow(0).getLastCellNum()-1;	
		int DD = BB.getLastRowNum();
		
		for (int i = 0; i <=CC; i++)
		{
		String FF = BB.getRow(0).getCell(i).getStringCellValue();
		System.out.println(FF);
		}
		
		
	}
}
