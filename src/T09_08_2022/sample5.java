package T09_08_2022;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class sample5 
{

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
	
		FileInputStream s1 = new FileInputStream("E:\\selenium jar file\\poi-bin-5.2.2\\Selenium excel sheet.xlsx");
		
		String AA = WorkbookFactory.create(s1).getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
		System.out.println(AA);
}
}