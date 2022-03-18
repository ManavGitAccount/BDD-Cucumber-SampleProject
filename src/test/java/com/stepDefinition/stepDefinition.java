package com.stepDefinition;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;

public class stepDefinition {

    @Given("^User is on NetBanking landing page$")
    public void user_is_on_net_banking_landing_page() {
        System.out.println("User is on NewBanking landing page");
    }

    @When("^User logs into application with \"([^\"]*)\" and \"([^\"]*)\"$")
    public void user_logs_into_application_with_and(String string, String string2) {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("The username is : " + string);
        System.out.println("The password is : " + string2);
    }

    @Then("Home Page is populated")
    public void home_page_is_populated() {
        System.out.println("Home Page gets populated");
    }

    @And("^Cards displayed is \"([^\"]*)\"$")
    public void cards_displayed_is_something(String strArg1) throws Throwable {
        System.out.println("card displayed is: " + strArg1);
    }

    @When("^User sign up with the following details$")
    public void user_sign_up_with_the_following_details(DataTable dataTable) {
        List<List<String>> listObj = dataTable.asLists();
        System.out.println(listObj.get(0).get(0));
        System.out.println(listObj.get(0).get(1));
        System.out.println(listObj.get(0).get(2));
    }

    @When("^Another user logs into the application with (.+) and (.+)$")
    public void another_user_logs_into_the_application_with_and(String username, String password) throws Throwable {
        System.out.println(username);
        System.out.println(password);
    }

    @Given("^validate the browser$")
    public void validate_the_browser() throws Throwable {
        System.out.println("Validate the browser");
    }

    @When("^Browser is triggered$")
    public void browser_is_triggered() throws Throwable {
        System.out.println("Browser is triggered");
    }

    @Then("^check if browser has started$")
    public void check_if_browser_has_started() throws Throwable {
        System.out.println("Check if browser has started");
    }
}
