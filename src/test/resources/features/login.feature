Feature: User authentication through login


  @UnsuccessfulLogin
  Scenario: UnsuccessfulLogin login with valid credentials
    Given the user is on the login page
    When the user logs in with the following credentials:
      | username       | password     |
      | standard_user  | secret_saucea |
    Then the user should not be able to log in due to invalid credentials


  @SuccessfulLogin
  Scenario: Successful login with valid credentials
    Given the user is on the login page
    When the user logs in with the following credentials:
      | username       | password     |
      | standard_user  | secret_sauce |
    Then the user should be redirected to the products page