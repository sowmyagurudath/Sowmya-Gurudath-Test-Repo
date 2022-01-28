package stepDefinition;




import io.cucumber.java.en.*;
import pageObjects.HeaderFooterPage;



public class HeaderFooterStepDefinition extends BaseClass{
	
	
	public HeaderFooterStepDefinition() {
		driver = StepDefinitionSetup.getDriver();
		
    	
	}

	
			

	
		 //HeaderFooter
		    @When("^I check header section I should able to see different options$")
		    public void i_check_header_section_i_should_able_to_see_different_options() throws Throwable {
		    	
		    	hf=new HeaderFooterPage(driver);
		        hf.header();
		    }


		    @Then("^I should be able to see footer$")
		    public void i_should_be_able_to_see_footer() throws Throwable {
		        hf.footer();
		        ScreenShot();
		    }


	    
		  

	   
}
