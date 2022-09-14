package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonWeb {

	public static void main(String[] args) throws InterruptedException {
		
		
System.setProperty("webdriver.chrome.driver", "E:\\selenium jar file\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("one plus nord");
		driver.findElement(By.id("nav-search-submit-button")).click();
		Thread.sleep(3000);
		
		driver.close();
		
	}

}
