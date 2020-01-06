import codoingRound.Base;
import pageObjects.FlightsPage;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Helpers.PageHelper;

import java.io.IOException;

public class FlightBookingTest extends Base{

	FlightsPage flightsPage;
	
	@BeforeClass
	public void BeforeClass() throws IOException
	{
		driver = initializeDriver();
		flightsPage = new FlightsPage(driver);
	}
	
	@AfterClass
	public void AfterClass()
	{
		driver.quit();
	}
	
    @Test
    public void SearchFlight_OneWayJourney_VerifyResultsAppear() {

    	flightsPage.getOneWay().click();
    	flightsPage.getFrom().clear();
    	flightsPage.getFrom().sendKeys("Bangalore");
    	flightsPage.getOriginOptions().get(0).click();
    	flightsPage.getTo().clear();
    	flightsPage.getTo().sendKeys("Delhi");
    	flightsPage.getDestinationOptions().get(0).click();
    	flightsPage.getDate().click();
    	flightsPage.getSearchBtn().click();
    	Assert.assertTrue(PageHelper.isElementPresent(driver, By.className("searchSummary")));
    }
}
