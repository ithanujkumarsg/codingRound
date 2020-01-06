import codoingRound.Base;
import pageObjects.HotelsPage;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class HotelBookingTest extends Base {

    WebDriver driver;
    HotelsPage hotelsPage;
    
    @BeforeClass
	public void BeforeClass() throws IOException
	{
		driver = initializeDriver();
		hotelsPage = new HotelsPage(driver);
	}
	
	@AfterClass
	public void AfterClass()
	{
		driver.quit();
	}

    @Test
    public void SearchHotel_SubmitAllDetails_VerifyAbleToSearchHotel() {
       
    	hotelsPage.getHotelsButton().click();
    	hotelsPage.getLocalityTextBox().sendKeys("Indiranagar, Bangalore");
        new Select(hotelsPage.getTravellerSelection()).selectByVisibleText("1 room, 2 adults");
        hotelsPage.getHotelsSearchButton().click();
    }
}
