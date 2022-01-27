package stepDefinition;





import cucumber.api.java.en.*;

import pageObjects.HomePage;



public class HomePageStepDefinition extends BaseClass{
	
	
	public HomePageStepDefinition() {
		driver = StepDefinitionSetup.getDriver();
		
    	
	}

	
			

	  //HomePage
    
	  

	   

	 @When("^I click on Assitance$")
	    public void i_click_on_assitance() throws Throwable {
		 hp=new HomePage(driver);
		 hp.Assistant();
	      
	    }
	 @Then("^I should able to extand$")
	    public void i_should_able_to_extand() throws Throwable {
		 hp.verifyAssnt();
		 ScreenShot();

	    }
	
	 
	    @When("^I Click on ship$")
	    
	    public void i_click_on_ship() throws Throwable {
	    	 hp=new HomePage(driver);
	        hp.ship();
	    }

	    @Then("^I should be redirected to login page$")
	    public void i_should_be_redirected_to_login_page() throws Throwable {
	       hp.verifyLgn();
	       ScreenShot();
	    }

	    @When("^I Click on track$")
	    public void i_click_on_track() throws Throwable {
	    	 hp=new HomePage(driver);
	       hp.track();
	    }

	    @Then("^I should be able to enter the \"([^\"]*)\"$")
	    public void i_should_be_able_to_enter_the_something(String trackingid) throws Throwable {
	    hp.trackenterID(trackingid);
	    ScreenShot();
	    }

	    @Then("^see the tracking page;$")
	    public void see_the_tracking_page() throws Throwable {
	    	
	     hp.trackpg();
	     ScreenShot();
	    }
	    
	    
	    @When("^I Click on Verification of Rate and transit$")
	    public void i_click_on_verification_of_rate_and_transit() throws Throwable {
	    	hp=new HomePage(driver);
	    	hp.rateAndTransit();
	    }

	    @Then("^I should be redirected to Fed Calculate FedEx shipping rates$")
	    public void i_should_be_redirected_to_fed_calculate_fedex_shipping_rates() throws Throwable {
	    	
	       hp.rates();
	       ScreenShot();
	    }
}