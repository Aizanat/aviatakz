package com.aiza;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchResultPage {
    private WebDriver driver;

    public SearchResultPage(WebDriver driver) {
        this.driver = driver;
    }

    private static final By HEADING = By.xpath("//span[@class='l']");

    public String getHeadingText(){
        return driver.findElement(HEADING).getText();
    }

}
