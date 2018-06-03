package testScript;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import pom.GoogleHomePO;
import pom.GoogleSearchPO;
//import pom.SearchPO;
import Library.BaseTest;

public class Test1 extends BaseTest
{
	
	@Test
	public void testFaceBookHkome()	{	
		wait=new WebDriverWait(driver, 20);
		driver.get("https://google.com");
		GoogleHomePO googprPO=new GoogleHomePO(driver);
		googprPO.searchTxtBx().sendKeys("facebook"+Keys.ENTER);
		GoogleSearchPO searchpo=new GoogleSearchPO(driver);
		searchpo.verifyElement(searchpo.facebooklink());
		searchpo.facebooklink().click();
		WebDriverWait wait = new WebDriverWait(driver, 10);
		String eTitle= "Facebook – log in or sign up1";
		wait.until(ExpectedConditions.titleContains(eTitle));	
		String aTitle = driver.getTitle();
		Reporter.log("Tital displayed is"+aTitle,true);
		Assert.assertEquals(aTitle,eTitle);	
	}
	
}
