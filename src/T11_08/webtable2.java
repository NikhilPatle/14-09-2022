package T11_08;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webtable2
{

	public static void main(String[] args) {
		

		System.setProperty("webdriver.chrome.driver", "E:\\selenium jar file\\chromedriver_win32\\chromedriver.exe");
		WebDriver s1 = new ChromeDriver();
		s1.get("https://www.moneycontrol.com/stocks/marketstats/indcontrib.php?optex=BSE&opttopic=indcontrib&index=4");
		
		List<WebElement> row = s1.findElements(By.xpath("//table[@width='100%']"));
		
		for (int i = 0; i <=row.size()-1; i++)
		{
		System.out.println(row.get(i).getText());	
		}
		
		
		
		
		
		
		
}
}