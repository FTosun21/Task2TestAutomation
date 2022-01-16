package com.keypoint.pages_saucedemo;

import com.keypoint.utilities.BrowserUtils;
import com.keypoint.utilities.ConfigurationReader;
import com.keypoint.utilities.Driver;
import org.junit.Assert;

public class Actions_saucedemo extends Locators_saucedemo{

    public void saucedemoLoginPage(){
        Driver.get().get(ConfigurationReader.get("url_saucedemo"));
    }
    public void login(String username,String password){
        username_loc.sendKeys(username);
        password_loc.sendKeys(password);
        loginButton_loc.click();

    }

    public void isDisplayed_HomepageTitle(){
        BrowserUtils.waitForPageToLoad(5);
        Assert.assertEquals("Failed","PRODUCTS",homePageTitle_loc.getText());
    }
   public void verify_errorMessage(String message){
       // BrowserUtils.waitFor(1);
       Assert.assertEquals("Failed",message,errorMessaje_loc.getText());
   }

}
