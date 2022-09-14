package T15_08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class example12 
{

	//Action class
	public static void main(String[] args) 
	{
	
		System.setProperty("webdriver.chrome.driver", "E:\\selenium jar file\\chromedriver_win32\\chromedriver.exe");
		WebDriver s1 = new ChromeDriver();
		
		s1.get("https://www.flipkart.com/");
		
		s1.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		
		WebElement AA = s1.findElement(By.xpath("//div[@class='exehdJ']"));
		
		Actions act = new Actions(s1);
		
		act.moveToElement(AA).perform();
		
		s1.findElement(By.xpath("(//div[@class='_3vhnxf'])[1]")).click();
		
		
	}
}
