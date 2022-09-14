package T09_08_2022;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class sample3 
{

	
	public static void main(String[] args) throws InterruptedException
	{
	
		System.setProperty("webdriver.chrome.driver", "E:\\selenium jar file\\chromedriver_win32\\chromedriver.exe");
		WebDriver s1= new ChromeDriver();
		
		s1.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		
		
		s1.get("https://www.facebook.com/");
		
 
		s1.findElement(By.xpath("(//a[contains(@role,'button')])[2]")).click();
		
		WebElement AA = s1.findElement(By.xpath("//select[@id='month']"));
		
		
		
		Select ss = new Select(AA);
		
//		boolean BB = ss.isMultiple();
////		ss.selectByVisibleText("Nov");
//		System.out.println(BB);
//		
//		WebElement CC = ss.getFirstSelectedOption();
//		
//		System.out.println(CC);
		
		List<WebElement> DD = ss.getOptions();
		for(WebElement EE:DD)
		{
			String FF = EE.getText();
			System.out.println(FF);
		}
		
		


}
}