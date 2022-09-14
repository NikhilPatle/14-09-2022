package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class locatorSample1{
	
public static void main(String[] args) throws InterruptedException {
	
	
	
	
	System.setProperty("webdriver.chrome.driver", "E:\\selenium jar file\\chromedriver_win32\\chromedriver.exe");
	WebDriver d = new ChromeDriver();
	d.get("https://www.facebook.com/");
	d.findElement(By.id("email")).sendKeys("nikhil");
	d.findElement(By.id("pass")).sendKeys("patle");
	d.findElement(By.xpath("//button[@value='1']")).click();
	Thread.sleep(4000);
   //System.out.println(d.findElement(By.linkText("Forgotten password?")).getText());
//String s1= d.findElement(By.xpath("(//a[text()='Forgotten password?'])[1]")).getText();
System.out.println(d.findElement(By.xpath("//div[@class='_9ay7']")).getText());
d.quit();
//System.out.println(s2);
}

}
