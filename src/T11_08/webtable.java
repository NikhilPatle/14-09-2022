package T11_08;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webtable 
{
public static void main(String[] args) {
	

	System.setProperty("webdriver.chrome.driver", "E:\\selenium jar file\\chromedriver_win32\\chromedriver.exe");
	WebDriver s1 = new ChromeDriver();
	s1.get("https://economictimes.indiatimes.com/power-grid-corporation-of-india-ltd/profitandlose/companyid-4628.cms");
	
	
	List<WebElement> NOSOFROW = s1.findElements(By.xpath("(//table[@cellspacing='0'])[1]//tr"));
	
	
	for(int i=0; i<=NOSOFROW.size()-1; i++)
	{
		System.out.println(NOSOFROW.get(i).getText());
	}
	
	
	
	
	
	
	
	
	
	}

}