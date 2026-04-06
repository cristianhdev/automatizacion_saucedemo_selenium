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

   protected By lblTitleLogin = By.xpath("//div[contains(text(),'Swag Labs')]");
   protected By selectFilterDataText = By.xpath("//*[@data-test='product-sort-container']");
   protected By itemsProducts = By.xpath("//*[@data-test='inventory-item-name']");

    List<String> titlesItemsText = new ArrayList<String>();

    public HomePage(WebDriver driver) {
        super(driver);
    }


    public void SelectItemFilterZA(){
        WebElement select = find(selectFilterDataText);
        select.click();
        Select selectItem = new Select(select);
        selectItem.selectByVisibleText("Name (Z to A)");
    }

    public List<String> getTitlesProductsOriginal() {

        List<WebElement> titleItems = find_elements(itemsProducts);


        for( WebElement itemtitle:titleItems){
            titlesItemsText.add(itemtitle.getText());
        }

        return titlesItemsText;

    }


    public String getTitleLogin(){
        return getText(lblTitleLogin);
    }

}
