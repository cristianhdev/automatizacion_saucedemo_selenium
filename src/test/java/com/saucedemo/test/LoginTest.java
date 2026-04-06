package com.saucedemo.test;

import com.saucedemo.utils.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    @Test(description = "Login Success", priority = 2)
    public void testLoginSuccess(){

        loginPage.fillLoginForm("standard_user", "secret_sauce");

        Assert.assertEquals(homePage.getTitleLogin(),"Swag Labs","No se visualiza la pagína de login.");

    }

    @Test(description = "Login User Locked", priority = 1)
    public void testLoginLocked(){

        loginPage.fillLoginForm("locked_out_user", "secret_sauce");

        Assert.assertEquals(loginPage.getMessageLockedUser(),"Epic sadface: Sorry, this user has been locked out.","No se visualiza el mensaje de bloqueo usuario");

    }

}
