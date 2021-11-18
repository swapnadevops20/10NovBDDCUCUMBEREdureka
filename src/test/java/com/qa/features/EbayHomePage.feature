
Feature: ebay Home page
@ebay
Scenario: title of the page
Given I am on ebayHomepage
When I get title of the page
Then I validate the page title
