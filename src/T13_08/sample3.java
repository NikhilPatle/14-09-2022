package T13_08;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sample3 
{

	public static void main(String[] args) throws IOException 
	{
		FileInputStream AA = new FileInputStream("E:\\selenium jar file\\poi-bin-5.2.2\\Selenium excel sheet.xlsx");
	
//	String BB = WorkbookFactory.create(AA).getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
//			
//	System.out.println(BB);
	
	Sheet CC = WorkbookFactory.create(AA).getSheet("Sheet1");
	
	int DD = CC.getLastRowNum();
	short EE = CC.getRow(0).getLastCellNum();
	
//
//	for (int i = 0; i <=DD; i++)
//	{
//	
//		System.out.println(CC.getRow(i).getCell(0).getStringCellValue());
//	}
	
	for (int i = 0; i <=EE; i++) 
	{
	
		System.out.println(CC.getRow(0).getCell(i).getStringCellValue()+ " ");
	}
	
}
}