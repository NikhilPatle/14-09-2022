package Today_30_08;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class sample3 
{

	public static void main(String[] args) throws EncryptedDocumentException, IOException
{
	
		FileInputStream f1 = new FileInputStream("E:\\selenium jar file\\poi-bin-5.2.2\\Selenium excel sheet.xlsx");
//	String AAA = WorkbookFactory.create(f1).getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
	
	Sheet AAA = WorkbookFactory.create(f1).getSheet("Sheet1");

	int row = AAA.getLastRowNum();
	
	int column = AAA.getRow(0).getLastCellNum()-1;
	

	for (int i = 0; i <=column; i++)
	{
	
		String SS = AAA.getRow(i).getCell(0).getStringCellValue();
		System.out.println(SS);
	}
	



}
}
