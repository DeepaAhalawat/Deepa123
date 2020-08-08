package tests;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;

import initiateTests.initClass;

public class RPoolTest extends initClass{
	private static final Logger LOGGER = LoggerFactory.getLogger(RedBusHomePageTest.class);
	@Test
	public void clickRPoolNewTab()
	{
		
		//throw new SkipException("It is skipped as Implemetation is going on");
		LOGGER.info("Running testcase Rpool test page clicktab ");
		rPoolPage.clickRPooltab();
	
		Assert.assertEquals(rPoolPage.msgOnClickrPool(), "Bike pool & Carpool for Professionals");
	}
	
}
