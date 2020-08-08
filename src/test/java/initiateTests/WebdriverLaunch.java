package initiateTests;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import org.slf4j.LoggerFactory;

import managers.PropertyFileManager;

public class WebdriverLaunch {

	static WebDriver driver;
	
	public static WebDriver getWindowDriver() throws IOException
	{
		
       String browserVariable=PropertyFileManager.getPropertyValue("config", "browser");
		
		if (browserVariable.equalsIgnoreCase("Chrome"))
		{
	    ChromeOptions opt= new ChromeOptions();
	    opt.addArguments("--disable-notifications");
	    System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\drivers\\chromedriver_windows.exe");
	    driver=new ChromeDriver(opt);
		}
		
		else if (browserVariable.equalsIgnoreCase("FireFox"))
		{
		}
		
		else {System.out.println("no driver selected");}
		
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(10 , TimeUnit.SECONDS);
	    return driver;
	 
		
		
		
	}
}
