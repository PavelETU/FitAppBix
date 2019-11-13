Feature: Body fat percentage calculation is correct
  Scenario Outline: Calculation of body fat for male is correct
    Given I am on body fat percentage measurement screen
    And I choose Male as a gender
    When I click Age field
    And I type age "<age>"
    And I close keyboard
    And I click Weight field
    And I type weight "<weight>"
    And I close keyboard
    And I click Height field
    And I type height "<height>"
    And I close keyboard
    And I click Neck field
    And I type neck "<neck>"
    And I close keyboard
    And I click Waist field
    And I type waist "<waist>"
    And I close keyboard
    And I click Hip field
    And I type hip "<hip>"
    And I close keyboard
    And I hit calculate
    Then I expect to see "<bodyFat>"% on the screen

  Examples:
    | age | weight | height | neck | waist | hip | bodyFat |
    | 26  | 83     | 182    | 39   | 97    | 103 | 23.5    |
    | 26  | 83     | 170    | 39   | 97    | 103 | 25.6    |
    | 30  | 85     | 170    | 39   | 97    | 80  | 25.6    |

  Scenario Outline: Calculation of body fat for female is correct
    Given I am on body fat percentage measurement screen
    And I choose Female as a gender
    When I click Age field
    And I type age "<age>"
    And I close keyboard
    And I click Weight field
    And I type weight "<weight>"
    And I close keyboard
    And I click Height field
    And I type height "<height>"
    And I close keyboard
    And I click Neck field
    And I type neck "<neck>"
    And I close keyboard
    And I click Waist field
    And I type waist "<waist>"
    And I close keyboard
    And I click Hip field
    And I type hip "<hip>"
    And I close keyboard
    And I hit calculate
    Then I expect to see "<bodyFat>"% on the screen

    Examples:
      | age | weight | height | neck | waist | hip | bodyFat |
      | 26  | 83     | 182    | 39   | 97    | 103 | 34.0    |
      | 26  | 83     | 170    | 39   | 97    | 103 | 37.1    |
      | 30  | 85     | 170    | 39   | 97    | 80  | 26.1    |