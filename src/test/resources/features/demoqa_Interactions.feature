@Dragdrop
Feature: The user should be able to drag and drop the "drag me" box
         under the simple module on the droppable page
  Background:
    Given the user navigates to demoqa web page
    When the user clicks "Interactions" "Droppable" module

  Scenario: Verify that drag and drop
    When the user drags and drops drag me into the drag box
    Then Drop box message "Dropped!" is displayed