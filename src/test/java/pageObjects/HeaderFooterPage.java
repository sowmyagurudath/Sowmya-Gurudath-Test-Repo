package pageObjects;


import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import utilities.Handlers;



public class HeaderFooterPage {
	public WebDriver driver;
	public Handlers Handlers;
	
	public HeaderFooterPage(WebDriver driver)
	{
		this.driver=driver;
	PageFactory.initElements(driver,this);
	Handlers=new Handlers(driver);
	}
	
	
	
	@FindBy(xpath="//span[@class='fxg-mouse']")
	public static List<WebElement> header;
	
	
	@FindBy(xpath="fxg-link fxg-dropdown-js  fxg-keyboard")
	public static List<WebElement> headerDD;
	
	
	//verifies header
	public void header() throws InterruptedException
	{

		
		String text=header.get(1).getText();
	
		
	
	   Assert.assertEquals(text, "Shipping");
	   
	   
	   Assert.assertEquals(header.get(2).getText(), "Tracking");
	   Assert.assertEquals(header.get(3).getText(), "Support");
	   Assert.assertEquals(header.get(4).getText(), "Account");
	Handlers.isElementDisplayed(header.get(5));
	  
	}
	//verifies footer
	
	public void footer()
	{
		 Assert.assertEquals(header.get(7).getText(), "Site Map");
		 Assert.assertEquals(header.get(8).getText(), "Terms of Use");
		 Assert.assertEquals(header.get(9).getText(), "Privacy Policy");
	}
	
	
	
}