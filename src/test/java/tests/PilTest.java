package tests;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import initiateTests.initClass;

public class PilTest extends initClass{

	private static final Logger LOGGER = LoggerFactory.getLogger(RedBusHomePageTest.class);

	
	@Test
	public void bookTicketForRedBusPil() throws IOException, InterruptedException
	{
		LOGGER.info("Book ticket for RedBus pilgrimage");
		pilPage.clickPiligrimageTab();
		Thread.sleep(2000);
	    pilPage.selectCityfromDropdown();
	    Thread.sleep(3000);
	    pilPage.selectCityToDropDown();
	    //Thread.sleep(5000);
	   // pilPage.selectDate();
	    Thread.sleep(3000);
	    pilPage.searchButtonClick();
	  // String bcgclr= pilPage.backGroundColorPiligrimage();
	   //System.out.println(bcgclr);
	 //  Assert.assertEquals(bcgclr,"rgba(15, 67, 163, 1)");
	
		
	}
	
	
	
	
}
