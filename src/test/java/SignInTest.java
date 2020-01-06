import codoingRound.Base;
import pageObjects.SignInPage;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Helpers.PageHelper;

public class SignInTest extends Base{

	SignInPage signInPage;
	
	@BeforeClass
	public void BeforeClass() throws IOException
	{
		driver = initializeDriver();
		signInPage = new SignInPage(driver);
	}
	
	@AfterClass
	public void AfterClass()
	{
		driver.quit();
	}
	
    @Test
    public void SignIn_NoCredentialsSupplied_VerifyErrorThrown(){
    	
    	signInPage.getYourTrips().click();
    	signInPage.getSignIn().click();
    	
    	List<WebElement> frames = driver.findElements(By.tagName("iframe"));
    	for(int i=1; i<=frames.size();i++)
    	{
    		driver.switchTo().frame(i);
    		
    		if(PageHelper.isElementPresent(driver, By.id("signInButton"))){
    			signInPage.getSignInButton().click();
    			break;
    		}
    	}
    	
    	String errors1 = signInPage.geterrors1().getText();
    	
    	Assert.assertTrue(errors1.contains("There were errors in your submission"), "Unexpected error message");
    }
}
