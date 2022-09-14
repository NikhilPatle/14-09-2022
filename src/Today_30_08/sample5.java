package Today_30_08;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sample5 
{
public static void main(String[] args) {
	

	System.setProperty("webdriver.chrome.driver", "E:\\selenium jar file\\chromedriver_win32\\chromedriver.exe");
	WebDriver s1 = new ChromeDriver();
	s1.get("https://demo.guru99.com/V4/index.php");
	s1.manage().window().maximize();
	s1.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	s1.findElement(By.xpath("//input[@type='text']")).sendKeys("112233");
	s1.findElement(By.xpath("//input[@type='password']")).sendKeys("112233");
	s1.findElement(By.xpath("//input[@type='submit']")).click();
	
	s1.switchTo().alert().accept();
	
	
}
}