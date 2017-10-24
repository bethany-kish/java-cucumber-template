package org.testcraft.stepDefs;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testcraft.Pages.TrainlineHomepage;

import static org.testcraft.stepDefs.Hooks.driver;

public class TrainlineSearchStepdefs {

    public TrainlineSearchStepdefs() {
        driver = driver;
    }

    TrainlineHomepage trainlineHomepage = new TrainlineHomepage(driver);

    @Given("^I am on TheTrainline\\.com$")
    public void openPage() throws Throwable {
        trainlineHomepage.open();
        trainlineHomepage.confirmHomePage();
    }

    @When("^I select the journey from \"([^\"]*)\" to \"([^\"]*)\"$")
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

    @When("^I select the return option$")
    public void selectReturnOption() throws Throwable {
        trainlineHomepage.selectReturn();
    }

    @When("^I select Tomorrow and Next Day$")
    public void selectDayOptions() throws Throwable {
        trainlineHomepage.selectDayOptions();
    }
}
