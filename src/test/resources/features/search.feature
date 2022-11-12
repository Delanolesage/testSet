Feature: Search

  Scenario Outline: Search on duck-duck-go site
    Given I am on the website
    And   I enter the "<keyword>" to search
    And   I navigate to videos search
    Then  I should get minimum 2 search results

    Examples:
      | keyword    |
      | java       |
      | webdriver  |
      | docker     |
      | kubernetes |