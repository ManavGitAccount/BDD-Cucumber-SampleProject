package com.stepDefinition;


import io.cucumber.datatable.DataTable;
import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;
import org.junit.Assert;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageObjects.HomePage;


@RunWith(Cucumber.class)
public class seleniumStepDefinitions extends Base{

    HomePage home;

    @Given("^User is on GreenKart Landing page$")
    public void user_is_on_greenkart_landing_page() throws Throwable {
        driver = Base.getDriver();

    }

    @When("^User searches for \"([^\"]*)\" Vegetable$")
    public void user_searches_for_something_vegetable(String strArg1) throws Throwable {
        home = new HomePage(driver);
        home.getSearch().sendKeys(strArg1);
        Thread.sleep(3000);

    }

    @Then("^\"([^\"]*)\" is displayed$")
    public void something_is_displayed(String strArg1) throws Throwable {
        Assert.assertTrue(driver.findElement(By.cssSelector("h4.product-name")).getText().contains(strArg1));
    }

    @And("^Adds the item to the cart$")
    public void adds_the_item_to_the_cart() throws Throwable {
        driver.findElement(By.cssSelector("a.increment")).click();
        driver.findElement(By.xpath("//button[contains(text(),'ADD TO CART')]")).click();

    }

    @And("^User proceeds to Checkout page for purchase$")
    public void user_proceeds_to_checkout_page_for_purchase() throws Throwable {
        driver.findElement(By.xpath("//a[@class='cart-icon']//img[contains(@class,'')]")).click();
        driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();
    }

    @Then("^verify \"([^\"]*)\" item is displayed on the checkout page$")
    public void verify_something_item_is_displayed_on_the_checkout_page(String strArg1) throws Throwable {
        Assert.assertTrue(driver.findElement(By.cssSelector("p.product-name")).getText().contains(strArg1));
    }
}
