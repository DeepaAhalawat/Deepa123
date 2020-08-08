package tests;

import org.testng.annotations.Test;

import initiateTests.initClass;

public class BusHireTest extends initClass {

	@Test
	public void BusHireclick()
	{
		busHire.clickbusHiretab();	
	  	
		//homePage.dateSelect();
	}
	
	@Test
	public void getBusHirepageTitle()
	{
		busHire.clickbusHiretab();	
		String str= busHire.getTitle();
		System.out.println("BushirePagetitle "+str);
		
	}
	
	
	
}
