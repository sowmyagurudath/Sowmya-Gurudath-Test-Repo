Feature: Language
  
@Regression
   Scenario: Choose Location different languages Nederlands
  
  Given the FedEX URL
   When I select Nederlands in Choose your language section
   Then I should be able to 'APPLY SETTINGS'
   And I should be navigate to homepage with text "TRACEER"
  
  
@Regression
    Scenario: Choose Location different languages English
  
  Given the FedEX URL
   When I select English in Choose your language section
   Then I should be able to 'APPLY SETTINGS'
  And I should be navigate to homepage with text "TRACK"
  
  
  @Regression
    Scenario: Choose Location different languages English
  
  Given the FedEX URL
  When I select English UK in Choose your language section
 Then I should be able to 'ACCEPT ALL COOKIES'
  And I should be navigate to homepage with text "TRACK"
  
 @Regression
  Scenario: Choose Location as Others
  
  Given the FedEX URL
  When click on 'Search for another country territory'
  
  Then I should be landed in 'Select your location and language page'
  
  @Regression
  Scenario: Close window
  
  Given the FedEX URL
  When I choose to close the window
Then I should be navigate to homepage with text "TRACK"