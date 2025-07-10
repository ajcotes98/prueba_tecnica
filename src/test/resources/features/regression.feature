Feature: Complete the checkout process - regression test

  Background:
    Given the user is on the login page

  @Regression
  Scenario Outline: Complete checkout
    Given the user logs in with username "<username>" and password "<password>"
    And the user adds the product "<productName>" to the cart
    When the user enters their checkout information "<firstName>", "<lastName>" and "<postalCode>"
    Then the order should be successfully completed

    Examples:
      | username       | password     | productName             | firstName | lastName | postalCode |
      | standard_user  | secret_sauce | Sauce Labs Backpack     | John      | Doe      | 12345      |
      | standard_user  | secret_sauce | Sauce Labs Fleece Jacket| Alice     | Smith    | 54321      |
