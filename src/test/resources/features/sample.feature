Feature: Test Google Search Engine

  Scenario: Check title of website after search
    Given I open the url "http://google.com"
    When I set "WebdriverIO" to the inputfield "#APjFqb"
    And I press "Enter"
    Then I expect that the title is "WebdriverIO - Google Search"
