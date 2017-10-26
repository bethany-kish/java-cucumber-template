package org.testcraft.Pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TimetablePage extends BasePage{

    public TimetablePage(WebDriver driver) {
        super(driver);
    }

    String numberOfAdults;
    String numberOfChildren;


    public void confirmTrainTimes(){
        Assert.assertTrue(driver.findElement(By.cssSelector("table.matrix-table.matrix-out")).isDisplayed());
    }

    public void confirmPassengerNumbers(String adults, String children){

       numberOfAdults = driver.findElement(By.cssSelector("div.matrix-subheader > span:nth-child(3)")).getText();
       numberOfChildren = driver.findElement(By.cssSelector("div.matrix-subheader > span:nth-child(4)")).getText();
       Assert.assertTrue(numberOfAdults.contains(adults));
       Assert.assertTrue(numberOfChildren.contains(children));
    }
}
