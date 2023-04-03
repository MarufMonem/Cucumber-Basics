Feature: Application Login
  Scenario: Home page default login
    Given User is on NetBanking landing page
    When User logs into the application with "Maruf" and "ABC"
    Then Home page is populated
    And Cards are displayed

  Scenario: Home page default login
    Given User is on NetBanking landing page
    When User logs into the application with "Monem" and "123"
    Then Home page is populated
    And Cards are displayed are "false"