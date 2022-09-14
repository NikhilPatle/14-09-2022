package T23_08_22;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
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
		s1.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		s1.get("https://www.facebook.com/");
		
		String CCC = RandomString.make(5);
		
		File AAA = ((TakesScreenshot)s1).getScreenshotAs(OutputType.FILE);
		
		File BBB = new File("E:\\Selenium Screenshot files\\23.08.2022"+CCC+".jpg");
		
		org.openqa.selenium.io.FileHandler.copy(AAA, BBB);
		
		
		
		
		
		
		
	}
}
