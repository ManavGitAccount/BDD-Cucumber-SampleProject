Feature: Account Setup

  @SanityTest
  Scenario: Home page default login
    Given User is on NetBanking landing page
    When User logs into application with "SmokeManav" and "Abc123$$"
    Then Home Page is populated
    And Cards displayed is "false"

  @RegressionTest
  Scenario: Home page default login
    Given User is on NetBanking landing page
    When User sign up with the following details
      | SanityJenny | SanityTest2 | manav.rattan@jenkins.com | Switzerland | 6133450098|
    Then Home Page is populated
    And Cards displayed is "true"