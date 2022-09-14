package T15_08;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.Vector;

import org.apache.poi.hpsf.Array;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class sample14
{

	public static void main(String[] args) throws InterruptedException
	{
	
		System.setProperty("webdriver.chrome.driver", "E:\\selenium jar file\\chromedriver_win32\\chromedriver.exe");
		WebDriver s1 = new ChromeDriver();
		
		s1.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
		
//	  s1.findElement(By.xpath("//input[@name='alert']")).click();
//		
//		s1.switchTo().alert().accept();
		
//		s1.findElement(By.xpath("//input[@name='confirmation']")).click();
//		s1.switchTo().alert().accept();
		
//		s1.findElement(By.xpath("//input[@name='prompt']")).click();
//		
//		Thread.sleep(2000);
//		s1.switchTo().alert().accept();
		
		
//		WebElement AAA = s1.findElement(By.xpath("//button[@class='dropbtn']"));
//		
//		Actions Act = new Actions(s1);
		
//		Act.moveToElement(AAA).perform();
		
//		s1.findElement(By.xpath("//a[text()='Google']")).click();
	
		
		
		WebElement BBB = s1.findElement(By.xpath("//input[@id='double-click']"));
		
		Actions Act = new Actions(s1);
		
		Act.doubleClick(BBB).perform();
		
		s1.switchTo().alert().accept();
		
	}
}
