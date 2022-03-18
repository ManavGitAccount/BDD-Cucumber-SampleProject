package com.stepDefinition;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends Base{

    @Before("@MobileTest")
    public void beforeValidation(){
        System.out.println("Hooks Class runs this test before Mobile Test ");
    }

    @After("@MobileTest")
    public void afterValidation(){
        System.out.println("Hooks Class runs this test after Mobile Test ");
    }

    @After("@SeleniumTest")
    public void afterSeleniumValidation(){
        driver.close();
    }
}
