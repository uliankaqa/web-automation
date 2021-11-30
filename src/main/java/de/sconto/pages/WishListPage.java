package de.sconto.pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class WishListPage {

    private static By title = By.tagName("h1");
    private static By wishListNames = By.className("articleFullName__name");
    private static By removeProductBtn = By.className(".wishlistEntry__remove");


    public SelenideElement getPageTitleElement(){
        return  $(title);
    }

    public SelenideElement getFirstProductNameElement(){
        return $$(wishListNames).get(0);
    }

    public void removeProduct(int index){
        $$(removeProductBtn).get(index).click();
    }


    public void clean() {
        while ($$(removeProductBtn).size() > 0){
            removeProduct(0);
        }
    }
}
