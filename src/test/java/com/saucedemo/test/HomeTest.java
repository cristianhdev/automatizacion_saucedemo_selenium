package com.saucedemo.test;

import com.saucedemo.utils.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;


public class HomeTest extends BaseTest {

    @Test(description = "LogOut User")
    public void logOutUserAcount(){

        loginPage.fillLoginForm("standard_user", "secret_sauce");

        Assert.assertEquals(homePage.getTitleLogin(),"Swag Labs","No se visualiza la pagína de login.");

        homePage.menuOptionUser();
        homePage.logOutUser();

        Assert.assertEquals(homePage.getTitleLogOut(),"Accepted usernames are:","No se visualiza la pagína de login.");
    }

}
