Feature: login operations

  Scenario Outline: client does not enter username
    Given username is empty
    When the client calls login with password "<password>"
    Then the client receives username empty result "<result>"

    Examples:
      | password | result                   |
      | admin    | username cannot be empty |

  Scenario Outline: client does not enter password
    Given password is empty
    When the client calls login with username "<username>"
    Then the client receives password empty result "<result>"

    Examples:
      | username | result                   |
      | admin    | Password cannot be empty |

  Scenario Outline: client enters username and password
    Given user enters username and password
    When the client calls login with username "<username>" and password "<password>"
    Then the client receives result "<result>"

    Examples:
      | username | password | result                   |
      | bakar    | bakar    | Login Successful         |