package com.herokuapp.steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static com.codeborne.selenide.Selenide.$;
import static com.herokuapp.pages.HoversPage.generateXpath;
import static com.herokuapp.pages.HoversPage.user3;


/**
 * HoverSteps
 * Class implements the step definitions for testing the Hovers page.
 *
 * @author Violeta Abramova abramova.violetta@gmail.com
 */
public class HoverSteps {

    @When("I hover avatar 3")
    public void hoverAvatar() {
        $(generateXpath("3")).hover();
    }

    @Then("I observe the user3 username")
    public void checkUsernameText() {
        assert ($(user3).getText().contains("user3"));
    }
}
