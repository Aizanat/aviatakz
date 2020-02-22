package com.aizanat.cucumber.stepdefs;

import com.aiza.City;
import com.aiza.SearchResultPage;
import com.aiza.TicketSearchPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class BuyTicketStepdefs {
    private WebDriver driver;
    private TicketSearchPage ticketSearch;
    private SearchResultPage searchResult;

    @Given("^open the page$")
    public void openThePage(){
        System.setProperty("webdriver.gecko.driver", "E:\\geckodriver.exe");
        driver = new FirefoxDriver();

        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        driver.get("https://aviata.kz");
    }

    @When("^choose a suitable direction from '(.*)' to '(.*)' and date$")
    public void chooseASuitableDirectionAndDate(String from, String to){
        ticketSearch = new TicketSearchPage(driver);
        ticketSearch.ticketSearch(City.valueOf(from).getLocation(), City.valueOf(to).getLocation());
    }

    @Then("^open the results page$")
    public void openTheResultsPage(){
        searchResult = new SearchResultPage(driver);
        String text = searchResult.getHeadingText();
        Assert.assertEquals("Поиск и бронирование авиабилетов", text);
    }
}
