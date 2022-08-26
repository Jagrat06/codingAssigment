Feature: Verify that release date and country of a movie are similar on imdb and wikipedia

  Scenario: Open IMDB Website and extract the release date and country of Pushpa Movie
    Given User opens browser
    And User hits the url "https://www.imdb.com/"
    And User enters the movie name in imdb "Pushpa:The Rise"
    And User opens movie page details
    Then User Extracts date of release and country from imdb

  Scenario: Open Wikipedia Website and extract the release date and country of Pushpa Movie
    Given User opens browser
    And User hits the url "https://en.wikipedia.org/"
    And User enters the movie name in wiki "Pushpa: The Rise"
    And User opens movie page details in wiki
    Then User Extracts date of release and country from wiki

  Scenario: Compare the release date and country
    Then User verifies country in wiki and imdb
    Then User verifies release date in wiki and imdb