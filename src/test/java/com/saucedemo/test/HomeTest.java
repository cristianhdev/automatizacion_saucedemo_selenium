package com.saucedemo.test;

import com.saucedemo.utils.BaseTest;
import com.saucedemo.utils.DataTest;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class HomeTest extends BaseTest {

    @Test(dataProvider = "dataLoginUserTest", dataProviderClass = DataTest.class, description = "LogOut User")
    public void logOutUserAcount(String user,String password){

        loginPage.fillLoginForm(user, password);

        Assert.assertEquals(homePage.getTitleLogin(),"Swag Labs","No se visualiza la pagína de login.");

        homePage.menuOptionUser();
        homePage.logOutUser();

        Assert.assertEquals(homePage.getTitleLogOut(),"Accepted usernames are:","No se visualiza la pagína de login.");
    }




}
