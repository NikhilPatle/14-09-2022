package T13_08;

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
	s1.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	
	s1.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
	
	s1.switchTo().frame("iframeResult");
	
	s1.findElement(By.xpath("//button[@type='button']")).click();
	
//	s1.switchTo().parentFrame();
	s1.switchTo().defaultContent();
	
	s1.findElement(By.xpath("//a[@id='menuButton']")).click();
	
	
	
	
	
	
	
	
}
}