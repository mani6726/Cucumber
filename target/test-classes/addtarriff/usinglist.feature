
@sanity
Feature: Title of your feature
  I want to use this template for my feature file

  
  Scenario: add tarrif functionality
    Given The user should launch addtarrif plan page url
    When The user fill in the form and click submit
    #"<Monthly Rent>","<Free L/Min>","<Free Intl/Min>","<Free SMS>","<Local/min Charges>","<Intl/min Charges>","<SMS/Charges>" 
    |123|23|45|65|34|21|65|
    Then The user should see the congratulation message