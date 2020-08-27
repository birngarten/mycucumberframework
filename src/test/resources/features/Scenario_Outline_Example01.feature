@datatable01 @third
Feature: scenario outline example
  Scenario: testing the data tables web page
    Given User is on the datatables homepage
    When User clicks on new button
    And User enters first name "Feride"
    And User enters last name "Guzel"
    And User enters position  "Mimar"
    And User enters office  "Munih"
    And User enters extension "abc"
    And User enters start date "2020-08-22"
    And User enters salary "99000"
    And User clicks Create button
    And User enters first name "Feride" to the searchbox
    Then verify that user see the first name "Feride" in the searchbox