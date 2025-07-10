Feature: Complete the checkout process

  Background:
    Given the user is on the login page
    And the user logs in with the following credentials:
      | username      | password     |
      | standard_user | secret_sauce |
    And they add the following product
      | productName         |
      | Sauce Labs Backpack |

  @Checkout
  Scenario: Complete checkout
    When they enter their checkout information:
      | firstName | lastName | postalCode |
      | John      | Doe      | 12345      |
    Then the order should be successfully completed