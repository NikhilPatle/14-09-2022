package T09_08_2022;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sample1
{
	public static void main(String[] args) throws InterruptedException
	{
	
		System.setProperty("webdriver.chrome.driver", "E:\\selenium jar file\\chromedriver_win32\\chromedriver.exe");
		WebDriver s1= new ChromeDriver();
		
		s1.get("https://www.facebook.com/");
		
		Thread.sleep(2000);
		
		s1.navigate().to("https://www.google.com/");
		
		String aa = s1.getCurrentUrl();
		String bb = s1.getTitle();
				
		System.out.println(aa);
		System.out.println(bb);
		
		
		
	}

	
}
