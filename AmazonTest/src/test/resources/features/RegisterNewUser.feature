Feature: As a customer, I want to register new account

  Scenario: Register new user
    Given Homepage Amazone website
    And Navigate to Account & List
    And Open register page from sign in page
    And Register page should be displayed
    When Input customer name with "John Doe"
    And Input customer email with "johndoe@mail.com"
    And Input customer password with "P@55w0rd"
    And Input customer re-password with "P@55w0rd"
    Then Click continue button