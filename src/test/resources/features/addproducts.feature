Feature: Add products to the cart

  Background:
    Given the user is on the login page
    And the user logs in with the following credentials:
      | username      | password     |
      | standard_user | secret_sauce |

  @AddProduct
  Scenario: Add product to the cart
    When they add the following product
      | productName              |
      | Sauce Labs Backpack      |
      | Sauce Labs Fleece Jacket |
    Then the cart should display the product