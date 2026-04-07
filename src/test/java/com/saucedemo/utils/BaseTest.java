package com.saucedemo.utils;



import com.saucedemo.pages.HomePage;
import com.saucedemo.pages.LoginPage;
import com.saucedemo.pages.ProductsPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

import static com.saucedemo.utils.Constanst.TIME_OUT_WAIT;
import static com.saucedemo.utils.Constanst.URLBASE;

public class BaseTest {

    public WebDriver driver;

    //Pages.

    protected LoginPage loginPage;
    protected HomePage homePage;
    protected ProductsPage productsPage;

    @BeforeMethod
    public void setup(){

        //Options configure
        ChromeOptions chromeOptions = new ChromeOptions();

        chromeOptions.addArguments("-save-mode");
        chromeOptions.addArguments("--ignore-certificate-errors");
        chromeOptions.addArguments("--allow-insecure-localhost");

        driver =  new ChromeDriver(chromeOptions);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TIME_OUT_WAIT));
        driver.get(URLBASE);

        String validateTitle = driver.getTitle();

        Assert.assertEquals(validateTitle, "Swag Labs", "titulo no encontrado");

        loginPage = new LoginPage(driver);
        homePage = new HomePage(driver);
        productsPage = new ProductsPage(driver);
    }

    @AfterMethod(alwaysRun = true)
    public  void tearDown(){
        if(driver != null){
            driver.quit();
        }
    }

}
