package com.keypoint.step_definitions;

import com.keypoint.pages_demoqa.Actions_demoqa;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Demoqa_Step_Def extends Actions_demoqa {
    /**
     * Background
     */
    @Given("the user navigates to demoqa web page")
    public void the_user_navigates_to_demoqa_web_page() {
        demoqa_HomePage();
    }

    @When("the user clicks {string} {string} module")
    public void theUserClicksModule(String tab, String module) {
        navigateToModule(tab, module);

    }

    /**
     * Alerts module-Alert
     */
    @When("the user clicks {string}")
    public void theUserClicks(String buttonName) {
        click_ClickMeButton(buttonName);
    }

    @Then("{string} message is displayed")
    public void messageIsDisplayed(String str) {
        isDisplayed_PopUpMessage(str);
    }

    @Then("You selected Ok-Cancel , info is displayed")
    public void youSelectedOkCancelInfoIsDisplayed() {
        isDisplayed_SelectedMessage();
    }

    @Then("You entered  Jhon Doe - info is displayed")
    public void youEnteredJhonDoeInfoIsDisplayed() {
        isDisplayed_enterMessage();
    }

    /**
     *Interactions module- Drag & Drop
     */

    @When("the user drags and drops drag me into the drag box")
    public void theUserDragsAndDropsDragMeIntoTheDragBox() {
        dragDropBox();

    }

    @Then("Drop box message {string} is displayed")
    public void dropBoxMessageIsDisplayed(String message) {
        verify_DropBoxText(message);
    }

    /**
     * Widgets module- Hover over
     */

    @When("the user hover over the Hover me to see button")
    public void the_user_hover_over_the_Hover_me_to_see_button() {
      hover_ToolTipButton();
    }

    @Then("the {string} message is displayed")
    public void the_message_is_displayed(String message) {
        verify_ToolTipMessage(message);
    }

    @Then("the user hover over the Hover me to see text field")
    public void the_user_hover_over_the_Hover_me_to_see_text_field() {
       hover_ToolTipTextField();
    }



}


