package org.testcraft.Pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testcraft.stepDefs.Hooks;
import org.openqa.selenium.WebDriver;

import java.util.Calendar;
import java.util.List;
import java.util.TimeZone;
import java.util.spi.CalendarDataProvider;

public class TrainlineHomepage extends BasePage {

    public TrainlineHomepage(WebDriver driver) {
        super(driver);
    }

    public Calendar dateToday;
    public Calendar plusDays;
    public Calendar datePlusDays;
    int dayInt;
    int monthInt;
    String dayString;

    public void open() {
        driver.get("https://www.thetrainline.com/");
    }

    public void confirmHomePage() {
        String title = driver.getTitle();
        Assert.assertTrue(title.contains("Trainline"));
    }

    public void selectJourney(String from, String to) {
        WebElement fromField = driver.findElement(By.cssSelector("#originStation"));
        fromField.sendKeys(from);

        WebElement toField = driver.findElement(By.cssSelector("#destinationStation"));
        toField.sendKeys(to);
        toField.sendKeys(Keys.TAB);

    }

    public void clickGetTimes() {
        WebElement closeCookies = driver.findElement(By.cssSelector(".glyphicon-remove.is-alone"));
        closeCookies.click();
        driver.manage().window().maximize();
        WebElement getTimesButton = driver.findElement(By.cssSelector("#submitButton"));
        getTimesButton.click();

    }


    public void selectReturn() {
        WebElement returnRadio = driver.findElement(By.cssSelector("input#journey-type-return"));
        if (!(returnRadio.isSelected())) {
            returnRadio.click();
        }

    }

    public void selectDayTomorrow() {
        WebElement tomorrow = driver.findElement(By.cssSelector("button.tomorrow"));
        tomorrow.click(); }

    public void selectDayNextDay() {
        WebElement nextDay = driver.findElement(By.cssSelector("button.next-day"));
        nextDay.click();
    }

    public Calendar getDateAddDays(int numberOfDays) {
        dateToday = Calendar.getInstance();
        dateToday.add(Calendar.DAY_OF_MONTH, numberOfDays);
        plusDays = dateToday;
        return plusDays;
    }


    public void pickFutureOutDate(int numberOfDays) {
        datePlusDays =  getDateAddDays(numberOfDays);
       dayInt = (datePlusDays.get(Calendar.DAY_OF_MONTH));
       monthInt = datePlusDays.get(Calendar.MONTH);
        String[] monthNames = {"January", "February", "March", "April", "May", "June", "July", "August", "September",
             "October", "November", "December"};

        driver.findElement(By.cssSelector("#outDate")).click();

       while(!driver.findElement(By.cssSelector(".ui-datepicker-title")).getText().contains(monthNames[monthInt])){
           driver.findElement(By.cssSelector(".ui-datepicker-next.ui-corner-all")).click();    //next button
       }

       dayString = Integer.toString(dayInt);

       driver.findElement(By.linkText(""+dayInt+"")).click();

    }

    public void selectAdults(int number){
        driver.findElement(By.cssSelector(".btn-default.btn-open")).click();
        Select adultDropdown = new Select(driver.findElement(By.cssSelector("#adults")));
        adultDropdown.selectByValue(Integer.toString(number));
    }

    public void selectChildren(int number){
        Select childrenDropdown = new Select(driver.findElement(By.cssSelector("#children")));
        childrenDropdown.selectByValue(Integer.toString(number));
    }






}
