package T09_08_2022;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import java.util.logging.FileHandler;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import net.bytebuddy.utility.RandomString;

public class sample4 
{
	public static void main(String[] args) throws InterruptedException, IOException
	{
	
		System.setProperty("webdriver.chrome.driver", "E:\\selenium jar file\\chromedriver_win32\\chromedriver.exe");
		WebDriver s1= new ChromeDriver();
		
		s1.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		
		s1.get("https://www.facebook.com/");
		
		String CC = RandomString.make(4);
		
		File AA = ((TakesScreenshot)s1).getScreenshotAs(OutputType.FILE);
		
		File BB = new File("E:\\Selenium Screenshot files\\ABCDEF"+CC+".jpg");
		
	org.openqa.selenium.io.FileHandler.copy(AA, BB);
	

}
}