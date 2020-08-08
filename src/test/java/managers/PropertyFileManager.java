package managers;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyFileManager {

	public static FileInputStream fis;
	public static Properties prop;
	
	public static String getPropertyValue(String PropertyFileName,String Key) throws IOException
	{
		
		fis = new FileInputStream("src\\test\\resources\\propertyFiles\\"+PropertyFileName+".properties");
	    prop= new Properties();
		prop.load(fis);
	    return prop.getProperty(Key);
		
		
	}
}
