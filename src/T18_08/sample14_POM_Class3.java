package T18_08;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class sample14_POM_Class3 
{
  @FindBy(xpath = "//span[text()='KXW990']") private WebElement userID;
  
  
  
  sample14_POM_Class3(WebDriver driver)
  {
	  
	  PageFactory.initElements(driver , this);
  }
  
  public void UserIDsample14_POM_Class3() 
  {
	String ACT = userID.getText();
	String EXP = "KXW990";
	
	
	if (ACT.equals(EXP)) 
	{
	
		System.out.println("Passed");
	}
	else
	{
		System.out.println("Failed");
	}
}
  
  
}
