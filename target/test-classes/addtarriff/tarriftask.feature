@smoke
Feature: Title of your feature
  I want to use this template for my feature file

  Scenario Outline: Title of your scenario outline
    Given The user should be in addtarrif plan page
    When The user fill in the form "<Monthly Rent>","<Free L/Min>","<Free Intl/Min>","<Free SMS>","<Local/min Charges>","<Intl/min Charges>","<SMS/Charges>" and click submit
    Then The user should see the congrats message

    Examples: 
      |Monthly Rent|Free L/Min|Free Intl/Min|Free SMS|Local/min Charges|Intl/min Charges|SMS/Charges|
      |100|12|23|123|45|23|43|