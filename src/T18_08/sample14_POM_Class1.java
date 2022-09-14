package T18_08;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class sample14_POM_Class1
{

	@FindBy(xpath = "//input[@id='userid']") private WebElement UN;
	@FindBy(xpath = "//input[@id='password']") private WebElement PSW;
	@FindBy(xpath = "//button[@class='button-orange wide']") private WebElement Clk;
	
	
	
	sample14_POM_Class1(WebDriver driver)
	{
		PageFactory.initElements(driver , this);
	}
	
	public void inpsample14_POM_Class1USername()
	{
	UN.sendKeys("KXW990");	
	}
	public void inpsample14_POM_Class1Password() {
		
	PSW.sendKeys("Safwan1802@");	
	}
	public void Clicksample14_POM_Class1_clkbutton() {
		Clk.click();
	}
	
	
	
	
}
