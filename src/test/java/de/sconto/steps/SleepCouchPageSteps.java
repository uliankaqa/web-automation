package de.sconto.steps;

import com.codeborne.selenide.Condition;
import de.sconto.pages.HomePage;
import de.sconto.pages.LoginPage;
import de.sconto.pages.SleepCouchPage;
import io.cucumber.java.Before;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static com.codeborne.selenide.Selenide.page;

public class SleepCouchPageSteps {

    private SleepCouchPage sleepCouchPage;
    private LoginPage loginPage;

    @Before
    public void initPages(){
        sleepCouchPage = page(SleepCouchPage.class);
    }
    @When("I click on first product")
    public void i_hold_on_first_product() {

        sleepCouchPage.moveOverFirstProduct();
    }
    @When("I click on Heard button")
    public void i_click_on_heard_button() {
        sleepCouchPage.clickOnHeartBtn();
    }
    @Then("I should see alert with login button")
    public void i_should_see_alert_with_login_button() {
        sleepCouchPage.getLoginBtn().should(Condition.exist);
    }
    @When("I click on the Login button on alert")
    public void i_click_on_the_login_button_on_alert() {
       loginPage = sleepCouchPage.clickOnLoginBtn();
    }

}
