package ListBox;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class screenshot
{

	public static void main(String[] args) throws IOException 
	{
	
		System.setProperty("webdriver.chrome.driver", "E:\\selenium jar file\\chromedriver_win32\\chromedriver.exe");
		WebDriver s1 = new ChromeDriver();
		s1.get("https://www.facebook.com/");
		
		String RS =  RandomString.make(2);
		
		File SS = ((TakesScreenshot)s1).getScreenshotAs(OutputType.FILE);
		
		File n1 = new File("E:\\Selenium Screenshot files\\XXX"+RS+".jpg");
		
		FileHandler.copy(SS, n1);
		
		
				
	}
}
