package de.sconto.pages;

import com.codeborne.selenide.Selenide;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class MenuBarPage {

    /* Elements */

    private static By couchBtn = By.xpath("//ul[@class='menu']/li[2]/span");
    private static By sleepCouchBtn = By.xpath("//span[@id='Sofas']//a[@href='/schlafsofas']");

    public void clickOnCouchBtn() {
        $(couchBtn).click();
    }

    public SleepCouchPage clickOnSleepCouchBtn() {
        $(sleepCouchBtn).click();
        return Selenide.page(SleepCouchPage.class);
    }
}
