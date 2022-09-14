package T13_08;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sample5 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\selenium jar file\\chromedriver_win32\\chromedriver.exe");
	WebDriver s1 = new ChromeDriver();
	s1.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	s1.get("https://demo.guru99.com/test/delete_customer.php");
	
	s1.findElement(By.xpath("//input[@type='text']")).sendKeys("ABCED");
	
	s1.findElement(By.xpath("//input[@type='submit']")).click();
	
	Thread.sleep(2000);
	
	s1.switchTo().alert().accept();
	Thread.sleep(2000);
	s1.switchTo().alert().accept();
	
	s1.switchTo().alert().dismiss();
	
}
}