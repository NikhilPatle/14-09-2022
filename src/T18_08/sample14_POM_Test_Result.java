package T18_08;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sample14_POM_Test_Result
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\selenium jar file\\chromedriver_win32\\chromedriver.exe");
		WebDriver s1 = new ChromeDriver();
		s1.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		s1.get("https://kite.zerodha.com/");
		
		
		sample14_POM_Class1 P1=  new sample14_POM_Class1(s1);
	
		P1.inpsample14_POM_Class1USername();
		P1.inpsample14_POM_Class1Password();
		P1.Clicksample14_POM_Class1_clkbutton();
		
		
		sample14_POM_Class2 P2= new sample14_POM_Class2(s1);
		P2.inpsample14_POM_Class2MPIN();
		P2.Clksample14_POM_Class2Continue();
		
		
		sample14_POM_Class3 P3= new sample14_POM_Class3(s1);
		P3.UserIDsample14_POM_Class3();
		
	}
}
