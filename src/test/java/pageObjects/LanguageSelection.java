package pageObjects;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.google.common.collect.Iterables;

import utilities.Handlers;
public class LanguageSelection {
	
	public WebDriver driver;
	public Handlers Handlers;
	
	
	

	@FindBy(xpath="//a[@class='fxg-button fxg-button--orange fxg-geo-locator__button js-geo-country-url']")
	public static WebElement Nederlands;
	
	
	@FindBy(xpath="//a[@class='fxg-geo-locator__link-anchor js-geo-country-url']")
	public static WebElement English;
	
	@FindBy(xpath="//a[@class='fxg-button fxg-button--outline fxg-geo-locator__button js-geo-country-url']")
	public static WebElement EnglishUK;
	
	@FindBy(xpath="//a[@class='fxg-geo-locator__global-link js-geo-global-url']")
	public static WebElement ChooseOthers;
	
	@FindBy(xpath="//a[@class='fxg-u-modal__close js-modal-close']")
	public static WebElement close;
	
	@FindBy(xpath="//button[@id='btnSingleTrack']")
	public static WebElement trackbtn;
	
	@FindBy(xpath="//h1[@class='fxg-title fxg-supscript']")
	public static WebElement slctRegion;
	
	@FindBy(xpath="//button[@class='fxg-cookie-consent__apply fxg-button fxg-button--orange fxg-button--orange-secondary js-fxg-cookie-save']")
	public static WebElement applyStng;
	
	@FindBy(xpath="//button[@class='fxg-cookie-consent__accept fxg-button fxg-button--orange js-fxg-cookie-save is-save-all']")
	public static WebElement acceptAll;
	
	@FindBy(xpath="//input[@id='level2']")
	public static WebElement chbx1;
	
	@FindBy(xpath="//input[@id='level3']")
	public static WebElement chbx2;
	
	
	



public LanguageSelection(WebDriver driver)
	{
		this.driver=driver;
	PageFactory.initElements(driver,this);
	Handlers=new Handlers(driver);
	
		
	}
	
		public void testBrowser() throws InterruptedException {
		  

	   Handlers.launchApplicationURL(" https://www.fedex.com/en-gb/home.html");
	    
	   
	    
	    }
		//Methods to select different languages
		
		public void selectNederlands()
		{ 
			
			Handlers.clickElement(Nederlands);
			
		
	}
		public void selectEnglish()
		{ 
			
			Handlers.clickElement(English);
			
		
	}
		
		public void selectEnglishUK()
		{ 
			
			Handlers.clickElement(EnglishUK);
			
		
	}
		//Select region
		
		public void selectOtherRegion()
		{ 
			
			Handlers.clickElement(ChooseOthers);
			
		
	}
		//Close the pop-up
		public void closeWindow()
		{ 
			
			Handlers.clickElement(close);
			
		
	}
		//Verifies the homepage text
		public void verifyButtonNL(String lan)
		{
			String text=trackbtn.getText();
		
			Handlers.verifyEquals(text, lan);
		}
		
		public void verfiyLanguage()
		{
			Handlers.isElementDisplayed(slctRegion);
			
			
		}
		//Accept cookies
		public void aplystng() throws InterruptedException
		{
			Thread.sleep(500);
			Handlers.clickElement(applyStng);
			
		}
		
		public void acceptAll()
		{
			
			Handlers.clickElement(acceptAll);
			
			
		}
}

	
		


