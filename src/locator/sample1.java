package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sample1 
{

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "E:\\selenium jar file\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver s1= new ChromeDriver();
		s1.get("https://www.facebook.com/");
		String s2= s1.getCurrentUrl();
		String s3= s1.getTitle();
		s1.manage().window().maximize();
		
		Thread.sleep(2000);
		s1.findElement(By.xpath("//input[@type='text']")).sendKeys("ABCDE");
		Thread.sleep(2000);
		s1.findElement(By.xpath("//input[@type='password']")).sendKeys("XYZ");
		Thread.sleep(2000);
		
		s1.findElement(By.xpath("//button[@value='1']")).click();
	}
}
