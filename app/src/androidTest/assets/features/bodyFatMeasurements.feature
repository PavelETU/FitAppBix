Feature: Body fat percentage calculation is correct
  Scenario Outline: Enter all parameters and verify answer
    Given I am on body fat percentage measurement screen
    When I click Age field
    And I type age "<age>"
    And I close keyboard
    And I click Weight field
    And I type weight "<weight>"
    And I close keyboard
    When I click Height field
    And I type height "<height>"
    And I close keyboard
    When I click Neck field
    And I type neck "<neck>"
    And I close keyboard
    When I click Waist field
    And I type waist "<waist>"
    And I close keyboard
    When I click Hip field
    And I type hip "<hip>"
    And I close keyboard
    And I hit calculate
    Then I expect to see "<bodyFat>"% on the screen

  Examples:
    | age | weight | height | neck | waist | hip | bodyFat |
    | 26  | 83     | 182    | 39   | 97    | 103 | 23.5    |