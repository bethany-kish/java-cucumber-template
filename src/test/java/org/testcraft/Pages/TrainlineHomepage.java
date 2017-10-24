package org.testcraft.Pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testcraft.stepDefs.Hooks;
import org.openqa.selenium.WebDriver;

public class TrainlineHomepage extends BasePage {

    public TrainlineHomepage(WebDriver driver) {
        super(driver);
    }

    public void open(){
        driver.get("https://www.thetrainline.com/");
    }

    public void confirmHomePage() {
        String title = driver.getTitle();
        Assert.assertTrue(title.contains("Trainline"));
    }

    public void selectJourney(String from, String to){
        WebElement fromField = driver.findElement(By.cssSelector("#originStation"));
        fromField.sendKeys(from);

        WebElement toField = driver.findElement(By.cssSelector("#destinationStation"));
        toField.sendKeys(to);
        toField.sendKeys(Keys.TAB);

    }

    public void clickGetTimes(){
        WebElement closeCookies = driver.findElement(By.cssSelector(".glyphicon-remove.is-alone"));
        closeCookies.click();
        driver.manage().window().maximize();
        WebElement getTimesButton = driver.findElement(By.cssSelector("#submitButton"));
        getTimesButton.click();

    }



    public void selectReturn() {
        WebElement returnRadio = driver.findElement(By.cssSelector("input#journey-type-return"));
        if(!(returnRadio.isSelected())){
            returnRadio.click();
        }

    }

    public void selectDayOptions(){
        WebElement tomorrow = driver.findElement(By.cssSelector("button.tomorrow"));
        tomorrow.click();

         WebElement nextDay = driver.findElement(By.cssSelector("button.next-day"));
         nextDay.click();
    }
}
