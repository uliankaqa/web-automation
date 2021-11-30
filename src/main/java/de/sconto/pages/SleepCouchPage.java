package de.sconto.pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;

public class SleepCouchPage {


    /*
    Elements
     */
    private static By titleElem = By.tagName("h1");
    private static By firstProduct = By.xpath("//div[@data-article-number='26400717']");
    private static By heartBtn = By.cssSelector(".articlePresentation__imageWishlist");
    private static By loginBtn = By.xpath("(//button[@id='addToWishlistLoginBox'])[2]");

    public SelenideElement getTitle(){
        return  $(titleElem);
    }

    public void moveOverFirstProduct(){
        $(firstProduct).scrollIntoView(true).click();
    }

    public void clickOnHeartBtn(){
        $(heartBtn).click();
    }

    public SelenideElement getLoginBtn(){
        return $(loginBtn);
    }

    public LoginPage clickOnLoginBtn(){
        $(loginBtn).click();
        return page(LoginPage.class);
    }
}
