Feature: BrainPoP interaction
  @wip
  Scenario: Explore BrainPOP Website
    Given user is on the BrainPOP homepage

    When the user logs in with the username and password
    And the user enters and submits the search query "Challenge"
    Then the user selects the topic from the search results page
    And the user performs various actions with the movie player