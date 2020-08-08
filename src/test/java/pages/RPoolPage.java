package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RPoolPage {

	@FindBy(css="a#cars")
	public WebElement rPoolClick;
	
	@FindBy(css="h1.banner-heading")
	public WebElement MessageOnClickrPool;
	
	WebDriver driver;
	public RPoolPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	
	public void clickRPooltab()
	{
		rPoolClick.click();
		
	}
	
	public String msgOnClickrPool()
	{
		return MessageOnClickrPool.getText();
		
	}
	
	  
	
}
