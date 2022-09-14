package Today_30_08;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sample4
{

	public static void main(String[] args)
	{
	
		
		System.setProperty("webdriver.chrome.driver", "E:\\selenium jar file\\chromedriver_win32\\chromedriver.exe");
		WebDriver s1 = new ChromeDriver();
		s1.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_iframe");
		s1.manage().window().maximize();
		s1.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		s1.switchTo().frame("iframe");
		
		s1.findElement(By.xpath("//a[@id='w3loginbtn']")).click();
		
//		s1.findElement(By.xpath("//a[@class='w3-button tut-button']")).click();
		
	}
}
