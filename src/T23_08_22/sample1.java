package T23_08_22;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import ListBox.selectOption;

public class sample1
{

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "E:\\selenium jar file\\chromedriver_win32\\chromedriver.exe");
		WebDriver s1 = new ChromeDriver();
		
		
		s1.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		s1.get("https://www.facebook.com/");
		
		s1.findElement(By.xpath("//a[text()='Create New Account']")).click();
		
		List<WebElement> AAA = s1.findElements(By.xpath("//select[@id='month']"));
		
		System.out.println(AAA);
		
//		Select ss = new Select(AAA);
//		ss.selectByVisibleText("Nov");
		
		for(WebElement BBB:AAA)
		{
			System.out.println(BBB.getText());
		}
		
	}
}
