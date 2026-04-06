package com.saucedemo.test;

import com.saucedemo.utils.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Collections;
import java.util.List;

public class HomeTest extends BaseTest {

    @Test
    public void TestFilterNameAZ(){


        loginPage.fillLoginForm("standard_user", "secret_sauce");

        //Capturamos los textos en la posicion inicial
        List<String> actualTitles = homePage.getTitlesProductsOriginal();

        //dammos clic en el filtro de seleccion
        homePage.SelectItemFilterZA();

        Collections.sort(actualTitles,Collections.reverseOrder());

        List<String> actualTitlesZA = homePage.getTitlesProductsOriginal();

        Assert.assertEquals(actualTitles,actualTitlesZA,"Filter order no funciona");


    }

}
