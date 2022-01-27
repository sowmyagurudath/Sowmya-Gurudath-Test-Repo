Feature: HeaderFooter
  
  
  Background: Launch URL
  
   Given the FedEX URL
   When I select English in Choose your language section
   Then I should be able to 'APPLY SETTINGS'
  
  
  @Regression
   Scenario: Verification of header and footer 
   
   When I check header section I should able to see different options
   Then I should be able to see footer

   
 