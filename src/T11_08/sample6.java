package T11_08;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sample6 
{

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\selenium jar file\\chromedriver_win32\\chromedriver.exe");
		WebDriver s1= new ChromeDriver();
		
		s1.get("https://secure.indeed.com/");
		
		s1.findElement(By.xpath("//span[text()='Continue with Facebook']")).click();
		
		Set<String> QQ = s1.getWindowHandles();
		
		ArrayList<String> WW = new ArrayList<String>(QQ);
		
		s1.switchTo().window(WW.get(1));
		
		s1.findElement(By.xpath("//input[@type='text']")).sendKeys("ABCDE");
		
		
}
	
}