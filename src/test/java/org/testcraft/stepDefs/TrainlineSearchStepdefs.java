package org.testcraft.stepDefs;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testcraft.Pages.TrainlineHomepage;

public class TrainlineSearchStepdefs {
    public WebDriver driver;
    TrainlineHomepage trainlineHomepage = new TrainlineHomepage();

    public TrainlineSearchStepdefs() { driver =  Hooks.driver;}

    @Given("^I am on TheTrainline\\.com$")
    public void openPage() throws Throwable {
        trainlineHomepage.open();
    }

    @When("^I select the journey from \"([^\"]*)\" to \"([^\"]*)\" $")
    public void selectJourney(String arg1, String arg2) throws Throwable {
        trainlineHomepage.selectJourney(arg1, arg2);
    }

    @When("^I click to Get times and Tickets$")
    public void getTimes() throws Throwable {
        trainlineHomepage.clickGetTimes();
    }

    @Then("^train times should be displayed$")
    public void confirmTrainTimes() throws Throwable {
        trainlineHomepage.confirmTrainTimes();
    }
}