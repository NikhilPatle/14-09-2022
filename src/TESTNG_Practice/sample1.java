package TESTNG_Practice;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class sample1 
{

	public static void main(String[] args) throws IOException 
	{
	
		System.setProperty("webdriver.chrome.driver", "E:\\selenium jar file\\chromedriver_win32\\chromedriver.exe");
		WebDriver s1 = new ChromeDriver();
		s1.get("https://www.facebook.com/");
		
		String CCC = RandomString.make(7);
		
		File AAA = ((TakesScreenshot)s1).getScreenshotAs(OutputType.FILE);
		
		File BBB = new File("E:\\Selenium Screenshot files\\24.08.22"+ CCC +".jpg");
		
		FileHandler.copy(AAA, BBB);
		
	}
}
