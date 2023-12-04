Feature: BrainPoP interaction
  @wip
  Scenario: Explore BrainPOP Website
    Given the user is on the BrainPOP homepage
    When the user logs in with the username and password
    And the user enters and submits the search query "Challenge"
    Then the user selects the topic from the search results page
    And the user performs various actions with the movie player
    And the user selects a feature associated with the topic

    # Confirm playing the Movie and seeing its End Screen
    And the user plays the selected movie
    Then the user sees the End Screen of the movie

    # Validate that Closed Caption feature can be toggled [On/Off]
    And the Closed Caption feature is initially set to "Off"
    When the user toggles the Closed Caption feature to "On"
    Then the user should see Closed Captions on the movie
    And the user toggles the Closed Caption feature back to "Off"
    Then the Closed Captions should be turned off

    # Select the Related Reading Feature
    And the user selects a feature with the name "Related Reading"


    # Select any Feature from the Features list on the Topic page
    When the user selects a feature with the name "FeatureName"