package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Library.BasePage;

public class GoogleHomePO extends BasePage
{
	
	public GoogleHomePO(WebDriver driver) 
	{
		super(driver);
		
	}
	@FindBy(name="q")
	private WebElement searchTxtBx;
	
	public WebElement searchTxtBx() {
		// TODO Auto-generated method stub
		return searchTxtBx;
	}
	
}
