package de.sconto.steps;

import com.codeborne.selenide.Condition;
import de.sconto.pages.HomePage;
import de.sconto.pages.MenuBarPage;
import de.sconto.pages.SleepCouchPage;
import io.cucumber.java.Before;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static com.codeborne.selenide.Selenide.page;

public class MenuBarPageSteps {
    private MenuBarPage menuBar;
    private SleepCouchPage sleepCouchPage;
    @Before
    public void init(){
        menuBar = page(MenuBarPage.class);
    }
    @When("I click on couch button on top bar menu")
    public void clickOnCouchBtn(){
        menuBar.clickOnCouchBtn();
    }

    @When("I click on sleep couch button")
    public void clickOnSleepCouchBtn(){
        sleepCouchPage = menuBar.clickOnSleepCouchBtn();
    }
    @Then("I see sleep couch page")
    public void verifySleepCouchPage(){
        sleepCouchPage.getTitle().shouldHave(Condition.text("Schlafsofas"));
    }

}
