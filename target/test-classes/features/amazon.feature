@amazon
Feature:Amazon Search
  Scenario: iPhone13 512 Search
    When Go to url
    And Search "iPhone13 512"
    And Check that the results are listed
    And Click iphone13 at the top of the list
    Then Log the following values for each size.(Size information  .Price  .Color .Stock status)





