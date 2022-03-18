Feature: Search and place order for Vegetables

  @SeleniumTest
  Scenario: Search for items and validate results
    Given User is on GreenKart Landing page
    When User searches for "Cucumber" Vegetable
    Then "Cucumber" is displayed

  @SeleniumTest
  Scenario: Search for items and then move to checkout page
    Given User is on GreenKart Landing page
    When User searches for "Brinjal" Vegetable
    And Adds the item to the cart
    And User proceeds to Checkout page for purchase
    Then verify "Brinjal" item is displayed on the checkout page

  @SeleniumTest
  Scenario Outline: Search for items and then move to checkout page
    Given User is on GreenKart Landing page
    When User searches for <Name> Vegetables
    And Adds the item to the cart
    And User proceeds to Checkout page for purchase
    Then verify <Name> for items is displayed on the checkout page

    Examples:
      | Name  |
      | Brinjal|
    | Beetroot|