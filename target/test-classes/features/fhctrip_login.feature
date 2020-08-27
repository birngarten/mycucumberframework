@fhclogin @smoketest
Feature: Login feature

  Background: User is in the fhctriplogin page
    Given user is on the fhctriplogin page


  Scenario: TC01_user logins with valid credentials
    And user enters valid username
    And user enters  valid password
    And user clicks login button
    Then verify login is successfull

#    #HOMEWORK
#  Scenario: TC01_user logins with invalid credentials
#  And user enters invalid username
#  And user enters  invalid password
#  And user clicks login button
#  Then verify login is not successfull
