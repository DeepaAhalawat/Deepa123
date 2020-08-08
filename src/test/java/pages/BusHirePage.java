package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BusHirePage {

	WebDriver driver;
	
	@FindBy(xpath="//a[text()='BUS HIRE ']")
	WebElement BusHireClick;
	
	
	
	public BusHirePage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	
	
	public void clickbusHiretab()
	{
		BusHireClick.click();
		
		
	}
	
	
	public String getTitle()
	{
		
	 return driver.getTitle();
		
		
	}
}
