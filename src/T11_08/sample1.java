package T11_08;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class sample1 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "E:\\selenium jar file\\chromedriver_win32\\chromedriver.exe");
		WebDriver s1 = new ChromeDriver();
		s1.get("https://www.facebook.com");
		s1.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		s1.findElement(By.xpath("(//a[@role='button'])[2]")).click();

		WebElement AA = s1.findElement(By.xpath("//select[@id='month']"));
		
		WebElement BB = s1.findElement(By.xpath("//select[@id='year']"));

		Select ss = new Select(AA);
		
		ss.selectByVisibleText("Nov");
//		boolean SSS = ss.isMultiple();
//		System.out.println(SSS);
//		
//		WebElement qq = ss.getFirstSelectedOption();
//		
//		System.out.println(qq.getText());
		
		List<WebElement> WW = ss.getOptions();
		
//		for(WebElement EE:WW)
//		{
//			String rr = EE.getText();
//			System.out.println(rr);
//		}
		
		for(WebElement EE:WW)
		{
			Dimension rr = EE.getSize();
			System.out.println(rr);
		}

		
		Thread.sleep(2000);
		s1.quit();
		

	}
}
