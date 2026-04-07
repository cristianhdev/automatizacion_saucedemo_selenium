package com.saucedemo.pages;

import com.saucedemo.utils.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class HomePage extends BasePage {

   protected final By lblTitleLogin = By.xpath("//div[contains(text(),'Swag Labs')]");

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public String getTitleLogin(){
        return getText(lblTitleLogin);
    }

}
