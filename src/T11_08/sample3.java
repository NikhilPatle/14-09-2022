package T11_08;

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
	
		FileInputStream AA = new FileInputStream("E:\\selenium jar file\\poi-bin-5.2.2\\Selenium excel sheet.xlsx");
		Sheet QQ = WorkbookFactory.create(AA).getSheet("Sheet1");

		int Column = QQ.getRow(0).getLastCellNum()-1;
		int Row = QQ.getLastRowNum();
		
//		for(int i=0 ; i<=Column ; i++)
//		{
//			String RR = QQ.getRow(0).getCell(i).getStringCellValue();
//			System.out.print(RR+" ");
//		}
		
		for(int i = 0; i<=Row ; i++) 
		{
		String TT = QQ.getRow(i).getCell(0).getStringCellValue();
		System.out.print(TT+" ");
			
		}
		
		
	}
}
