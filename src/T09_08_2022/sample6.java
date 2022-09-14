package T09_08_2022;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class sample6
{

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "E:\\selenium jar file\\chromedriver_win32\\chromedriver.exe");
		WebDriver s1 =  new ChromeDriver();
		s1.get("https://www.moneycontrol.com/sensex/bse/sensex-live?utm_source=MC_INMAIL");
		s1.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		s1.manage().window().maximize();
		
		List<WebElement> row = s1.findElements(By.xpath("//table[@class='mctable1 nobrd']//tr"));
		
		for(WebElement AA:row)
		{
			System.out.println(AA.getText());
		}
		
	}
}
