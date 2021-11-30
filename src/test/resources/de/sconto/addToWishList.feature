Feature: add to Wish List functionality tests

  Background:
    Given I am on the Homepage
    When I click on couch button on top bar menu
    And I click on sleep couch button
    Then I see sleep couch page

@wishList
    Scenario: Product can add to  Wish List
      When I click on first product
      And I click on Heard button
      Then I should see alert with login button

      When I click on the Login button on alert
      Then I see Login page

      When I insert valid user credentials
      And I click on Login button
      Then I see Wish List page
      And I see added product in Wish list

