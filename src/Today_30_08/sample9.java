package Today_30_08;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class sample9
{

	public static void main(String[] args) throws InterruptedException 
	{
	
		System.setProperty("webdriver.chrome.driver", "E:\\selenium jar file\\chromedriver_win32\\chromedriver.exe");
		WebDriver s1 =new ChromeDriver();
		s1.get("https://www.bseindia.com/sensex/code/16/");
		s1.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		s1.manage().window().maximize();
		
//		List<WebElement> AAA = s1.findElements(By.xpath("(//table[@width='100%'])[14]//tbody"));
//		
//		for(WebElement BBB:AAA)
//		{
//			System.out.println(BBB.getText());
//		}
		
		((JavascriptExecutor)s1).executeScript("window.scrollBy(0,3000)");
		
		Thread.sleep(3000);
		
		((JavascriptExecutor)s1).executeScript("window.scrollBy(3000,0)");
		
		
	}
}
