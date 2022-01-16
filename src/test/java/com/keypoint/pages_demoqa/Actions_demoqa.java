package com.keypoint.pages_demoqa;

import com.keypoint.utilities.BrowserUtils;
import com.keypoint.utilities.ConfigurationReader;
import com.keypoint.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

public class Actions_demoqa extends Locators_demoqa {

    public void demoqa_HomePage() {
        Driver.get().get(ConfigurationReader.get("url_demoqa"));
        closeAds_loc.click();
    }

    public void navigateToModule(String tab, String module) {

        String tabLocator = "//h5[text()='" + tab + "']";
        String moduleLocator = "//ul/li/span[text()='" + module + "']";

        try {
            BrowserUtils.waitForClickablility(By.xpath(tabLocator), 2);
            Driver.get().findElement(By.xpath(tabLocator)).click();

        } catch (Exception e) {
            BrowserUtils.clickWithWait(By.xpath(tabLocator), 2);
        }
        try {
            BrowserUtils.waitForPresenceOfElement(By.xpath(moduleLocator),5);
            BrowserUtils.waitForVisibility(By.xpath(moduleLocator), 2);
             BrowserUtils.scrollToElement(Driver.get().findElement(By.xpath(moduleLocator)));
            Driver.get().findElement(By.xpath(moduleLocator)).click();
            BrowserUtils.waitFor(2);
        } catch (Exception e) {
            BrowserUtils.clickWithTimeOut(Driver.get().findElement(By.xpath(moduleLocator)), 2);
        }
    }

    public void click_ClickMeButton(String name) {
        String clickMe_Button = "//button[@id='" + name + "']";
        if (name.equals("timerAlertButton")) {
            Driver.get().findElement(By.xpath(clickMe_Button)).click();
            BrowserUtils.waitFor(7);
        } else {
            Driver.get().findElement(By.xpath(clickMe_Button)).click();
            BrowserUtils.waitFor(3);
        }
    }

    public void isDisplayed_PopUpMessage(String message) {
        Alert alert = Driver.get().switchTo().alert();
        Assert.assertEquals("Failed", message, alert.getText());
    }

    public void isDisplayed_SelectedMessage() {
        Alert alert = Driver.get().switchTo().alert();
        alert.dismiss();
        selectedMessage_loc.isDisplayed();
    }

    public void isDisplayed_enterMessage() {
        Alert alert = Driver.get().switchTo().alert();
        alert.sendKeys("Jhon Doe");
        alert.accept();
        enteredMessage_loc.isDisplayed();
    }

    public void dragDropBox() {
        Actions actions = new Actions(Driver.get());
        actions.clickAndHold(draggable_loc).moveToElement(targetDropBox_loc).release(targetDropBox_loc).build().perform();

    }

    public void verify_DropBoxText(String message) {
        Assert.assertEquals("Failed", message, targetDropBox_loc.getText());
    }

    public void hover_ToolTipButton() {
        Actions actions = new Actions(Driver.get());
        actions.moveToElement(toolTipButton_loc).perform();
        BrowserUtils.waitFor(1);
    }

    public void hover_ToolTipTextField() {
        Actions actions = new Actions(Driver.get());
        actions.moveToElement(toolTipTextField_loc).perform();
        BrowserUtils.waitFor(1);
    }

    public void verify_ToolTipMessage(String message) {
        Assert.assertEquals("Failed", message, toolTipMessage_loc.getText());
        System.out.println("toolTipMessage_loc.getText() = " + toolTipMessage_loc.getText());
    }


}
