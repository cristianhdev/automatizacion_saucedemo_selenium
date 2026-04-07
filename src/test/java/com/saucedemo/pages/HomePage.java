package com.saucedemo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;



public class HomePage extends BasePage {

   protected final By lblTitleLogin = By.xpath("//div[contains(text(),'Swag Labs')]");
   protected final By lblTitleLogOut = By.xpath("//h4[contains(text(),'Accepted usernames are:')]");
   protected final By btnMenu = By.id("react-burger-menu-btn");
   protected final By lnkOptionLogOut = By.linkText("Logout");

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public String getTitleLogin(){
        return getText(lblTitleLogin);
    }

    public String getTitleLogOut(){
        return getText(lblTitleLogOut);
    }

    public void menuOptionUser(){
        click(btnMenu);
    }

    public void logOutUser(){
        click(lnkOptionLogOut);
    }

}
