Feature: Search Bar

  Scenario: Searching for a term
    Given Sergio is on the AutomationPractice home page
    When he searches for "summer"
    Then all the result titles should contain the word "summer"

  Scenario: Add to Cart
    Given Sergio is on add the cart
