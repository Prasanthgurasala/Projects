
Feature: Citizen of the UK
  Scenario: NHS costs checker
    Given user is on homepage
    When I am a citizen of the UK
    When I put my circumstances into the Checker tool
    Then I should get a result of whether I will get help or not