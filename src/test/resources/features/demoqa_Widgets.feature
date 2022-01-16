@Hoverover
Feature: The user should see the message when hovering over
         "Hoover me to see" elements on the Tool Tips page

  Background:
    Given the user navigates to demoqa web page
    When the user clicks "Widgets" "Tool Tips" module

  Scenario: Verify that the user can see the message on hover
    When the user hover over the Hover me to see button
    Then the "You hovered over the Button" message is displayed
    And the user hover over the Hover me to see text field
    Then the "You hovered over the text field" message is displayed