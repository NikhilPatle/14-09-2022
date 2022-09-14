package ListBox;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class selectOption 
{

	public static void main(String[] args) throws InterruptedException
	{
	
		System.setProperty("webdriver.chrome.driver", "E:\\selenium jar file\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver s1= new ChromeDriver();
		s1.get("https://www.facebook.com/");
		s1.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		Thread.sleep(5000);
		s1.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		
		WebElement Month = s1.findElement(By.xpath("(//select[@id='month'])"));
		
		Select s2= new Select(Month);
		
		s2.selectByVisibleText("Nov");
		
		
	}
}
