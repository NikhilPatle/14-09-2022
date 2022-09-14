package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sample3
{

	public static void main(String[] args) throws InterruptedException 
	
	{
		System.setProperty("webdriver.chrome.driver", "E:\\selenium jar file\\chromedriver_win32\\chromedriver.exe");
		WebDriver s1= new ChromeDriver();
		
		s1.get("https://www.flipkart.com/");
		s1.findElement(By.xpath("(//input[@autocomplete='off'])[2]")).sendKeys("8956790909");
		Thread.sleep(2000);
		s1.findElement(By.xpath("(//input[@autocomplete='off'])[3]")).sendKeys("nikhil123");
		s1.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
		
		s1.findElement(By.xpath("//input[@type='text']")).sendKeys("Nothing  phone");
		s1.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
		
	}
}