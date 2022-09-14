package Today_30_08;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class sample8

{
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\selenium jar file\\chromedriver_win32\\chromedriver.exe");
		WebDriver s1 = new ChromeDriver();
		s1.get("https://www.moneycontrol.com/sensex/bse/sensex-live?utm_source=MC_INMAIL");
		s1.manage().window().maximize();
		s1.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		List<WebElement> Row = s1.findElements(By.xpath("//div[@class='table-responsive']//tr"));
		
		for(int i=0 ; i<=Row.size() ; i++)
		{
		System.out.println(Row.get(i).getText());
			
		}

}
}