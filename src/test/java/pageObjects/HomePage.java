package pageObjects;


import java.util.List;
import java.util.Set;

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
public class HomePage {
	
	public WebDriver driver;
	public Handlers Handlers;
	
	
	
	@FindBy(xpath="//div[@class='va_icon']")
	public static WebElement asnt;

	
	@FindBy(xpath=" //textarea[@class='nw_UserInputField nw_UserInputFocus']")
	public static WebElement textBox;

	

	@FindBy(xpath=" //div[@class='nw_UserSubmit nw_Disabled popin_fedex_ask']")
	public static WebElement submit;
	
	
	@FindBy(xpath="//div[@class='nw_CloseXX']")
	public static WebElement close;
	
	@FindBy(xpath="//button[@class='fxg-cube__content']")
	public static List<WebElement> box;
	
	@FindBy(xpath=" //label[@id='userIdLabel']")
	public static WebElement loginPage;
	
	@FindBy(xpath="//input[@name='trackingnumber']")
	public static WebElement trackNo;
	
	@FindBy(xpath="//button[@id='btnSingleTrack']")
	public static WebElement trackbtn;
	
	@FindBy(xpath="//div[@class='screen-reader-only']")
	public static WebElement trackpg;
	
	@FindBy(xpath="//div[@class='wtrk-wrapper']")
	public static WebElement rateText;
	

public HomePage(WebDriver driver)
	{
		this.driver=driver;
	PageFactory.initElements(driver,this);
	Handlers=new Handlers(driver);
	
	
		
	}
	//Methods to verify chatbox


public void Assistant() throws InterruptedException
{
	//Handlers.setWebDriverWait(asnt);
	Thread.sleep(2000);
	Handlers.clickElement(asnt);
}

public void verifyAssnt()
{
	Handlers.isElementDisplayed(submit);
}

//Methods to verify ship category
public void ship() throws InterruptedException
{
	WebElement ship=box.get(2);
	Handlers.clickElement(ship);
}

   

public void verifyLgn() throws InterruptedException

{
	Thread.sleep(3000);
	Handlers.isElementDisplayed(loginPage);
}
//Methods to verify track category
public void track()

{
	Handlers.clickElement(box.get(1));
	
	
}
  public void trackenterID(String S)
{
	Handlers.writeText(trackNo, S);
	Handlers.clickElement(trackbtn);
	
}

  public void trackpg() throws InterruptedException
  {
	 Thread.sleep(5000);
	  Handlers.isElementDisplayed(trackpg);
  }
  ////Methods to verify rateNtransit category
  
  public void rateAndTransit()
  {
		Handlers.clickElement(box.get(0));
		
		
  }
  
  public void rates() throws InterruptedException
  {
	  Thread.sleep(3000);
	 Handlers.isElementDisplayed(rateText);
  }
}





	
		


