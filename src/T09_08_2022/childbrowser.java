package T09_08_2022;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class childbrowser 
{

	public static void main(String[] args)
	{
	
		System.setProperty("webdriver.chrome.driver", "E:\\selenium jar file\\chromedriver_win32\\chromedriver.exe");
		WebDriver s1= new ChromeDriver();
		
		s1.get("https://secure.indeed.com/");
		
		
		s1.findElement(By.xpath("//button[@id='apple-signin-button']")).click();
		
		Set<String> ABCD = s1.getWindowHandles();
		
		ArrayList<String> BBB = new ArrayList<>(ABCD);
		
		s1.switchTo().window(BBB.get(1));
		
		s1.findElement(By.xpath("//input[@type='text']")).sendKeys("ABCDF");
		
		
		
	}
}
