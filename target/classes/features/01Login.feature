Feature: Login User SHOP DEMO QA

  Scenario: User valid login into web HRM
    Given User open browser and url
    When User click my account
    And User enter valid username
    And User enter valid password
    And User click button login
    Then user go to page Dashboard


  Scenario: User invalid login into web HRM
    When User click logout
    And User enter invalid username
    And User enter invalid password
    And User click button login
    Then user get message invalid credentials

