package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignInPage {

	 WebDriver driver;
	
	 public SignInPage(WebDriver driver)
	 {
		 this.driver = driver;
	 }
	 
	 By yourTrips = By.linkText("Your trips");
	 By signIn = By.id("SignIn");
	 By signInButton = By.id("signInButton");
	 By errors1 = By.id("errors1");
	 
	 public WebElement getYourTrips()
	 {
		 return driver.findElement(yourTrips);
	 }
	 
	 public WebElement getSignIn()
	 {
		 return driver.findElement(signIn);
	 }
	 
	 public WebElement getSignInButton()
	 {
		 return driver.findElement(signInButton);
	 }
	 
	 public WebElement geterrors1()
	 {
		 return driver.findElement(errors1);
	 }
}
