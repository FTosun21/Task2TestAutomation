package com.keypoint.step_definitions;

import com.keypoint.pages_saucedemo.Actions_saucedemo;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Saucedemo_Step_Def extends Actions_saucedemo {

    @Given("The user is on the login page")
    public void the_user_is_on_the_login_page() {
      saucedemoLoginPage();
    }

    @When("The user enters {string} and {string}  credential")
    public void theUserEntersAndCredential(String username, String password) {
        login(username,password);
    }

    @Then("The user should be able to login")
    public void the_user_should_be_able_to_login() {
        isDisplayed_HomepageTitle();
    }

    @When("The user enters invalid or empty {string} or {string} credential")
    public void the_user_enters_invalid_or_empty_or_credential(String string, String string2) {
        login(string,string2);
    }


    @Then("The user should see the {string}")
    public void the_user_should_see_the(String message) {
        verify_errorMessage(message);
    }


}
