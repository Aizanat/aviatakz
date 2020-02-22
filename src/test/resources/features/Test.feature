@All
Feature: This test will test the application aviata.kz

  @TestingOnePage
  Scenario: ticket purchase testing
    Given open the page
    When choose a suitable direction from 'ALMATY' to 'NUR_SULTAN' and date
    Then open the results page

