package Today_30_08;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class sample2
{

	public static void main(String[] args) throws IOException 
	{
		//ScreenShot
		
		System.setProperty("webdriver.chrome.driver", "E:\\selenium jar file\\chromedriver_win32\\chromedriver.exe");
		WebDriver s1 = new ChromeDriver();
		s1.get("https://www.facebook.com/");
		s1.manage().window().maximize();
		s1.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		String BBB = RandomString.make(2);
		
		File SS = ((TakesScreenshot)s1).getScreenshotAs(OutputType.FILE);
		
		File AA = new File("E:\\ABC"+ BBB +".jpg");
		
		FileHandler.copy(SS, AA);
	}
}
