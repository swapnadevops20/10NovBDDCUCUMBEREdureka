# Author=Swapna M C
# date : 11-Nov
# App : Rediff
Feature: Rediff Login page

  Scenario Outline: Enter email and password on rediffPage
    Given I am on RediffPage
    When I enter EmailID '<id>' & Password '<pwd>'
    And click on Login

    # dataTables
    Examples: 
      | id                          | pwd       |
      | swapna04@gmail.com          | abc@123   |
      | sai@gmail.com               | admin@123 |
      | SaiGuruPriyaReddy@gmail.com | emp@123   |
      | Padmavathi@gmail.com        | paddu@123 |
