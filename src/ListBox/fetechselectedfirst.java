package ListBox;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class fetechselectedfirst 
{

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "E:\\selenium jar file\\chromedriver_win32\\chromedriver.exe");
		WebDriver s1=  new ChromeDriver();
		s1.get("https://www.facebook.com/");
		
		s1.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		s1.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		
		WebElement drop = s1.findElement(By.xpath("(//select[@id='month'])"));
		
		Select ss= new Select (drop);
		
		ss.selectByVisibleText("Nov");
		
		WebElement selected = ss.getFirstSelectedOption();
		String text = selected.getText();
		System.out.println(text);
		
		List<WebElement> all = ss.getOptions();
		for(WebElement data:all)
		{
			System.out.println(data.getText());
		}
			
		
}
}