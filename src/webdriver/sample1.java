package webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sample1 
{

	public static void main(String[] args) throws InterruptedException
	{
	
		System.setProperty("webdriver.chrome.driver", "E:\\selenium jar file\\chromedriver_win32\\chromedriver.exe");
		
		
		WebDriver s1=  new ChromeDriver();
		s1.get("https://www.facebook.com/");
		Thread.sleep(2000);
		s1.get("https://www.google.com/");
		s1.close();
	}
}
