$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/com/qa/features/EbayHomePage.feature");
formatter.feature({
  "name": "ebay Home page",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "title of the page",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@ebay"
    }
  ]
});
formatter.step({
  "name": "I am on ebayHomepage",
  "keyword": "Given "
});
formatter.match({
  "location": "com.qa.steps.EbayStepDefinition.i_am_on_ebayHomepage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I get title of the page",
  "keyword": "When "
});
formatter.match({
  "location": "com.qa.steps.EbayStepDefinition.i_get_title_of_the_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I validate the page title",
  "keyword": "Then "
});
formatter.match({
  "location": "com.qa.steps.EbayStepDefinition.i_validate_the_page_title()"
});
formatter.result({
  "status": "passed"
});
});