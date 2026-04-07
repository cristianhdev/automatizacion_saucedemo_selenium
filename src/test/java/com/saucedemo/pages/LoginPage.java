package com.saucedemo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class LoginPage extends BasePage{

    protected final By inputUserName = By.id("user-name");
    protected final By inputPassword = By.id("password");
    protected final By btnLogin = By.id("login-button");
    protected final By lblLockedUserLogin = By.xpath("//h3[contains(text(),'Epic sadface: Sorry, this user has been locked out.')]");

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void fillLoginForm(String user,String password){
        type(inputUserName,user);
        type(inputPassword,password);
        click(btnLogin);
    }


    public String getMessageLockedUser(){
        return getText(lblLockedUserLogin);
    }

}
