package org.testcraft.Pages;

import org.openqa.selenium.WebDriver;
import org.testcraft.stepDefs.Hooks;

class BasePage {

    WebDriver driver;

    BasePage(WebDriver driver) {
        this.driver = Hooks.driver;
    }
}
