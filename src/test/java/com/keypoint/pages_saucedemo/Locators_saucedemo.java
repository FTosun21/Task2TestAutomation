package com.keypoint.pages_saucedemo;

import com.keypoint.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Locators_saucedemo {
    public Locators_saucedemo() {
        PageFactory.initElements(Driver.get(), this);  }
    // PageFactory.initElements(driver, pageObjectClass) implicitly creates the findElement calls behind the scene.
    // PageFactory.initElements() only creates proxies for variables marked with annotations @FindBy,@FindAll

    @FindBy(id = "user-name")
    public WebElement username_loc;

    @FindBy(id = "password")
    public WebElement password_loc;

    @FindBy(id = "login-button")
    public WebElement loginButton_loc;

    @FindBy(xpath = "//*[@id='header_container']/div[2]/span")
    public WebElement homePageTitle_loc;

    @FindBy(css = "h3")
    public WebElement errorMessaje_loc;



}
