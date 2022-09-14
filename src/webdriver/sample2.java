package webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sample2 
{

	public static void main(String[] args) throws InterruptedException
	{
	
		System.setProperty("webdriver.chrome.driver", "E:\\\\selenium jar file\\\\chromedriver_win32\\\\chromedriver.exe");
	WebDriver s1= new ChromeDriver();
	
	s1.get("https://www.facebook.com/");
	Thread.sleep(2000);
String s2=	s1.getTitle();
	System.out.println(s2);
	
	String s3 =  s1.getCurrentUrl();
	System.out.println(s3);
	
	s1.manage().window().minimize();
	
	}
}
