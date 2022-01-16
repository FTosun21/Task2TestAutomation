@Alert
Feature: The user should be able to handle all alerts on the Alerts page
  Background:
    Given the user navigates to demoqa web page
    When the user clicks "Alerts, Frame & Windows" "Alerts" module

  Scenario: Verify that Alert Button
    When the user clicks "alertButton"
    Then "You clicked a button" message is displayed

  Scenario: Verify that Timer Alert Button
    When the user clicks "timerAlertButton"
    Then "This alert appeared after 5 seconds" message is displayed

  Scenario: Verify that Confirm Button
    When the user clicks "confirmButton"
    And "Do you confirm action?" message is displayed
    Then You selected Ok-Cancel , info is displayed

  Scenario: Verify that Promt Button
    When the user clicks "promtButton"
    And "Please enter your name" message is displayed
    Then You entered  Jhon Doe - info is displayed








