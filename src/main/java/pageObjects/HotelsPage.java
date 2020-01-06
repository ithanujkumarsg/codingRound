package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HotelsPage {


	 WebDriver driver;
	
	 public HotelsPage(WebDriver driver)
	 {
		 this.driver = driver;
		 PageFactory.initElements(driver, this);
	 }
	 
	 @FindBy(linkText = "Hotels")
     private WebElement hotelLink;

     @FindBy(id = "Tags")
     private WebElement localityTextBox;

     @FindBy(id = "SearchHotelsButton")
     private WebElement searchButton;

     @FindBy(id = "travellersOnhome")
     private WebElement travellerSelection;
     
     public WebElement getHotelsButton() {
    	 return hotelLink;
     }
     
     public WebElement getLocalityTextBox() {
    	 return hotelLink;
     }
     
     public WebElement getHotelsSearchButton() {
    	 return hotelLink;
     }
     
     public WebElement getTravellerSelection() {
    	 return travellerSelection;
     }
}
