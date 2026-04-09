package com.saucedemo.utils;

import org.testng.annotations.DataProvider;

public class DataTest {

    @DataProvider(name="dataLoginUserTest")
    public Object[][] dataLogin(){
        return new Object[][]{
                new Object[]{"standard_user","secret_sauce"}
        };
    }
}
