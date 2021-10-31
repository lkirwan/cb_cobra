Feature: Login with correct credentials
  Successful and unsuccessful user logins into website

  Scenario Outline: User attempts to log in
    Given I'm on the login screen
    When I log in with username "<username>" and password "<password>"
    Then I should be "<result>"

    Examples:
      | username   | password   | result        |
      | user1      | pass1      | unsuccessful  |
      | user2      | pass2      | successful    |
      | user3      | pass3      | unsuccessful  |
