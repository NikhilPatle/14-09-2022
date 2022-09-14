package T18_08;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class sample14_POM_Class2 
{

	@FindBy(xpath = "//input[@id='pin']")private WebElement MPIN;
	@FindBy(xpath = "//button[@class='button-orange wide']")private WebElement CTN;
	
	
	sample14_POM_Class2 (WebDriver driver)

	{
		PageFactory.initElements(driver , this);
		
	}
	
	public void inpsample14_POM_Class2MPIN()
	{
	
		MPIN.sendKeys("180216");
	}
	public void Clksample14_POM_Class2Continue() 
	{
		
		CTN.click();
	}
}
