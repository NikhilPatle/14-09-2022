package ListBox;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class isMultiple 
{

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "E:\\selenium jar file\\chromedriver_win32\\chromedriver.exe");
		WebDriver s1=  new ChromeDriver();
		s1.get("file:///C:/Users/nikhil/Desktop/select.html");
		
		s1.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement drop = s1.findElement(By.xpath("//select[@id='1234']"));
		
		Select ss =  new Select(drop);
		
		boolean result=ss.isMultiple();
		
		if(result== true)
		{
			System.out.println("List Box Is Multi Selectable");
		}
		else
			
		{
			System.out.println("List is not MultiSelectable");
		}
		
}
}