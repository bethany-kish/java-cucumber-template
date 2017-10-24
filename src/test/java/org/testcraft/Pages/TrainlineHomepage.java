package org.testcraft.Pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TrainlineHomepage {

    WebDriver driver = new ChromeDriver();

    public void open(){
        driver.get("https://www.thetrainline.com/");
    }

    public void selectJourney(String from, String to){
        WebElement fromField = driver.findElement(By.cssSelector("#originStation"));
        fromField.sendKeys(from);

        WebElement toField = driver.findElement(By.cssSelector("#destinationStation"));
        toField.sendKeys(to);

    }

    public void clickGetTimes(){
        WebElement getTimesButton = driver.findElement(By.cssSelector("#submitButton"));
        getTimesButton.click();

    }

    public void confirmTrainTimes(){
        Assert.assertTrue(driver.findElement(By.cssSelector("table.matrix-table.matrix-out")).isDisplayed());
    }
}
