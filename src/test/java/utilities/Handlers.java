package utilities;





import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import stepDefinition.BaseClass;




public class Handlers extends BaseClass{

	private static String assertionErrorConstant = "Assertion Error!!!! \n ";
	
	WebDriverWait wait;
	
	public Handlers(WebDriver driver2) {
		// TODO Auto-generated constructor stub
	}
	/**
	 * Launches the URL
	 * @param url
	 */
	
	public void launchApplicationURL(String url) {
        driver.get(url);
    }
	
	/***
	 * 
	 * @param element webdriver waits for element to be loaded
	 */
	
	
	  public void setWebDriverWait(WebElement element) {
	        try {
	            wait.until(ExpectedConditions.visibilityOf(element));
	        } catch (StaleElementReferenceException e) {
	            wait.until(ExpectedConditions.not(ExpectedConditions.stalenessOf(element)));
	        } catch (WebDriverException e) {
	            
	            throw new WebDriverException("Element " + element + " is not visible \n " + e);
	        }
	    }

	/***
	 * 
	 * @param actualValue
	 * @param expectedValue
	 * @param message
	 */
	public void verifyEquals(Object actualValue, Object expectedValue) {
		try {
			Assert.assertEquals(actualValue, expectedValue);
		} catch (AssertionError e) {

			throw new AssertionError(assertionErrorConstant+ e);
		}
	}
	

	
	/***
	 * Method is used to click on the element
	 * 
	 * @param element        Element which needs to be clicked
	 * @param waitForElement Wait for Element to be present after the click action
	 */
	public void clickElement(WebElement element, WebElement... waitForElement) {
		try {
			if (element != null) {
				
				element.click();
			}
		} catch (WebDriverException e) {
			
			throw new WebDriverException("Unable to click on the element: " + element + "\n " + e);
		}
		if (waitForElement != null && waitForElement.length > 0) {
			setWebDriverWait(waitForElement[0]);
		}
	}
	
	  private void waitForElementTobeLoaded(WebElement element) {
	        wait.until(ExpectedConditions.not(ExpectedConditions.stalenessOf(element)));

	    }
	/***
	 * Method is used to enter text into element
	 * 
	 * @param element        which you are going to enter the text
	 * @param text           character sequence to send to the element
	 * @param waitForElement Wait for Element to be present after entering text.
	 */
	public void writeText(WebElement element, String text, WebElement... waitForElement) {
		try {
			if (element != null) {
				//waitForElementTobeLoaded(element);
				element.click();
				element.clear();
				element.click();
				element.sendKeys(text);
			}
		} catch (WebDriverException e) {
			
			throw new WebDriverException("Unable to enter text on the element: " + element + "\n " + e);
		}
		if (waitForElement != null && waitForElement.length > 0) {
			setWebDriverWait(waitForElement[0]);
		}
	}  
	public void moveToElement(WebElement element, WebElement... waitForElement) {
        try {
            if (element != null) {
                Actions actions = new Actions(driver);
                actions.moveToElement(element).build().perform();
            }
        } catch (WebDriverException e) {
         
            throw new WebDriverException("Unable to move to element: " + element + "\n" + e);
        }
        if (waitForElement != null && waitForElement.length > 0) {
            setWebDriverWait(waitForElement[0]);
        }
        
        
    }
	/**
	 * Method is used to move the mouse and enter the test
	 * @param element
	 * @param keys
	 * @param waitForElement
	 */
	 public void moveToElementandSendkeys(WebElement element, String keys, WebElement... waitForElement) {
	        try {
	            if (element != null) {
	                Actions actions = new Actions(driver);
	                actions.moveToElement(element).click().sendKeys(keys).build().perform();
	                //actions.sendKeys(Keys.chord(Keys.SHIFT + "w")).build().perform();
	            }
	        } catch (WebDriverException e) {
	          
	            throw new WebDriverException("Unable to move to element: " + element + "\n" + e);
	        }
	        if (waitForElement != null && waitForElement.length > 0) {
	            setWebDriverWait(waitForElement[0]);
	        }
	    }
	 
	 public void waitForXpathToLoad(String xpath) {
	        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpath)));
	    }
	 
	 /**
	  * Method Verifies is the Webelement displayed
	  */

	 public boolean isElementDisplayed(WebElement element) {
			boolean isTrue = false;
			try {
				if (element.isDisplayed()) {
					isTrue = true;
				}
			} catch (WebDriverException e) {
				throw new WebDriverException("Element " + element + " is not displayed \n " + e);
			}
			return isTrue;
		}
	 
		

}
