package pages;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import managers.PropertyFileManager;

public class PilPages {

	WebDriver driver;
	
	@FindBy(css="input#source_city")
	public WebElement searchFromDropDown;
	
	@FindBy(css="ul.show.suggestions-wrapper.fade-in >li")
	public List<WebElement> dropDownList;
	
    @FindBy(css="a#pilgrimages")
	public WebElement pilgrimagetabClick;
	
	@FindBy(css="input#dest_city")
	public WebElement searchToDropDown;
	 
    @FindBy(css="ul.show.suggestions-wrapper.fade-in >li")
	public List<WebElement> dropDownList1;
	
	@FindBy(css="input#doj")
	public WebElement dateSelect;
	
	@FindBy(css="button#search_packages")
	public WebElement buttonSearchClicked;
	
	@FindBy(css="div.modify_header")
	public WebElement backgroundColorPil;
	
	public PilPages(WebDriver driver)
	{
		
		this.driver=driver;
		PageFactory.initElements(driver,this);
		
	}
	
	public void clickPiligrimageTab()
	{
		
		pilgrimagetabClick.click();
		
		
	}
	public void selectCityfromDropdown() throws IOException, InterruptedException
	{
		
		searchFromDropDown.sendKeys("Kat");
		
		String fromCity= PropertyFileManager.getPropertyValue("Pilgrimage", "FromDropDownValue");
		//System.out.println(fromCity);
		
		Thread.sleep(3000);
		for(WebElement e: dropDownList)
		{
			if(e.getText().equalsIgnoreCase(fromCity))
			{
				System.out.println(e.getText());
				
				e.click();
			    break;
			
			}
			
			
		}
		
	}
	
	public void selectCityToDropDown() throws IOException, InterruptedException
	{
		searchToDropDown.sendKeys("Kat");
		String toCity= PropertyFileManager.getPropertyValue("Pilgrimage", "ToDropDownValue");
		//System.out.println(toCity);
		
		Thread.sleep(3000);
		for(WebElement ee: dropDownList1)
		{
			if(ee.getText().contains(toCity))
			{
			  //System.out.println(ee.getText());
				ee.click();
			    break;
			
			}
			
			
		}
		
	}
	
	public void selectDate()
	{
		
		dateSelect.click();
		
	}
	
	public void searchButtonClick()
	{
		buttonSearchClicked.click();
		
	}
	
	public String backGroundColorPiligrimage()
	{
	   	
		//return backgroundColorPil.getCssValue("color");//color of text

		return backgroundColorPil.getCssValue("background-color");//background color
	}
	
}
