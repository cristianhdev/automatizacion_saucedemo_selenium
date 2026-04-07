package com.saucedemo.pages;

import com.saucedemo.utils.RandomNumber;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

public class ProductsPage extends BasePage{


    protected final By btnProductsAddCard = By.xpath("//*[@class='pricebar']/button");
    protected final By lblPriceProducts = By.xpath("//*[@data-test='inventory-item-price']");
    protected final By btnCardShopping = By.xpath("//a[@data-test='shopping-cart-link']");
    protected final By inventoryItem = By.xpath("//*[@data-test='inventory-item']");

    protected final By selectFilterDataText = By.xpath("//*[@data-test='product-sort-container']");
    protected final By itemsProducts = By.xpath("//*[@data-test='inventory-item-name']");

    List<String> titlesItemsText = new ArrayList<String>();
    List<String> titlesItemsPrice = new ArrayList<String>();

    public ProductsPage(WebDriver driver) {
        super(driver);
    }

    public List<WebElement> getElements(By element){
        return find_elements(element);
    }

    public void selectProduct(){

        List<WebElement> bottonProducts = getElements(btnProductsAddCard);

        int randomPosition = RandomNumber.generateInt(bottonProducts.size()-1);

        WebElement buttonAddProduct =  bottonProducts.get(randomPosition);

        buttonAddProduct.click();
    }

    public void ClicShoppingCard(){
        click(btnCardShopping);
    }

    public void SelectItemFilterZA(String option){
        WebElement select = find(selectFilterDataText);
        select.click();
        Select selectItem = new Select(select);
        selectItem.selectByVisibleText(option);
    }



    public List<String> getTitlesProductsOriginal() {
        List<WebElement> titleItems = find_elements(itemsProducts);
        for( WebElement itemtitle:titleItems){
            titlesItemsText.add(itemtitle.getText());
        }
        return titlesItemsText;
    }

    public List<String> getPriceProductsOriginal() {
        List<WebElement> titleItemsPrice = find_elements(lblPriceProducts);
        for( WebElement itemPrice:titleItemsPrice){
            titlesItemsPrice.add(itemPrice.getText());
        }
        return titlesItemsPrice;
    }



    public void priceHighLow(){
        List<WebElement> LabelsPriceProducts = getElements(lblPriceProducts);
    }
}
