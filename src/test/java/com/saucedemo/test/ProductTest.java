package com.saucedemo.test;

import com.saucedemo.utils.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Collections;
import java.util.List;

public class ProductTest extends BaseTest {

    @Test( description = "Filter products by name", priority = 1)
    public void TestFilterNameAZ(){

        loginPage.fillLoginForm("standard_user", "secret_sauce");
        //Capturamos los textos en la posicion inicial
        List<String> originalTitles = productsPage.getTitlesProductsOriginal();
        //damos clic en el filtro de seleccion
        productsPage.SelectItemFilterZA("Name (Z to A)");
        Collections.sort(originalTitles,Collections.reverseOrder());
        List<String> actualTitlesByFilterZA = productsPage.getTitlesProductsOriginal();
        Assert.assertEquals(originalTitles,actualTitlesByFilterZA,"Filter order name no seleccionado");

    }

    @Test( description = "Filter products by price" , priority = 2)
    public void TestFilterPriceHighLow(){

        loginPage.fillLoginForm("standard_user", "secret_sauce");
        //Capturamos los textos en la posicion inicial
        List<String> pricesProductOriginal = productsPage.getPriceProductsOriginal();
        //damos clic en el filtro de seleccion
        productsPage.SelectItemFilterZA("Price (high to low)");
        Collections.sort(pricesProductOriginal,Collections.reverseOrder());
        List<String> actualPriceProductByFilter = productsPage.getPriceProductsOriginal();
        Assert.assertEquals(pricesProductOriginal,actualPriceProductByFilter,"Filter order precio no seleccionado");

    }

    @Test( description = "Add Product to Card", priority = 3)
    public void AddProductCardShoping(){
        loginPage.fillLoginForm("standard_user", "secret_sauce");

        Assert.assertEquals(homePage.getTitleLogin(),"Swag Labs","No se visualiza la pagína de login.");

        productsPage.selectProduct();
        productsPage.ClicShoppingCard();
    }
}
