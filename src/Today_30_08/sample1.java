package Today_30_08;

import java.util.List;
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
		s1.get("https://www.facebook.com/");
		s1.manage().window().maximize();
		s1.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		s1.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		
		WebElement Listbox = s1.findElement(By.xpath("//select[@id='month']"));
		
		Select SS = new Select(Listbox);
//		SS.selectByVisibleText("Nov");
//		
//		List<WebElement> AAA = SS.getOptions();
//		
//		for(WebElement BBB:AAA)
//		{
//			System.out.println(BBB.getText());
//		}
		
		boolean CCC = SS.isMultiple();
		
		System.out.println(CCC);
		
	}
}
