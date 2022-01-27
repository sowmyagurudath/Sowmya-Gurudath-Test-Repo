Feature: Homepage
  
  
  Background: Launch URL
  
   Given the FedEX URL
   When I select English in Choose your language section
   Then I should be able to 'APPLY SETTINGS'
  
  
 
   
   @Regression
   
   Scenario: Verification of ship
   
  When I Click on ship
  Then I should be redirected to login page
  
  
  @Regression
   
   Scenario: Verification of Rate and transit
   
  When I Click on Verification of Rate and transit
  Then I should be redirected to Fed Calculate FedEx shipping rates 
   
  
  
  @Regression
   
   Scenario Outline: Verification of Track
   
  When I Click on track
  Then I should be able to enter the "<TrackingID>"
  And see the tracking page;
  
  Examples:
  
  |TrackingID|
  |1234|
  
  
  @Regression
   Scenario: Ask FedEX
   
   When I click on Assitance
   Then I should able to extand
 
