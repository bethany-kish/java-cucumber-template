package org.testcraft.Pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TimetablePage extends BasePage{

    public TimetablePage(WebDriver driver) {
        super(driver);
    }

    String passengersText;

    public void confirmTrainTimes(){
        Assert.assertTrue(driver.findElement(By.cssSelector("table.matrix-table.matrix-out")).isDisplayed());
    }

    public void confirmPassengerNumbers(String adults, String children){

       passengersText = (driver.findElement(By.cssSelector("#journeySummary > div > div.summary-container.container-fluid > div.row > div.col-xs-12.col-mob > div > div.col-xs-6.hidden-md.hidden-lg.small.passengers")).getText());
       System.out.println(passengersText);
       Assert.assertTrue(passengersText.contains(adults));
       Assert.assertTrue(passengersText.contains(children));
    }
}
