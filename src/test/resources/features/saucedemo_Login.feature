@Login
Feature: user should be able to login with valid credential

  Background:
    Given The user is on the login page
@wip
  Scenario Outline: positive scenario
    When The user enters "<valid username>" and "<valid password>"  credential
    Then The user should be able to login


    Examples:
      | valid username          | valid password |
      | standard_user           | secret_sauce   |
      | problem_user            | secret_sauce   |
      | performance_glitch_user | secret_sauce   |


  Scenario Outline: negative scenario
    When The user enters invalid or empty "<username>" or "<password>" credential
    Then The user should see the "<error message>"

    Examples:
      | username        | password       | error message                                                             |
      | locked_out_user | secret_sauce   | Epic sadface: Sorry, this user has been locked out.                       |
      | standard_user   | standart_sauce | Epic sadface: Username and password do not match any user in this service |
      |                 | secret_sauce   | Epic sadface: Username is required                                        |
      | problem_user    |                | Epic sadface: Password is required                                        |
      |                 |                | Epic sadface: Username is required                                        |






