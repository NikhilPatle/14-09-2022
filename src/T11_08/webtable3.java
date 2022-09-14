package T11_08;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webtable3 
{

public static void main(String[] args) {
		

		System.setProperty("webdriver.chrome.driver", "E:\\selenium jar file\\chromedriver_win32\\chromedriver.exe");
		WebDriver s1 = new ChromeDriver();
		s1.get("https://www.census2011.co.in/");

		List<WebElement> table = s1.findElements(By.xpath("(//div[@class='inlinebox'])[1]"));
		for (int i = 0; i <=table.size()-1; i++)
		{
		
			System.out.println(table.get(i).getText());
		}
		
}
}