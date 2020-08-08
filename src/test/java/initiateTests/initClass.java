package initiateTests;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.aventstack.extentreports.ExtentReports;

import pages.BusHirePage;
import pages.PilPages;
import pages.RPoolPage;
import pages.RedBusHomePage;
import reporting.ExtentManager;
import reporting.ReportingClass;
import tests.RedBusHomePageTest;

public class initClass {
	private static final Logger LOGGER = LoggerFactory.getLogger(initClass.class);
	public static WebDriver driver;
	protected static RedBusHomePage homePage;
	protected static BusHirePage busHire; 
	protected static PilPages pilPage;
	protected static RPoolPage rPoolPage;
	public static ExtentReports report;
	
	@BeforeClass
	public void launchBrowser() throws IOException
	{
	   driver=WebdriverLaunch.getWindowDriver();
	    System.out.println("launching browser");
		createPageObjects();
		report=ExtentManager.setUp("Extent_Reports");
		 
		
	}
	public static void createPageObjects()
	{
	//Object of pages
	 LOGGER.info("creating object of classes");
     homePage= new RedBusHomePage(driver);
     busHire = new BusHirePage(driver);
     pilPage = new PilPages(driver);
     rPoolPage= new RPoolPage(driver);
	}
   
	
	
	
	@BeforeMethod
	public void launchURL()
	{
		

	 driver.get("https://www.redbus.in/");
	 LOGGER.info("Loading RedBUS Home page URL");
		
	}
	
	@AfterClass
	public void closeBrowser()
	{
		
		driver.close();
		ReportingClass.putReport();
	}
}
