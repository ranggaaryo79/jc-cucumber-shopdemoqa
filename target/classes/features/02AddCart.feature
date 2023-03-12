Feature: Add Cart Shop Demo QA

  Scenario: User add Product
    Given User open browser and url
    When User click menu homepage
    And User click product
    And User select color product
    And User select size product
    And User select quantity product
    And User click add to cart
    Then Notify success add cart
