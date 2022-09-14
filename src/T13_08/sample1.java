package T13_08;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class sample1
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\selenium jar file\\chromedriver_win32\\chromedriver.exe");
	WebDriver s1 = new ChromeDriver();
	s1.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	s1.get("https://www.facebook.com/");
	
	
	s1.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		
	s1.findElement(By.xpath("(//label[@class='_58mt'])[1]")).click();
	
	WebElement AAA = s1.findElement(By.xpath("//select[@id='month']"));
	
	Select ss= new Select(AAA);
	
	ss.selectByVisibleText("Nov");
	
	System.out.println(ss.isMultiple());
	
	System.out.println(ss.getFirstSelectedOption().getText());
	
	
	
	
	
	}
	
}
