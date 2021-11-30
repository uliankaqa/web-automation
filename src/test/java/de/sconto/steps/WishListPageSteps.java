package de.sconto.steps;

import com.codeborne.selenide.Condition;
import de.sconto.pages.WishListPage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Then;

import static com.codeborne.selenide.Selenide.page;

public class WishListPageSteps {

    private WishListPage wishListPage = null;
    @Before
    public void initPages(){
        wishListPage = page(WishListPage.class);
    }

    @Then("I see Wish List page")
    public void i_see_wish_list_page() {

        wishListPage.getPageTitleElement().shouldHave(Condition.text("Wunschliste"));
    }
    @Then("I see added product in Wish list")
    public void i_see_added_product() {
        wishListPage.getFirstProductNameElement().shouldHave(Condition.text("Marc"));
    }

    @After
    public void cleanUp(){
        wishListPage.clean();
    }
}
