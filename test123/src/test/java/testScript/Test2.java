package testScript;

import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import Library.BaseTest;
import pom.GoogleHomePO;
import pom.GoogleSearchPO;

public class Test2 extends BaseTest{
	@Test
	public void testFaceBookHkome()	{	
		wait=new WebDriverWait(driver, 20);
		driver.get("https://google.com");
		GoogleHomePO googprPO=new GoogleHomePO(driver);
		googprPO.searchTxtBx().sendKeys("instagram"+Keys.ENTER);
		GoogleSearchPO searchpo=new GoogleSearchPO(driver);
		searchpo.verifyElement(searchpo.instaLink());
		searchpo.instaLink().click();
		WebDriverWait wait = new WebDriverWait(driver, 10);
		String eTitle= "Instagram";
		wait.until(ExpectedConditions.titleContains(eTitle));	
		String aTitle = driver.getTitle();
		Reporter.log("Tital displayed is"+aTitle,true);
		Assert.assertEquals(aTitle,eTitle);	
		
	}

}
