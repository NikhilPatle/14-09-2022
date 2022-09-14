package T09_08_2022;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sample2 
{

	
	public static void main(String[] args) throws InterruptedException
	{
	
		System.setProperty("webdriver.chrome.driver", "E:\\selenium jar file\\chromedriver_win32\\chromedriver.exe");
		WebDriver s1= new ChromeDriver();
		
		s1.get("https://www.facebook.com/");
		
		boolean AA = s1.findElement(By.xpath("//input[@type='text']")).isEnabled();
		
		System.out.println(AA);
		
		
		
}
}