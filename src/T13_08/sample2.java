package T13_08;

import java.io.File;
import java.io.IOException;
import java.util.logging.FileHandler;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import net.bytebuddy.utility.RandomString;

public class sample2
{

	public static void main(String[] args) throws IOException 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\selenium jar file\\chromedriver_win32\\chromedriver.exe");
	WebDriver s1 = new ChromeDriver();
	s1.get("https://www.facebook.com/");
	
	String RR = RandomString.make(2);
	
	File AA = ((TakesScreenshot)s1).getScreenshotAs(OutputType.FILE);
	
	File BB = new File("E:\\Selenium Screenshot files\\13.08.2022" +RR+".jpg");
	
	org.openqa.selenium.io.FileHandler.copy(AA, BB);
	
}
}