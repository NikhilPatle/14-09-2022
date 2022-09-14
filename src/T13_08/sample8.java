package T13_08;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class sample8 
{

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "E:\\\\selenium jar file\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver s1 = new ChromeDriver();
		s1.get("https://www.facebook.com/");
		
		List<WebElement> AA = s1.findElements(By.xpath("//a"));
		
		for(WebElement BB:AA)
		{
			System.out.println(BB.getText());
			
		}
		
		
		
	}
}
