Feature: Order a coffee
  In order to save time when i pickup my morning coffee
  As a coffee lover
  I want to be able to order my coffee in advance

  Scenario: Buyer orders a coffee
    Given Buyer has a Caffeinate-Me account
    When Buyer orders a large cappuccino
    Then Barry should receive the order
