package stepDefinition;






import io.cucumber.java.en.*;


import pageObjects.LanguageSelection;


public class LanguageStepDefinition extends BaseClass{
	
	
	public LanguageStepDefinition() {
		driver = StepDefinitionSetup.getDriver();
		
    	
	}

	
			

	//Language
	@Given("^the FedEX URL$")
	public void i_launch_the_url() throws Throwable {
  
    
		 t=new LanguageSelection(driver);
	
		t.testBrowser();
		
	}
    
    

   
	

	 @When("^I select Nederlands in Choose your language section$")
	public void i_select_Nederlands_in_Choose_your_language_section() throws Throwable {
		//driver.wait(1000);
		//t=new BasePage(driver);
		t.selectNederlands();
	    	    
	}


	
	@When("^I select English in Choose your language section$")
    public void i_select_english_in_choose_your_language_section() throws Throwable {
        t.selectEnglish();
    }
	
	@When("^I select English UK in Choose your language section$")
    public void i_select_english_uk_in_choose_your_language_section() throws Throwable {
        t.selectEnglishUK();
    }
	
	 @When("^click on 'Search for another country territory'$")
	    public void click_on_search_for_another_country_territory() throws Throwable {
	        t.selectOtherRegion();
	    }
	 
	 @Then("^I should be landed in 'Select your location and language page'$")
	    public void i_should_be_landed_in_select_your_location_and_language_page() throws Throwable {
		 t.verfiyLanguage();
	      driver.quit();
	    }
	 
	 @When("^I choose to close the window$")
	 public void i_choose_to_close_the_window() throws Throwable {
	    t.closeWindow();
	 }
	 
	  @Then("^I should be navigate to homepage with text \"([^\"]*)\"$")
	    public void i_should_be_navigate_to_homepage_with_text_something(String text) throws Throwable {
	        t.verifyButtonNL(text);
	        driver.quit();
	    }
	  
	  @Then("^I should be able to 'APPLY SETTINGS'$")
	    public void i_should_be_able_to_apply_settings() throws Throwable {
		
	        t.aplystng();
	    }


	  @Then("^I should be able to 'ACCEPT ALL COOKIES'$")
	    
	    public void i_should_be_able_to_accept_all_cookies_by_selecting_other_analytical_cookies_and_tracking_cookies() throws Throwable {
	        t.acceptAll();
	    }
	    
	  
		

	    
	    
	   
}
