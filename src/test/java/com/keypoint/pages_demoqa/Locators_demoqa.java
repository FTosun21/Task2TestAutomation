package com.keypoint.pages_demoqa;

import com.keypoint.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Locators_demoqa {
    public Locators_demoqa(){
        PageFactory.initElements(Driver.get(),this);
    }
    // PageFactory.initElements(driver, pageObjectClass) implicitly creates the findElement calls behind the scene.
    // PageFactory.initElements() only creates proxies for variables marked with annotations @FindBy,@FindAll

    /**
     * Background
     */
    @FindBy(css = "#close-fixedban")
    public WebElement closeAds_loc;

    /**
     * Alerts module-Alert
     */
    @FindBy(xpath = "//span[@id='confirmResult']")
    public WebElement selectedMessage_loc;
    @FindBy(xpath = "//span[@id='promptResult']")
    public WebElement enteredMessage_loc;

    /**
     * Interactions module- Drag & Drop
     */
    @FindBy(xpath = "//div[@id='draggable'][contains(@style,'position: relative;')]")
    public WebElement draggable_loc;

    @FindBy(xpath = "//div[@id='simpleDropContainer']/div[@id='droppable']")
    public WebElement targetDropBox_loc;

    /**
     *Widgets module- Hover over
     */
    @FindBy(xpath = "//button[@id='toolTipButton']")
    public WebElement toolTipButton_loc;

    @FindBy(xpath = "//input[@id='toolTipTextField']")
    public WebElement toolTipTextField_loc;

    @FindBy(xpath = "//div[@class='tooltip-inner']")
    public WebElement toolTipMessage_loc;




}
