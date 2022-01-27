package stepDefinition;



import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import pageObjects.HeaderFooterPage;
import pageObjects.HomePage;
import pageObjects.LanguageSelection;

public class BaseClass {

	
	public static WebDriver driver;
	public LanguageSelection t;
    public HeaderFooterPage hf;
    public HomePage hp;
    public Properties config;
    
    
    public void ScreenShot() throws IOException {
    	Date d = new Date();
        System.out.println(d.toString());
        
   
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH-mm-ss");   
        TakesScreenshot scrShot =((TakesScreenshot)driver);
		 File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
		
        FileUtils.copyFile(SrcFile,  new File("./test/Screenshots/sample\\"+sdf.format(d)+".png"));
        
        
      
		
    }
    
}
