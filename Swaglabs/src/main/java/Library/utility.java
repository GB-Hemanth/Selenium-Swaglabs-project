package Library;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class utility extends Baseclass

{
	

	public static String readEXdata(String key) throws IOException
	{
FileInputStream file=new FileInputStream(System.getProperty("user.dir")+"./Resources/config.properties");
Properties prop=new Properties();
prop.load(file);
String value = prop.getProperty(key);
return value;
}
	
	public static void CapturefailSS(int TCID) throws IOException
	{
	
	File dst = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	File src=new File(System.getProperty("user.dir")+"./Resources/FailesTC"+TCID+"png");
	org.openqa.selenium.io.FileHandler.copy(src, dst);
	
		
	}

		
	}
	
	
	

