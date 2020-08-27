@googlesearch @first
Feature: Google search

  Background: User is on the google page
    Given user is in the google page
    # Normalde ==> Given user is in the google page satiri her Scenario'nun altinda yer alir.
    #          ==> Ancak Background'in altina alarak (sadece!!!) ortak Scenario'lar icin kullanabiliriz

    @teapot
  Scenario: user search teapot in google
    And user searches teapot
    Then verify result has teapot

    @nokia
  Scenario: user search teapot in google
    And user searches nokia
    Then verify result has nokia



