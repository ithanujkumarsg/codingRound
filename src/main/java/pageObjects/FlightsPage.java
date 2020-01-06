package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class FlightsPage {

	 WebDriver driver;
	
	 public FlightsPage(WebDriver driver)
	 {
		 this.driver = driver;
	 }
	 
	 By OneWay = By.id("OneWay");
	 By FromTag = By.id("FromTag");
	 By ToTag = By.id("ToTag");
	 By originOptions = By.id("ui-id-1");
	 By destinationOptions = By.id("ui-id-2"); 
	 By SearchBtn = By.id("SearchBtn");
	 By searchSummary = By.className("searchSummary");
	 By list = By.tagName("li");
	 By date = By.xpath("//*[@id='ui-datepicker-div']/div[1]/table/tbody/tr[3]/td[7]/a");
	 
	 public WebElement getOneWay()
	 {
		 return driver.findElement(OneWay);
	 }
	 
	 public WebElement getFrom()
	 {
		 return driver.findElement(FromTag);
	 }
	 
	 public WebElement getTo()
	 {
		 return driver.findElement(ToTag);
	 }
	 
	 public List<WebElement> getOriginOptions()
	 {
		 return driver.findElement(originOptions).findElements(list);
	 }
	 
	 public List<WebElement> getDestinationOptions()
	 {
		 return driver.findElement(destinationOptions).findElements(list);
	 }
	 
	 public WebElement getSearchBtn()
	 {
		 return driver.findElement(SearchBtn);
	 }
	 
	 public WebElement getsearchSummary()
	 {
		 return driver.findElement(searchSummary);
	 }
	 
	 public WebElement getDate()
	 {
		 return driver.findElement(date);
	 }
}
