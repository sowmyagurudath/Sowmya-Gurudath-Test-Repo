package stepDefinition;

import java.io.File;
import org.openqa.selenium.chrome.ChromeDriver;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeOptions;



import io.github.bonigarcia.wdm.WebDriverManager;
import cucumber.api.java.After;
import cucumber.api.java.Before;




public class StepDefinitionSetup extends BaseClass{
	
	
	

	@Before//Open the browser
	public void setUp() throws IOException
	{
		config=new Properties();
		FileInputStream configFile= new FileInputStream("config.properties");
		config.load(configFile);
		
		String browser=config.getProperty("browser");
		
	
		
		if(browser.equalsIgnoreCase("chrome"))
		{
		
			
			  WebDriverManager.chromedriver().setup();

		      ChromeOptions options = new ChromeOptions();

		

		            driver=new ChromeDriver(options);


	   driver.manage().window().maximize();
	   driver.manage().deleteAllCookies();
		}
	  
	}
	
	public static WebDriver getDriver() {
		return driver;
	}
	@After//Close the browser
	public void teardown() throws IOException
	
	{

        driver.quit();
		
		
		
	}
	
	
}
