package tests;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import initiateTests.initClass;
import managers.PropertyFileManager;
import pages.RedBusHomePage;
import utils.Takescreenshot;



//@Listeners(reporting.ListenersImplementation.class)
public class RedBusHomePageTest extends initClass {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(RedBusHomePageTest.class);
	@Test
	public void bookTicketforRedBus() throws IOException, InterruptedException
	{
		
		LOGGER.info("Running test case Book Ticket for RedBus");
		homePage.selectCityFromDropDown();
	
		homePage.selectCityToDropDown();
		homePage.dateSelect();
		homePage.searchbuttonClick();
		Thread.sleep(5000);
		homePage.safetyPou_up();
		Thread.sleep(3000);
	    //homePage.importantTipClick();
		//homePage.scrollDown();
		//homePage.viewSeatClick();
		//Thread.sleep(5000);
		//homePage.clickBusSeat();
		
	   
		// Assert.assertEquals(homePage.errorMsgOnNobusFound(),"Oops! No buses found.");//Assertion on Oops no bus found for FromCity KasmiriGate to City-Dehradun
	    String fromcity=PropertyFileManager.getPropertyValue("RedBusHomePage","FromDropDownValue");
	    String tocity=PropertyFileManager.getPropertyValue("RedBusHomePage","ToDropDownValue");
		//Assert.assertEquals(homePage.getTextforFromCity(), fromcity);  // Assertion on Showing 13 buses from Kashmiri Gate, Delhi to Amritsar
		//Assert.assertEquals(homePage.getTextfortoCity(), tocity);
		
		//Take Screenshot
		Takescreenshot.takescreen("bookTicketforRedBus");
		
	}
	
	@Test
	public void getTitleHomePage() throws IOException
	{
		LOGGER.info("Running testcase Get RedBus home page title");	
	String title=homePage.getTitle();
    Assert.assertEquals(title, "Book Bus Travels, AC Volvo Bus, rPool & Bus Hire - redBus IndiaS");
	System.out.println("HomePageTitle "+title);
	    
	Takescreenshot.takescreen("getTitleHomePage");
	}


}
