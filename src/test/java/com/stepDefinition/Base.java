package com.stepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Base {

    public static WebDriver driver;
    public static Properties prop;

    public static WebDriver getDriver() throws IOException {

        prop = new Properties();
        FileInputStream fis = new FileInputStream("C:\\Users\\manav\\CucumberJavaProjectOne\\src\\test\\java\\com\\stepDefinition\\global.properties");
        prop.load(fis);



        System.setProperty("webdriver.chrome.driver","C:\\Users\\manav\\OneDrive\\Desktop\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get(prop.getProperty("url"));
        return driver;
    }

}
