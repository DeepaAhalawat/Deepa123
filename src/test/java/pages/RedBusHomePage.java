package pages;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import managers.PropertyFileManager;

public class RedBusHomePage {

	private static final Logger LOGGER = LoggerFactory.getLogger(RedBusHomePage.class);
	WebDriver driver;
	
	@FindBy(xpath="//span[text()='Kashmiri Gate, Delhi']")
	public WebElement getTextfromText;
	
	@FindBy(xpath="(//span[text()='Amritsar'])[1]")
	public WebElement getTextfromText1;
	
	@FindBy(css="input#src")
	public WebElement searchFromDropDown;
	
	@FindBy(css="input#dest")
	public WebElement searchToDropDown;
	
	@FindBy(css="ul.autoFill>li")
	public List<WebElement> dropDownList;
	
	@FindBy(css="td.current.day")
	public WebElement SelectDate;
	
	@FindBy(css="button#search_btn")
	public WebElement searchButton;
	
	@FindBy(css="div.error-view>h3")
	public WebElement errorOOPS_Message;
	
	@FindBy(css="i.icon.icon-close")
	public WebElement safetyPopup;
	
	@FindBy(xpath="//span[text()='Ok, got it']")
	public WebElement clickImpTip;
	
	@FindBy(xpath="(//div[text()='View Seats'])[1]")
	public WebElement  viewSeat;
	
	
	@FindBy(xpath="//canvas[@data-type='lower']")
	public WebElement busCanvas;
	
	public RedBusHomePage(WebDriver driver)
	{
		
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	public void selectCityFromDropDown() throws IOException
	{
		
		searchFromDropDown.sendKeys("Kash");
		
		String fromCity=PropertyFileManager.getPropertyValue("RedBusHomePage", "FromDropDownValue");
		// = prop.getProperty("searchFromDropDownList");
		for(WebElement e:dropDownList)
		{
			
			if(e.getText().contains(fromCity));
			e.click();
			break;
		}	
		LOGGER.info("Entering Kash in From dropdown");
	}
	
	public void selectCityToDropDown() throws IOException
	{
		searchToDropDown.sendKeys("Amrit");
		
		
		String toCity=PropertyFileManager.getPropertyValue("RedBusHomePage", "ToDropDownValue");
		for(WebElement ee:dropDownList)
		{
			ee.getText().equalsIgnoreCase(toCity);
			ee.click();
			break;
			
		}	
		LOGGER.info("Entering Dehradun to dropdown");
	}
	
	
	public void dateSelect()
	{
		
		SelectDate.click();	
		LOGGER.info("Entering todays date");
	}
	
	public void searchbuttonClick()
	{
		
		searchButton.click();
		 	
		LOGGER.info("Clicking on Search Button");
	}
	
	public String errorMsgOnNobusFound()
	{
		LOGGER.info("Error message on no bus found");
		return errorOOPS_Message.getText();
	 	
	}
	
	public String getTitle()
	{
		LOGGER.info("Home page title");
		return driver.getTitle();
	
		
	}
	
	public void safetyPou_up()
	{
		try {
			
			
		safetyPopup.click();
		
		System.out.println("cliked");
		}
	    
		catch(Exception e)
		{
		System.out.println("Exception"+e);	
		}
		
		LOGGER.info("Safety popup clicked");
}
	
	public void importantTipClick()
	{
		clickImpTip.click();
		
		
	}
	

	public void  viewSeatClick()
	{
		viewSeat.click();
		LOGGER.info("View Seat clicked");
		
	}
	
	public void scrollDown()
	{
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,300)");
		System.out.println("Scroll down");
	}
	
	public void clickBusSeat() {
		
		Actions act= new Actions(driver);
		act.moveToElement(busCanvas,200,35).click().build().perform();
		//System.out.println("Clicked bus seat");
		LOGGER.info("Bus clicked");
		
		
	}
	
	public String getTextforFromCity()
	{
		
	LOGGER.info("Return From City mentioned in text");	
	return getTextfromText.getText();
	
		
	}
	
	public String getTextfortoCity()
	{
		
	LOGGER.info("Return To City mentioned in text");	
	return getTextfromText1.getText();
	
		
	}
}
