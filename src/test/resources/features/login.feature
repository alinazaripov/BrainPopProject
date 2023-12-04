Feature: User should be able to login

    Scenario: Login with valid credentials
     Given user is on the BrainPOP homepage
      When the user logs in with the username and password
      Then the user is on the homepage


    Scenario Outline:  Can not login with invalid credentials
     Given user is on the BrainPOP homepage
      When The user tries to login with "<username>" and "<password>"
      Then The user sees "The username and password did not match." error message

      Examples:
        | username   | password |
        | qatest20   | brainPoP |
        | qatest2020 | brain123 |
        | qatest1    | brainabc |
