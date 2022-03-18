Feature: Application Login


#  Background:
#    Given validate the browser
#    When Browser is triggered
#    Then check if browser has started


  @RegressionTest
  Scenario: Home page default login
    Given User is on NetBanking landing page
    When User logs into application with "Manav1" and "Abc123$$"
    Then Home Page is populated
    And Cards displayed is "false"


  @SmokeTest
  Scenario: Home page default login
    Given User is on NetBanking landing page
    When User logs into application with "SmokeJack" and "Test123$$"
    Then Home Page is populated
    And Cards displayed is "true"

  @SmokeTest
  Scenario: Home page default login
    Given User is on NetBanking landing page
    When User sign up with the following details
    | Smokejenny | test!2 | manav.rattan@jenkins.com | England | 6133450098|
    Then Home Page is populated
    And Cards displayed is "true"


  @MobileTest
  Scenario Outline: Home page default login
    Given User is on NetBanking landing page
    When Another user logs into the application with <Username> and <password>
    Then Home Page is populated
    And Cards displayed is "false"
    Examples:
      | Username | password|
      | userA    | passA   |
      | userB    | passB   |



