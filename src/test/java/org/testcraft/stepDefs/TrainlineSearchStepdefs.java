package org.testcraft.stepDefs;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testcraft.Pages.TimetablePage;
import org.testcraft.Pages.TrainlineHomepage;

import static org.testcraft.stepDefs.Hooks.driver;

public class TrainlineSearchStepdefs {

    public TrainlineSearchStepdefs() {
        driver = driver;
    }

    TrainlineHomepage trainlineHomepage = new TrainlineHomepage(driver);
    TimetablePage timetablePage = new TimetablePage(driver);

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
        timetablePage.confirmTrainTimes();
    }

    @When("^I select the return option$")
    public void selectReturnOption() throws Throwable {
        trainlineHomepage.selectReturn();
    }

    @When("^I select Tomorrow$")
    public void selectDayTomorrow() throws Throwable {
        trainlineHomepage.selectDayTomorrow();
    }

    @When("^I select Next Day$")
    public void selectDayNextDay() throws Throwable {
        trainlineHomepage.selectDayNextDay();
    }

    @When("^I select an outdate (\\d+) days in the future$")
    public void selectDaysInFuture(int arg1) throws Throwable {
        trainlineHomepage.pickFutureOutDate(arg1);
    }

    @When("^I select (\\d+) Adults$")
    public void selectAdults(int arg1) throws Throwable {
        trainlineHomepage.selectAdults(arg1);
    }

    @When ("^I select (\\d+) Children$")
    public void selectChildren(int arg1) throws Throwable {
        trainlineHomepage.selectChildren(arg1);
    }

    @Then ("^train times should be displayed for \"([^\"]*)\" and \"([^\"]*)\"$")
    public void confirmPassengerNumbers(String arg1, String arg2){
        timetablePage.confirmPassengerNumbers(arg1, arg2);
    }

}
