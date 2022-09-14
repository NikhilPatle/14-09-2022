package T11_08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sample5
{

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\selenium jar file\\chromedriver_win32\\chromedriver.exe");
		WebDriver s1= new ChromeDriver();
		
		s1.get("https://demo.guru99.com/test/delete_customer.php");
		
		s1.findElement(By.xpath("//input[@type='text']")).sendKeys("ABCDE");
		
		s1.findElement(By.xpath("//input[@type='submit']")).click();
		
		s1.switchTo().alert().accept();
		
		
		
		
		
}
}