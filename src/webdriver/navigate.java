package webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class navigate {

	public static void main(String[] args) throws InterruptedException 
	{
	
System.setProperty("webdriver.chrome.driver", "E:\\selenium jar file\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver s1= new ChromeDriver();
		s1.navigate().to("https://www.facebook.com/");
		Thread.sleep(2000);
		s1.navigate().to("https://www.google.com/");
		Thread.sleep(2000);
		s1.navigate().back();
		Thread.sleep(2000);
		s1.navigate().forward();
	    Thread.sleep(2000);
	    s1.navigate().refresh();
	    s1.close();
	}
}
