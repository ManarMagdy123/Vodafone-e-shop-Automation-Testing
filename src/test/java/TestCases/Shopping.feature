Feature: shoppingOnline
  Scenario: invalidShopping
    Given buy new iphone
    When buy an iphone
    And leave the personal info empty
    Then receive an error message
