package T11_08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sample4 
{

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\selenium jar file\\chromedriver_win32\\chromedriver.exe");
		WebDriver s1= new ChromeDriver();
		
		s1.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
		s1.switchTo().frame("iframeResult");
		
		s1.findElement(By.xpath("//button[@type='button']")).click();
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
