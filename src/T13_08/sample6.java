package T13_08;

import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sample6 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\selenium jar file\\chromedriver_win32\\chromedriver.exe");
	WebDriver s1 = new ChromeDriver();
	s1.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	s1.get("https://secure.indeed.com/auth?hl=en&continue=%2Fsettings%2Faccount");
	
	s1.findElement(By.xpath("//button[@id='login-facebook-button']")).click();
	
	Set<String> AA = s1.getWindowHandles();
	
	System.out.println(AA);
	
	ArrayList<String> AR = new ArrayList<String>(AA);
	
	
	s1.switchTo().window(AR.get(1));

	s1.findElement(By.xpath("//input[@type='text']")).sendKeys("ABCDEF");
	
	
	
	
	
	
}
}