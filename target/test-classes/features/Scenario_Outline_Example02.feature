@datatable02
Feature: scenario outline example
  Scenario Outline: testing the data tables web page
    Given User is on the datatables homepage
    When User clicks on new button
    And User enters first name "<first name>"
    And User enters last name "<last name>"
    And User enters position  "<position>"
    And User enters office  "<office>"
    And User enters extension "<extension>"
    And User enters start date "<start date>"
    And User enters salary "<salary>"
    And User clicks Create button
    And User enters first name "<first name>" to the searchbox
    Then verify that user see the first name "<first name>" in the searchbox

    Examples: Test data for data tables
    |first name|last name|position|office|extension|start date|salary|
    |Mine      |Can      |Kuzucuk |Bonn  |abc      |2020-10-13|77000 |
    |Levent    |Kuzu     |Muhendis|Frankfurt|aed   |2020-09-11|88000 |
    |Ibrahim   |Ozturk   |SDET    |Paris    |111   |2020-08-21|50000 |
    |Pinar     |CANKAYA  |SDET    |Paris |111      |2020-11-01|200000|
