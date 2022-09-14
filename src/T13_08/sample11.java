package T13_08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class sample11
{
public static void main(String[] args) {
		

		System.setProperty("webdriver.chrome.driver", "E:\\selenium jar file\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver s1= new ChromeDriver();
		
		s1.get("https://www.ajio.com/");
		
		WebElement AA = s1.findElement(By.xpath("//a[@title='WOMEN']"));
		
		Actions act=  new Actions(s1);
		
		
		act.moveToElement(AA).perform();
		
		
		
}
}