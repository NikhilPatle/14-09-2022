package T13_08;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class sample9 
{
public static void main(String[] args) {
	

	System.setProperty("webdriver.chrome.driver", "E:\\selenium jar file\\chromedriver_win32\\chromedriver.exe");
	
	WebDriver s1= new ChromeDriver();
	s1.get("https://www.google.com/");
	
	s1.manage().window().maximize();

	s1.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("Redmi");
	
	
	List<WebElement> AAA = s1.findElements(By.xpath("//ul[@class='erkvQe']//li"));
	
	for(WebElement BB:AAA)
	{
		String aa="Redmi Note 9";
		String CC=BB.getText();
			
		if(aa.equals(CC))
		{
			BB.click();
			break;
			
		}
			
	}
	
	
	
	
}	
}
