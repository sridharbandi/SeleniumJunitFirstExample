package com.beanexpert.selenium;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JUnitExample {

    WebDriver driver;

    @BeforeEach
    public void setUp(){
        //Set the path of chromedriver. replace with chromedriver path
        System.setProperty("webdriver.chrome.driver", "./driver/chromedriver");
        //ChromeDriver instantiation
         driver = new ChromeDriver();
        //Maximizes the browser
        driver.manage().window().maximize();
    }

    @Test
    public void testGoogle(){
        //Open the URL
        driver.get("http://www.google.com/");
        //WebElement instantiation
        WebElement searchBox = driver.findElement(By.name("q"));
        //Type Selenium
        searchBox.sendKeys("Selenium");
        //Simulate Hit Keyboard Enter
        searchBox.submit();
    }

    @AfterEach
    public void tearDown(){
        //Close the browser
        driver.quit();

    }

}
