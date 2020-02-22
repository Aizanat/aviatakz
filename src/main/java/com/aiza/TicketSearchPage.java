package com.aiza;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TicketSearchPage {
    private WebDriver driver;

    private static final By ONE_WAY_FIELD = By.xpath("//a[@class='ux-searchform-oneway']");
    private static final By DEPARTURE_DATE = By.xpath("//input[@id='desktop-one-way-from-date']");
    private static final By CHOOSE_DATE = By.xpath("/html[1]/body[1]/div[25]/div[1]/table[1]/tbody[1]/tr[4]/td[4]/a[1]");
    private static final By FIND_TICKETS_FIELD = By.xpath("//button[@class='btnCustom btnCustom-default btnGreen flightsearch__findbutton ux-main-search']");

    public TicketSearchPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickOneWay(){
        driver.findElement(ONE_WAY_FIELD).click();
    }

    public void clickCityFrom(String city){
        driver.findElement(By.xpath(city)).click();
    }

    public void clickCityTo(String city){
        driver.findElement(By.xpath(city)).click();
    }

    public void clickDepartureDate(){
        driver.findElement(DEPARTURE_DATE).click();
    }

    public void chooseDate(){
        driver.findElement(CHOOSE_DATE).click();
    }

    public SearchResultPage clickTicketsField(){
        driver.findElement(FIND_TICKETS_FIELD).click();
        return new SearchResultPage(driver);
    }

    public SearchResultPage ticketSearch(String from, String to){
        this.clickOneWay();
        this.clickCityFrom(from);
        this.clickCityTo(to);
        this.clickDepartureDate();
        this.chooseDate();
        this.clickTicketsField();
        return new SearchResultPage(driver);
    }
}
